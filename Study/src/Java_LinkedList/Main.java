package Java_LinkedList;

public class Main {

	public static void main(String [] args) {
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.addLastNode(10);
		linkedList.addLastNode(20);
		linkedList.addLastNode(30);
		linkedList.addLastNode(40);
		
		System.out.println(linkedList.getNodeIndex(20));
		System.out.println(linkedList.getNodeIndex(10));
		System.out.println(linkedList.getNodeIndex(40));
	}
}
