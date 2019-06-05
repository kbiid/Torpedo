package queue;

public class Node {
	private Object data;
	private Node previousNode;

	public Node(Object data) {
		this.data = data;
		previousNode = null;
	}

	protected void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	protected Node getPreviousNode() {
		return previousNode;
	}

	protected Object getData() {
		return data;
	}

}
