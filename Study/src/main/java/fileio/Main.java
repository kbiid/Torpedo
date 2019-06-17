package fileio;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 프로그램 실행시키기 위한 메인 클래스
 * 
 * @author user
 *
 */
public class Main {
	public static final Logger invalidFileLogger = LoggerFactory.getLogger("log.invalid");

	public static void main(String[] args) throws IOException {
//		Logger logger = LoggerFactory.getLogger(Main.class);
		MakeSerializer.makeSerializer(args[0]);
		MakeSerializer.serializer.serializeEmployee();

		MakeSerializer.makeDeSerializer(args[0]);
		MakeSerializer.deserializer.deSerializeEmployee();

		MakeSerializer.serializer.serializeWithIntern();
		MakeSerializer.deserializer.deSrializeWithIntern();
	}
}
