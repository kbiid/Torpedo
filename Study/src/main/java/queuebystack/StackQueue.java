package queuebystack;

import stack.Stack;

public class StackQueue {

	private Stack rear;
	private Stack front;
	private int size;

	public StackQueue() {
		rear = new Stack();
		front = new Stack();
		size = 0;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(Object data) {
		rear.push(data);
		size++;
	}

	public int getSize() {
		return size;
	}

	public Object deQueue() {
		while (!rear.isEmpty()) {// rear Stack에 있는 데이터들을 front Stack에 다시 push해주는 과정
			front.push(rear.pop());
		}

		return front.pop();
	}

	public Object peek() {
		while (!rear.isEmpty()) {// rear Stack에 있는 데이터들을 front Stack에 다시 push해주는 과정
			front.push(rear.pop());
		}

		return front.peek().getData();
	}
}
