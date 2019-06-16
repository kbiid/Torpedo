package fileio.deseralizer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

import fileio.Employee;
import fileio.Intern;

public class CSVDeSerializer extends DeSerializer {
	private List<String[]> data;

	public CSVDeSerializer() {
		data = new ArrayList<String[]>();
		setFileName("sawon-v1.csv");
		setFileNameIntern("sawon-v2.csv");
	}

	@Override
	public void deSelialization() {
		Employee emp = null;
		CSVReader reader = null;

		try {
			// UTF-8
			reader = new CSVReader(new InputStreamReader(new FileInputStream(getMakefile()), "EUC-KR"));
			readEmployee(emp, reader);
			setDataToEmployee();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			data.clear();
		}
	}

	@Override
	public void readEmployee(Employee emp, Object obj) {
		CSVReader reader = null;
		String[] s;

		if ((obj instanceof CSVReader)) {
			reader = (CSVReader) obj;
		}
		try {
			while ((s = reader.readNext()) != null) {
				data.add(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setDataToEmployee() {
		Employee emp = null;

		for (String[] str : data) {
			if (!Isintern(str)) {
				emp = new Employee(str[0], Integer.parseInt(str[1]), str[2], str[3], str[4]);
				getEmployeeList().add(emp);
			} else {
				emp = new Intern(str[0], Integer.parseInt(str[1]), str[2], str[3], str[4], Integer.parseInt(str[5]));
				getEmployeeList().add(emp);
			}
		}
	}

	public boolean Isintern(String[] str) {
		if (str.length > 5 && !str[5].equals("정직원")) {
			return true;
		} else {
			return false;
		}
	}
}
