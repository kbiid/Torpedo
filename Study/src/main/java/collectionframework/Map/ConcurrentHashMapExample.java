package collectionframework.Map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> conHashMap = new ConcurrentHashMap<>();

		conHashMap.put("key", 0);

		try {
			conHashMap.put("key1", null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			conHashMap.put(null, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		conHashMap.putIfAbsent("key", 1);

		conHashMap.putIfAbsent("key2", -1);

		for (String str : conHashMap.keySet()) {
			System.out.println(conHashMap.get(str));
		}
	}
}
