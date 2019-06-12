package collectionframework.List;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("넷");
		linkedList.add("둘");
		linkedList.add("셋");
		linkedList.add("하나");

		for (String str : linkedList) {
			System.out.println(str + " ");
		}
		System.out.println("----------------------------------------");

		linkedList.remove(1);
		for (String str : linkedList) {
			System.out.println(str + " ");
		}
		System.out.println("----------------------------------------");

		linkedList.set(2, "둘");
		for (String str : linkedList) {
			System.out.println(str + " ");
		}
		System.out.println("----------------------------------------");

		System.out.println("LinkedList Size : " + linkedList.size());
	}
}
