package doublylinkedlist;

public class Node {
	private Object data;
	private Node previousNode;
	private Node nextNode;

	public Node() {
		data = null;
		previousNode = null;
		nextNode = null;
	}

	public Node(Object data) {
		this.data = data;
		previousNode = null;
		nextNode = null;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setPreviousNode(Node prev) {
		this.previousNode = prev;
	}

	public Node getPreviousNode() {
		return previousNode;
	}

	public void setNextNode(Node next) {
		this.nextNode = next;
	}

	public Node getNextNode() {
		return nextNode;
	}
}
