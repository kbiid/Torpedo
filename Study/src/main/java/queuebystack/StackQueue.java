package queuebystack;

public class StackQueue {

	private Stack rear;
	private Stack front;
	private int size;

	public StackQueue() {
		rear = new Stack();
		front = new Stack();
		size = 0;
	}

	protected boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	protected void enQueue(Object data) {

		rear.push(data);

		size++;
	}

	protected int getSize() {
		return size;
	}

	protected Object deQueue() {

		// rear Stack에 있는 데이터들을 front Stack에 다시 push해주는 과정
		while (!rear.isEmpty()) {
			front.push(rear.pop());
		}

		return front.pop();

	}

	protected Object peek() {
		
		// rear Stack에 있는 데이터들을 front Stack에 다시 push해주는 과정
		while (!rear.isEmpty()) {
			front.push(rear.pop());
		}

		return front.peek().getData();
	}
}
