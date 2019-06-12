package collectionframework.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(10);

		for (int i : treeSet) {
			System.out.println(i + " ");
		}
		System.out.println("----------------------------------------------");

		treeSet.remove(40);

		Iterator<Integer> iter = treeSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		System.out.println("----------------------------------------------");

		System.out.println("treeSet Size : " + treeSet.size());
		System.out.println("----------------------------------------------");

		System.out.println(treeSet.subSet(10, 20));
		System.out.println(treeSet.subSet(10, false, 20, true));
	}
}
