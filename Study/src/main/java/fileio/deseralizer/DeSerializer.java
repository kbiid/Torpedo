package fileio.deseralizer;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import fileio.Employee;
import fileio.Serialize;

public abstract class DeSerializer implements Serialize {
	private File dirfile;
	private File makefile;
	private ArrayList<Employee> employeeList;
	private String fileName = "sawon-v1.txt";
	private String fileNameIntern = "sawon-v2.txt";

	public DeSerializer() {
		dirfile = new File(DIR);
		setFileSawonPath();
		employeeList = new ArrayList<>();
	}

	public File getDirfile() {
		return dirfile;
	}

	public void setDirfile(File dirfile) {
		this.dirfile = dirfile;
	}

	public File getMakefile() {
		return makefile;
	}

	public void setMakefile(File makefile) {
		this.makefile = makefile;
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileNameIntern() {
		return fileNameIntern;
	}

	public void setFileNameIntern(String fileNameIntern) {
		this.fileNameIntern = fileNameIntern;
	}

	@Override
	public void setFileSawonPath() {
		makefile = new File(DIR + fileName);
	}

	@Override
	public void setFilePathIntern() {
		makefile = new File(DIR + fileNameIntern);
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

	public abstract void deSelialization();
	
	public abstract void readEmployee(Employee emp, ObjectInputStream oin);

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
