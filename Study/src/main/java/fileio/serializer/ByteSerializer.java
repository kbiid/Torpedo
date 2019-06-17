package fileio.serializer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectOutputStream;

import fileio.Employee;
import fileio.Main;

public class ByteSerializer extends Serializer {
	public ByteSerializer() {
		setFileName("sawon-v1.txt");
		setFileNameIntern("sawon-v2.txt");
	}

	@Override
	public void selialize() {
		checkAndMakeDir();
		makeFile();

		try (FileOutputStream fout = new FileOutputStream(super.getMakefile());
				ObjectOutputStream oout = new ObjectOutputStream(fout)) {
			writeEmployee(oout);
		} catch (Exception e) {
			Main.invalidFileLogger.error("ByteSerializer Exception : " + e);
		}
	}

	@Override
	protected void writeEmployee(Object obj) {
		if ((obj instanceof ObjectOutputStream)) {
			ObjectOutputStream oout = (ObjectOutputStream) obj;
			for (Employee employee : super.getEmployeeList()) {
				try {
					oout.writeObject(employee);
				} catch (IOException e) {
					Main.invalidFileLogger.error("ByteSerializer IOException : " + e);
				}
			}
		} else {
			try {
				throw new InvalidClassException("ObjectOutputStream 클래스가 아님");
			} catch (InvalidClassException e) {
				Main.invalidFileLogger.error("ByteSerializer InvalidClassException : " + e);
			}
		}
	}
}
