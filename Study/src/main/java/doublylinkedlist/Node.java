package doublylinkedlist;

public class Node {
	private Object data;
	private Node prev;
	private Node next;
	
	public Node() {
		data = null;
		prev = null;
		next = null;
	}
	
	public Node(Object data) {
		this.data = data;
		prev = null;
		next = null;
	}
	
	protected void setData(Object data) {
		this.data = data;
	}
	
	protected Object getData() {
		return data;
	}
	
	protected void setPrev(Node prev) {
		this.prev = prev;
	}
	
	protected Node getPrev() {
		return prev;
	}
	
	protected void setNext(Node next) {
		this.next = next;
	}
	
	protected Node getNext() {
		return next;
	}
}
