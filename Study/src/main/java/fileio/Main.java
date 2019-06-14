package fileio;

import java.io.IOException;

import fileio.serializer.Serializer;

/**
 * 프로그램 실행시키기 위한 메인 클래스
 * 
 * @author user
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		CheckArg check = new CheckArg();
		Serializer serialize = check.checkArgs("cvs");
		check.checkNull(serialize);
		serialize.serializationNotIntern();

//		DeSerializer deserialize = new DeSerializer();
//		deserialize.deSelialization();
//		deserialize.showEmployeeList();
//
//		serialize.setFilePathIntern();
//		serialize.serializationIntern();
//
//		deserialize.setFilePathIntern();
//		deserialize.deSelialization();
//		deserialize.showEmployeeList();
	}
}
