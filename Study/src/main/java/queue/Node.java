package queue;

public class Node {
	private Object data;
	private Node previousNode;

	public Node(Object data) {
		this.data = data;
		previousNode = null;
	}

	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	public Node getPreviousNode() {
		return previousNode;
	}

	public Object getData() {
		return data;
	}

}
