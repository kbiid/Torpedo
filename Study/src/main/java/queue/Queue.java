package queue;

public class Queue {
	private Node front;
	private Node rear;
	private int size;

	public Queue() {
		front = null;
		rear = null;
		size = 0;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getSize() {
		return size;
	}

	public void enQueue(Object data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.setPreviousNode(newNode);
			rear = newNode;
		}
		size++;
	}

	public Object deQueue() {
		if (isEmpty()) {
			return new NullPointerException("Queue is Empty");
		}
		Node node;

		if (getSize() == 1) {
			node = front;
			rear = null;
			front = null;
		} else {
			node = front;
			front = front.getPreviousNode();
		}
		size--;

		return node.getData();
	}

	public Object peek() {
		if (isEmpty()) {
			return new NullPointerException("Queue is Empty");
		}

		return front.getData();
	}
}
