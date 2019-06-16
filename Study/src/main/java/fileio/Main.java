package fileio;

import java.io.IOException;

import fileio.deseralizer.DeSerializer;
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
		Serializer serialize = check.checkArgs("csv");
		check.checkNull(serialize);
		serialize.serializationNotIntern();

		DeSerializer deSerialize = check.checkArgsDeSerializer("csv");
		check.checkNullDeSerializer(deSerialize);
		deSerialize.deSerializationNotIntern();
		deSerialize.showEmployeeList();

		serialize.serializationIntern();

		deSerialize.deSrializationIntern();
		deSerialize.showEmployeeList();
	}
}
