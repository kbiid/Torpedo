package fileio;

import java.io.IOException;

/**
 * 프로그램 실행시키기 위한 메인 클래스
 * 
 * @author user
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		CheckArg.checkArgs(args[0]);
		CheckArg.serializer.serializationNotIntern();

		CheckArg.checkArgsDeSerializer(args[0]);
		CheckArg.deserializer.deSerializationNotIntern();
		CheckArg.deserializer.showEmployeeList();

		CheckArg.serializer.serializationIntern();

		CheckArg.deserializer.deSrializationIntern();
		CheckArg.deserializer.showEmployeeList();
	}
}
