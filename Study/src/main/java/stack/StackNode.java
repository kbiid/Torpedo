package stack;

public class StackNode {
	private Object data;
	private StackNode nextStackNode;

	public StackNode(Object data) {
		this.data = data;
	}

	protected Object getData() {
		return data;
	}

	protected void setNextStackNode(StackNode nextStackNode) {
		this.nextStackNode = nextStackNode;
	}

	protected StackNode getNextStackNode() {
		return nextStackNode;
	}
}
