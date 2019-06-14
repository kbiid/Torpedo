package fileio.deseralizer;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import fileio.Employee;

public class ByteDeSerializer extends DeSerializer{
	@Override
	public void deSelialization() {
		if (!checkDir() || !checkFile()) {
			throw new NullPointerException("dirfile 변수가 NULL!");
		}
		Employee emp = null;
		FileInputStream fin = null;
		ObjectInputStream oin = null;

//		try {
//			fin = new FileInputStream(makefile);
//			oin = new ObjectInputStream(fin);
//			readEmployee(emp, oin);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fin.close();
//				oin.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
	}

	@Override
	public void readEmployee(Employee emp, ObjectInputStream oin) {
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

}
