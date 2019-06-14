package fileio;

import java.io.ObjectInputStream;

import fileio.deseralizer.ByteDeSerializer;
import fileio.deseralizer.DeSerializer;
import fileio.serializer.ByteSerializer;
import fileio.serializer.CVSSerializer;
import fileio.serializer.Serializer;

public class CheckArg {
	private Serializer serializer;
	private DeSerializer deserializer;

	public Serializer checkArgs(String str) {
		serializer = null;

		switch (str.toLowerCase()) {
		case "byte":
			serializer = new ByteSerializer();
			serializer.setFileName("sawon-v1.txt");
			serializer.setFileNameIntern("sawon-v2.txt");
			deserializer = new ByteDeSerializer();
			deserializer.setFileName("sawon-v1.txt");
			deserializer.setFileNameIntern("sawon-v2.txt");
			break;
		case "cvs":
			serializer = new CVSSerializer();
			serializer.setFileName("sawon-v1.cvs");
			serializer.setFileNameIntern("sawon-v2.cvs");
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

	public void checkNull(Serializer serializer) {
		if (serializer == null) {
			throw new NullPointerException("적절치 않은 문자 입력");
		}
	}
}
