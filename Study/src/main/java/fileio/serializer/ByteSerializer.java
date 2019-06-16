package fileio.serializer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import fileio.Employee;

public class ByteSerializer extends Serializer {

	public ByteSerializer() {
		setFileName("sawon-v1.txt");
		setFileNameIntern("sawon-v2.txt");
	}

	// 직렬화 후 파일에 저장하는 메소드
	public void doSelialization() {
		makeDir();
		makeFile();

		try (FileOutputStream fout = new FileOutputStream(super.getMakefile());
				ObjectOutputStream oout = new ObjectOutputStream(fout)) {
			writeEmployee(oout);
		} catch (Exception e) {
			e.printStackTrace();
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
					e.printStackTrace();
				}
			}
		}
	}
}
