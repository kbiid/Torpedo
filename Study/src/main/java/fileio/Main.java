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
		SerializerMaker.makeSerializer(args[0]);
		SerializerMaker.serializer.serializeEmployee();

		SerializerMaker.makeDeSerializer(args[0]);
		SerializerMaker.deserializer.deSerializeEmployee();
		SerializerMaker.deserializer.showEmployeeList();

		SerializerMaker.serializer.serializeWithIntern();
		SerializerMaker.deserializer.deSrializeWithIntern();
		SerializerMaker.deserializer.showEmployeeList();
	}
}
