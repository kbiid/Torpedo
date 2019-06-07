package stack;

public class Stack {
	private StackNode topNode;
	private int stackDepth;

	public Stack() {
		topNode = null;
		stackDepth = -1;
	}

	public void push(Object data) {
		StackNode stackNode = new StackNode(data);

		if (isEmpty()) {
			stackNode.setNextStackNode(null);
		} else {
			stackNode.setNextStackNode(topNode);
		}

		topNode = stackNode;
		stackDepth++;
	}

	public Object pop() {
		StackNode stackNode = topNode;
		if (stackNode == null) {
			return new NullPointerException("Error! stackNode is null.");
		}

		topNode = topNode.getNextStackNode();
		stackDepth--;

		return stackNode.getData();
	}

	public Object peek() {
		if (topNode == null) {
			return new NullPointerException("Error! stackNode is null.");
		}
		return topNode;
	}

	public boolean isEmpty() {
		if (stackDepth == -1) {
			return true;
		} else {
			return false;
		}
	}

	public int getStackDepth() {
		return stackDepth;
	}
}
