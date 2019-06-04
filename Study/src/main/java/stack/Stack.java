package stack;

public class Stack {
	private StackNode topNode;
	private int stackDepth;

	public Stack() {
		topNode = null;
		stackDepth = -1;
	}

	protected void push(Object data) {

		StackNode stackNode = new StackNode(data);

		if (stackDepth == -1) {
			stackNode.setNextStackNode(null);
		} else {
			stackNode.setNextStackNode(topNode);
		}

		topNode = stackNode;

		stackDepth++;
	}

	protected Object pop() {

		StackNode stackNode = topNode;

		topNode = topNode.getNextStackNode();

		stackDepth--;

		return stackNode.getData();

	}

	protected StackNode peek() {

		return topNode;
	}

	protected boolean isEmpty() {
		if (stackDepth == -1)
			return true;
		else
			return false;
	}

	protected int getStackDepth() {
		return stackDepth;
	}
}
