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

	protected void setData(Object data) {
		this.data = data;
	}

	protected Object getData() {
		return data;
	}

	protected void setPreviousNode(Node prev) {
		this.previousNode = prev;
	}

	protected Node getPreviousNode() {
		return previousNode;
	}

	protected void setNextNode(Node next) {
		this.nextNode = next;
	}

	protected Node getNextNode() {
		return nextNode;
	}
}
