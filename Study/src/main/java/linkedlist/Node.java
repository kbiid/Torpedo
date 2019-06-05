package linkedlist;

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

	public void setData(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setNextNode(Node next_Node) {
		this.next_Node = next_Node;
	}

	public Node getNextNode() {
		return next_Node;
	}

	public void deleteNextNode() {
		this.next_Node = null;
	}
}
