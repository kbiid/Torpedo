package fileio.deseralizer;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;

import fileio.Serialize;
import fileio.model.Employee;

public class ByteDeSerializer extends DeSerializer {
	public ByteDeSerializer() {
		setFileName("sawon-v1.txt");
		setFileNameIntern("sawon-v2.txt");
	}

	@Override
	public void deSelialize() {
		if (!checkDir() || !checkFile()) {
			throw new NullPointerException("dirfile 변수가 NULL!");
		}
		Employee emp = null;

		try (FileInputStream fin = new FileInputStream(super.getMakefile());
				ObjectInputStream oin = new ObjectInputStream(fin)) {
			readEmployee(emp, oin);
		} catch (IOException e) {
			Serialize.invalidFileLogger.error("ByteDeSerializer Exception : " + e);
		}
	}

	@Override
	public void readEmployee(Employee emp, Object obj) {
		ObjectInputStream oin = null;

		if ((obj instanceof ObjectInputStream)) {
			oin = (ObjectInputStream) obj;
		} else {
			try {
				throw new InvalidClassException("ObjectInputStream 클래스가 아님");
			} catch (InvalidClassException e) {
				Serialize.invalidFileLogger.error("ByteDeSerializer Exception : " + e);
			}
		}
		try {
			while (true) {
				emp = (Employee) oin.readObject();
				addList(emp);
			}
		} catch (EOFException e) {
			Serialize.invalidFileLogger.error("ByteDeSerializer Exception : " + e);
		} catch (IOException | ClassNotFoundException e) {
			Serialize.invalidFileLogger.error("ByteDeSerializer Exception : " + e);
		}
	}
}
