package stack;

/**
 * Stack에 들어갈 정보를 보관하기 위한 Node Class
 * 
 * @author user
 */
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
