package Java_LinkedList;

public class Node {

	private Object data;
	private Node next_Node;
	
	public Node(Object data) {
		this.data = data;
	}
	
	public Node(int data, Node next_Node) {
		this.data = data;
		this.next_Node = next_Node;
	}
	
	protected void setData(Object data) {
		this.data = data;
	}
	
	protected Object getData() {
		return data;
	}
	
	protected void setNextNode(Node next_Node) {
		this.next_Node = next_Node;
	}
	
	protected Node getNextNode() {
		return next_Node;
	}
	
	protected void deleteNextNode() {
		this.next_Node = null;
	}
}
