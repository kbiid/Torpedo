package stack;

public class StackNode {
	private Object data;
	private StackNode nextStackNode;

	public StackNode(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setNextStackNode(StackNode nextStackNode) {
		this.nextStackNode = nextStackNode;
	}

	public StackNode getNextStackNode() {
		return nextStackNode;
	}
}
