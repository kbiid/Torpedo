package collectionframework.Map;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(30, "삼십");
		treeMap.put(10, "십");
		treeMap.put(40, "사십");
		treeMap.put(20, "이십");

		System.out.println("맵에 저장된 키들의 집합 : " + treeMap.keySet());
		System.out.println("---------------------------------------------------");

		for (Integer key : treeMap.keySet()) {
			System.out.println(String.format("키 : %s, 키 : %s", key, treeMap.get(key)));
		}
		System.out.println("---------------------------------------------------");

		treeMap.remove(40);

		Iterator<Integer> keys = treeMap.keySet().iterator();
		while (keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(String.format("키 : %s, 키 : %s", key, treeMap.get(key)));
		}
		System.out.println("---------------------------------------------------");

		treeMap.replace(20, "twenty");
		for (Integer key : treeMap.keySet()) {
			System.out.println(String.format("키 : %s, 키 : %s", key, treeMap.get(key)));
		}
		System.out.println("---------------------------------------------------");

		System.out.println("맵의 크기 : " + treeMap.size());
	}
}
