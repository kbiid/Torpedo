package fileio;

import fileio.deseralizer.ByteDeSerializer;
import fileio.deseralizer.CSVDeSerializer;
import fileio.deseralizer.DeSerializer;
import fileio.deseralizer.XMLDeSerializer;
import fileio.serializer.ByteSerializer;
import fileio.serializer.CSVSerializer;
import fileio.serializer.Serializer;
import fileio.serializer.XMLSerializer;

public class CheckArg {
	public static Serializer serializer;
	public static DeSerializer deserializer;

	public static void checkArgs(String str) {
		switch (str.toLowerCase()) {
		case "byte":
			serializer = new ByteSerializer();
			break;
		case "csv":
			serializer = new CSVSerializer();
			break;
		case "xml":
			serializer = new XMLSerializer();
			break;
		case "json":
			serializer = new ByteSerializer();
			break;
		default:
			throw new NullPointerException("적절치 않은 문자 입력");
		}
	}

	public static void checkArgsDeSerializer(String str) {
		switch (str.toLowerCase()) {
		case "byte":
			deserializer = new ByteDeSerializer();
			break;
		case "csv":
			deserializer = new CSVDeSerializer();
			break;
		case "xml":
			deserializer = new XMLDeSerializer();
			break;
		case "json":
			deserializer = new ByteDeSerializer();
			break;
		default:
			throw new NullPointerException("적절치 않은 문자 입력");
		}
	}
}
