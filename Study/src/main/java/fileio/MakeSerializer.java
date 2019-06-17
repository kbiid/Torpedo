package fileio;

import fileio.deseralizer.ByteDeSerializer;
import fileio.deseralizer.CSVDeSerializer;
import fileio.deseralizer.DeSerializer;
import fileio.deseralizer.JSONDeSerializer;
import fileio.deseralizer.XMLDeSerializer;
import fileio.serializer.ByteSerializer;
import fileio.serializer.CSVSerializer;
import fileio.serializer.JSONSerializer;
import fileio.serializer.Serializer;
import fileio.serializer.XMLSerializer;

public class MakeSerializer {
	public static Serializer serializer;
	public static DeSerializer deserializer;

	public static void makeSerializer(String str) {
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
			serializer = new JSONSerializer();
			break;
		default:
			Main.invalidFileLogger.error("makeSerializer : 문자열 입력 오류");
			throw new NullPointerException("적절치 않은 문자 입력");
		}
	}

	public static void makeDeSerializer(String str) {
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
			deserializer = new JSONDeSerializer();
			break;
		default:
			Main.invalidFileLogger.error("makeDeSerializer : 문자열 입력 오류");
			throw new NullPointerException("적절치 않은 문자 입력");
		}
	}
}