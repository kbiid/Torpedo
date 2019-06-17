package fileio.serializer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVWriter;

import fileio.Employee;
import fileio.Intern;

public class CSVSerializer extends Serializer {
	private List<String[]> data;
	private String[] strList;

	public CSVSerializer() {
		data = new ArrayList<String[]>();
		setFileName("sawon-v1.csv");
		setFileNameIntern("sawon-v2.csv");
	}

	public void setItemList() {
		strList = new String[6];

		for (int i = 0; i < getItemList().size(); i++) {
			strList[i] = getItemList().get(i);
		}
		data.add(strList);
	}

	public void setEmployeeData() {
		for (Employee emp : getEmployeeList()) {
			strList = new String[6];
			if (!isIntern(emp)) {
				strList[0] = emp.getName();
				strList[1] = Integer.toString(emp.getAge());
				strList[2] = emp.getPhoneNumber();
				strList[3] = emp.getDepartMent();
				strList[4] = emp.getEmail();
				strList[5] = "정직원";
			} else {
				strList[0] = emp.getName();
				strList[1] = Integer.toString(emp.getAge());
				strList[2] = emp.getPhoneNumber();
				strList[3] = emp.getDepartMent();
				strList[4] = emp.getEmail();
				strList[5] = Integer.toString(((Intern) emp).getTerm());
			}
			data.add(strList);
		}
	}

	public boolean isIntern(Employee emp) {
		if (emp instanceof Intern) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected void doSelialization() {
		makeDir();
		makeFile();
		data.clear();
		setEmployeeData();

		try (CSVWriter cw = new CSVWriter(new OutputStreamWriter(new FileOutputStream(getMakefile()), "EUC-KR"))) {
			writeEmployee(cw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void writeEmployee(Object obj) {
		if ((obj instanceof CSVWriter)) {
			CSVWriter cw = (CSVWriter) obj;
			Iterator<String[]> it = data.iterator();

			while (it.hasNext()) {
				String[] str = (String[]) it.next();
				cw.writeNext(str);
			}
		} else {
			try {
				throw new InvalidClassException("CSVWriter 클래스가 아님");
			} catch (InvalidClassException e) {
				e.printStackTrace();
			}
		}
	}
}
