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

	protected boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	protected int getSize() {
		return size;
	}

	protected void enQueue(Object data) {

		Node newNode = new Node(data);

		// 큐에 데이터가 없는 경우
		if (size == 0) {
			front = newNode;
			rear = newNode;
		}
		// 큐에 데이터가 이미 있는 경우
		else {
			rear.setPreviousNode(newNode);

			rear = newNode;
		}

		size++;
	}

	protected Node deQueue() {

		// 큐가 비어있는 경우
		if (size <= 0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}

		Node node;

		// 큐의 사이즈가 1인 경우
		if (size == 1) {
			node = front;

			rear = null;
			front = null;

		}
		// 큐에 데이터가 여러개 있는 경우
		else {
			node = front;

			front = front.getPreviousNode();
		}

		size--;

		return node;
	}

	protected Node peek() {

		return front;
	}

}
