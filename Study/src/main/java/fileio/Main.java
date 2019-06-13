package fileio;

import java.io.IOException;

/**
 * 프로그램 실행시키기 위한 메인 클래스
 * 
 * @author user
 *
 */
public class Main {
	public static final String DIR = "D:\\test\\";
	public static final String FILE_NAME = "saveInfo.dat";
	public static final String FILE_NAME_INTERN = "saveInfo2.dat";

	public static void main(String[] args) throws IOException {
		ExecSerializable serialize = new ExecSerializable();
		serialize.serializationNotIntern();
		
		ExecDeSerializable deserialize = new ExecDeSerializable();
		deserialize.deSelialization();
		deserialize.showEmployeeList();
		
	}
}
