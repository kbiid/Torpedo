package fileio.deseralizer;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import fileio.Employee;

public class ByteDeSerializer extends DeSerializer {
	
	public ByteDeSerializer() {
		setFileName("sawon-v1.txt");
		setFileNameIntern("sawon-v2.txt");
	}
	
	@Override
	public void deSelialization() {
		if (!checkDir() || !checkFile()) {
			throw new NullPointerException("dirfile 변수가 NULL!");
		}
		Employee emp = null;
		FileInputStream fin = null;
		ObjectInputStream oin = null;

		try {
			fin = new FileInputStream(super.getMakefile());
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

	@Override
	public void readEmployee(Employee emp, Object obj) {
		ObjectInputStream oin = null;

		if ((obj instanceof ObjectInputStream)) {
			oin = (ObjectInputStream) obj;
		}
		try {
			while (true) {
				emp = (Employee) oin.readObject();
				addList(emp);
			}
		} catch (EOFException e) {
			return;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
