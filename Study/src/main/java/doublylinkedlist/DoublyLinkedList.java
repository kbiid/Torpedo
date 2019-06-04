package doublylinkedlist;

public class DoublyLinkedList {

	private Node head;
	private int size;

	public DoublyLinkedList() {
		head = new Node();
		size = 0;
	}

	protected void addFirst(Object data) {

		Node node = new Node(data);

		node.setNext(head.getNext());

		if (head.getNext() != null) {
			head.getNext().setPrev(node);
		} else {
			head.setPrev(node);
		}

		head.setNext(node);
		size++;

	}

	protected void addByIndex(int index, Object data) {

		if (index == 0) {
			addFirst(data);

			return;
		}

		Node prevNode = getNodeByIndex(index - 1);
		Node nextNode = prevNode.getNext();

		Node newNode = new Node(data);

		prevNode.setNext(newNode);

		newNode.setPrev(prevNode);
		newNode.setNext(nextNode);

		if (newNode.getNext() != null) {
			nextNode.setPrev(newNode);
		} else {
			head.setPrev(newNode);
		}

		size++;

	}

	protected void addLast(Object data) {

		Node node = new Node(data);

		node.setNext(head);

		if (head.getPrev() != null) {
			head.getPrev().setNext(node);
			node.setPrev(head.getPrev());
		} else {
			head.setNext(node);
			node.setPrev(head);
		}

		head.setPrev(node);

		size++;

	}

	protected Node getNodeByIndex(int index) {

		if (index < 0 || index > size)
			return null;

		Node node = head;

		if (index < (size / 2)) {
			for (int i = 0; i <= index; i++) {
				node = node.getNext();
			}
		} else {
			for (int i = size; i > index; i--) {
				node = node.getPrev();
			}
		}

		return node;
	}

	protected int getSize() {
		return size;
	}

	protected Node deleteFirst() {

		if (head.getNext() == null) {
			System.out.println("이 doublyLinkedList에는 노드가 존재하지 않습니다.");
			return null;
		}

		Node firstNode = getNodeByIndex(0);

		if (size == 1) {
			head.setNext(null);
			head.setPrev(null);
		} else {
			head.setNext(head.getNext().getNext());
			head.getNext().setPrev(head);
		}

		size--;

		return firstNode;

	}

	protected Node deleteByIndex(int index) {

		if (index < 0 || index >= size) {
			System.out.println("index 오류 입니다.");
			return null;
		} else if (index == 0) {
			return deleteFirst();
		}

		Node removeNode = getNodeByIndex(index);
		Node prev = removeNode.getPrev();
		Node next = removeNode.getNext();

		prev.setNext(next);

		if (next != null) {
			next.setPrev(prev);
		} else {
			head.setPrev(prev);
		}

		size--;

		return removeNode;
	}

	protected Node deleteLast() {

		if (size == 0) {
			System.out.println("비어있는 리스트 입니다.");
			return null;
		} else if (size == 1) {
			return deleteFirst();
		}

		Node removeNode = head.getPrev();
		Node previousNode = removeNode.getPrev();

		previousNode.setNext(head);
		head.setPrev(previousNode);

		size--;

		return removeNode;
	}

	protected String printDoublyLinkedList() {
		if (head.getNext() == null && head.getPrev() == null)
			return "[]";

		Node temp = head;
		String str = "[";

		while (temp.getNext() != null) {
			str += temp.getData() + ",";
			temp = temp.getNext();
		}

		str += temp.getData();

		return str + "]";

	}
}
