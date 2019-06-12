package collectionframework.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hash1 = new HashSet<>();
		HashSet<String> hash2 = new HashSet<>();

		hash1.add("홍길동");
		hash1.add("이순신");
		System.out.println(hash1.add("임꺽정"));
		System.out.println(hash1.add("임꺽정"));
		System.out.println("----------------------------------------");

		for (String str : hash1) {
			System.out.println(str + " ");
		}
		System.out.println("----------------------------------------");

		hash2.add("임꺽정");
		hash2.add("홍길동");
		hash2.add("이순신");

		Iterator<String> iter = hash2.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		System.out.println("----------------------------------------");

		System.out.println("집합의 크기 : " + hash2.size());
	}
}
