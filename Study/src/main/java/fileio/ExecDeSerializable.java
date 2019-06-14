package fileio;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ExecDeSerializable implements Serialize {
	private File dirfile;
	private File makefile;
	private ArrayList<Employee> employeeList;

	public ExecDeSerializable() {
		dirfile = new File(DIR);
		setFileSawonPath();
		employeeList = new ArrayList<>();
	}

	@Override
	public void setFileSawonPath() {
		makefile = new File(DIR + FILE_NAME);
	}

	@Override
	public void setFilePathIntern() {
		makefile = new File(DIR + FILE_NAME_INTERN);
	}

	public boolean checkDir() {
		if (dirfile == null || !dirfile.exists()) {
			return false;
		}
		return true;
	}

	public boolean checkFile() {
		if (makefile == null || !makefile.exists()) {
			return false;
		}
		return true;
	}

	public void deSelialization() {
		if (!checkDir() || !checkFile()) {
			throw new NullPointerException("dirfile 변수가 NULL!");
		}
		Employee emp = null;
		FileInputStream fin = null;
		ObjectInputStream oin = null;

		try {
			fin = new FileInputStream(makefile);
			oin = new ObjectInputStream(fin);
			readEmployee(emp, oin);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void readEmployee(Employee emp, ObjectInputStream oin){
		try {
			while (true) {
				emp = (Employee) oin.readObject();
				addList(emp);
			}
		} catch (EOFException e) {
//			e.printStackTrace();
			return;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void addList(Employee employee) {
		employeeList.add(employee);
	}

	public void showEmployeeList() {
		for (Employee employee : employeeList) {
			System.out.print(employee);
		}
		System.out.println("----------------------------------------------------------------------");
		employeeList.clear();
	}

}
