package collectionframework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();

		arrList.add(40);
		arrList.add(20);
		arrList.add(30);
		arrList.add(10);

		for (int i : arrList) {
			System.out.println(i + "");
		}
		System.out.println("--------------------------------");

		arrList.remove(1);
		for (int i : arrList) {
			System.out.println(i + "");
		}
		System.out.println("--------------------------------");

		Collections.sort(arrList);

		Iterator<Integer> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		System.out.println("--------------------------------");

		arrList.set(0, 20);

		for (int i : arrList) {
			System.out.println(i + " ");
		}
		System.out.println("--------------------------------");

		System.out.println("ArrayList size : " + arrList.size());
	}
}
