package queuebystack;

import stack.Stack;

/**
 * Stack 2개로 Queue를 구현한 클래스
 * 
 * @author user
 */
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
		if (!isFrontEmpty()) {
			dataRePushInRear();
		}

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

		dataRePushInRear();
		return front.pop();
	}

	public Object peek() {
		while (!rear.isEmpty()) {// rear Stack에 있는 데이터들을 front Stack에 다시 push해주는 과정
			front.push(rear.pop());
		}

		dataRePushInRear();
		return front.peek();
	}

	/**
	 * front Stack이 비어있지 않을 경우 rear Stack에 다시 데이터를 넣어주기 위한 메소드
	 */
	public void dataRePushInRear() {
		while (!front.isEmpty()) {
			rear.push(front.pop());
		}
	}

	public boolean isFrontEmpty() {
		if (front.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
