package fileio.serializer;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;

import fileio.Employee;
import fileio.Intern;

public class CVSSerializer extends Serializer {
	@Override
	protected void doSelialization() {
		makeDir();
		makeFile();
		BufferedWriter fw = null;

		try {
			fw = new BufferedWriter(new FileWriter(getMakefile(), true));
			writeEmployee(fw);
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void writeEmployee(Object obj) {
		if ((obj instanceof BufferedWriter)) {
			BufferedWriter fw = (BufferedWriter) obj;
			Charset.forName("UTF-8");

			try {
				for (String str : getItemList()) {
					if (!str.equals("계약기간")) {
						fw.write(str + ", ");
					} else {
						fw.write(str);
					}
				}
				fw.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			try {
				for (Employee employee : super.getEmployeeList()) {
					if (!(employee instanceof Intern)) {
						fw.write(employee.getName() + ", ");
						fw.write(employee.getAge() + ", ");
						fw.write(employee.getPhoneNumber() + ", ");
						fw.write(employee.getDepartMent() + ", ");
						fw.write(employee.getEmail() + ", ");
						fw.write("정직원");
					} else {
						Intern intern = (Intern) employee;
						fw.write(intern.getName() + ", ");
						fw.write(intern.getAge() + ", ");
						fw.write(intern.getPhoneNumber() + ", ");
						fw.write(intern.getDepartMent() + ", ");
						fw.write(intern.getEmail() + ", ");
						fw.write(intern.getTerm());
					}
					fw.newLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
