package fileio;

import fileio.deseralizer.ByteDeSerializer;
import fileio.deseralizer.CSVDeSerializer;
import fileio.deseralizer.DeSerializer;
import fileio.serializer.ByteSerializer;
import fileio.serializer.CSVSerializer;
import fileio.serializer.Serializer;

public class CheckArg {
	private Serializer serializer;
	private DeSerializer deserializer;

	public Serializer checkArgs(String str) {
		serializer = null;

		switch (str.toLowerCase()) {
		case "byte":
			serializer = new ByteSerializer();
			break;
		case "csv":
			serializer = new CSVSerializer();
			break;
		case "xml":
			serializer = new ByteSerializer();
			serializer.setFileName("sawon-v1.xml");
			serializer.setFileNameIntern("sawon-v2.xml");
			break;
		case "json":
			serializer = new ByteSerializer();
			serializer.setFileName("sawon-v1.json");
			serializer.setFileNameIntern("sawon-v2.json");
			break;
		default:
			break;
		}
		return serializer;
	}

	public DeSerializer checkArgsDeSerializer(String str) {
		deserializer = null;

		switch (str.toLowerCase()) {
		case "byte":
			deserializer = new ByteDeSerializer();
			break;
		case "csv":
			deserializer = new CSVDeSerializer();
			break;
		case "xml":
			deserializer = new ByteDeSerializer();
			deserializer.setFileName("sawon-v1.xml");
			deserializer.setFileNameIntern("sawon-v2.xml");
			break;
		case "json":
			deserializer = new ByteDeSerializer();
			deserializer.setFileName("sawon-v1.json");
			deserializer.setFileNameIntern("sawon-v2.json");
			break;
		default:
			break;
		}

		return deserializer;
	}

	public void checkNull(Serializer serializer) {
		if (serializer == null) {
			throw new NullPointerException("적절치 않은 문자 입력");
		}
	}

	public void checkNullDeSerializer(DeSerializer deserializer) {
		if (deserializer == null) {
			throw new NullPointerException("적절치 않은 문자 입력");
		}
	}
}
