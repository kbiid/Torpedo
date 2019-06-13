package collectionframework.Map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put("삼십", 30);
		hashMap.put("십", 10);
		hashMap.put("사십", 40);
		hashMap.put("이십", 20);

		System.out.println("맵에 저장된 키들의 집합 : " + hashMap.keySet());
		System.out.println("------------------------------------");

		for (String key : hashMap.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, hashMap.get(key)));
		}
		System.out.println("------------------------------------");

		hashMap.remove("사십");

		Iterator<String> keys = hashMap.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("키 : %s, 값 : %s", key, hashMap.get(key)));
		}
		System.out.println("------------------------------------");

		hashMap.replace("이십", 200);

		for (String key : hashMap.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, hashMap.get(key)));
		}
		System.out.println("------------------------------------");

		System.out.println("맵의 크기 : " + hashMap.size());
	}
}
