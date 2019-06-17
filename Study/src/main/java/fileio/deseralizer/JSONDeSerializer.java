package fileio.deseralizer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InvalidClassException;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import fileio.Employee;
import fileio.Intern;

public class JSONDeSerializer extends DeSerializer {
	public JSONDeSerializer() {
		setFileName("sawon-v1.json");
		setFileNameIntern("sawon-v2.json");
	}

	@Override
	public void deSelialization() {
		JsonParser parser = new JsonParser();

		try {
			Object obj = parser.parse(new FileReader(getMakefile()));
			Employee emp = null;
			JsonObject jsonObj = (JsonObject) obj;
			readEmployee(emp, jsonObj);
		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readEmployee(Employee emp, Object obj) {
		JsonObject jsonObj = null;

		if (obj instanceof JsonObject) {
			jsonObj = (JsonObject) obj;
		} else {
			try {
				throw new InvalidClassException("JsonObject가 아님");
			} catch (InvalidClassException e) {
				e.printStackTrace();
			}
		}
		JsonArray array = ((JsonArray) jsonObj.get("employee"));
		for (int i = 0; i < array.size(); i++) {
			JsonObject jobj = (JsonObject) array.get(i);
			String name = jobj.get("name").toString();
			int age = Integer.parseInt(jobj.get("age").toString());
			String phoneNumber = jobj.get("phoneNumber").toString();
			String department = jobj.get("department").toString();
			String email = jobj.get("email").toString();
			String term = jobj.get("term").toString();
			
			if (term.equals("\"정직원\"")) {
				emp = new Employee(name, age, phoneNumber, department, email);
			} else {
				emp = new Intern(name, age, phoneNumber, department, email, Integer.parseInt(term));
			}
			addList(emp);
		}
	}
}
