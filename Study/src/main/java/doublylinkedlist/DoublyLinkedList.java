package doublylinkedlist;

public class DoublyLinkedList {

	private Node head;
	private int size;

	public DoublyLinkedList() {
		head = new Node();
		size = 0;
	}

	public void addFirst(Object data) {
		Node node = new Node(data);

		node.setNextNode(head.getNextNode());

		if (head.getNextNode() != null) {
			head.getNextNode().setPreviousNode(node);
		} else {
			head.setPreviousNode(node);
		}

		head.setNextNode(node);
		size++;
	}

	public void addByIndex(int index, Object data) {
		if (index == 0) {
			addFirst(data);
			return;
		}

		Node previousNode = getNodeByIndex(index - 1);
		Node nextNode = previousNode.getNextNode();

		Node newNode = new Node(data);
		previousNode.setNextNode(newNode);

		newNode.setPreviousNode(previousNode);
		newNode.setNextNode(nextNode);

		if (newNode.getNextNode() != null) {
			nextNode.setPreviousNode(newNode);
		} else {
			head.setPreviousNode(newNode);
		}

		size++;
	}

	public void addLast(Object data) {
		Node node = new Node(data);
		node.setNextNode(head);

		if (head.getPreviousNode() != null) {
			head.getPreviousNode().setNextNode(node);
			node.setPreviousNode(head.getPreviousNode());
		} else {
			head.setNextNode(node);
			node.setPreviousNode(head);
		}

		head.setPreviousNode(node);

		size++;
	}

	public Node getNodeByIndex(int index) {
		if (index < 0 || index > size) {
			return null;
		}

		Node node = head;

		if (index < (size / 2)) {
			for (int i = 0; i <= index; i++) {
				node = node.getNextNode();
			}
		} else {
			for (int i = size; i > index; i--) {
				node = node.getPreviousNode();
			}
		}

		return node;
	}

	public int getSize() {
		return size;
	}

	public Node deleteFirst() {
		if (head.getNextNode() == null) {
			System.out.println("이 doublyLinkedList에는 노드가 존재하지 않습니다.");
			return null;
		}

		Node firstNode = getNodeByIndex(0);

		if (size == 1) {
			head.setNextNode(null);
			head.setPreviousNode(null);
		} else {
			head.setNextNode(head.getNextNode().getNextNode());
			head.getNextNode().setPreviousNode(head);
		}

		size--;

		return firstNode;
	}

	public Node deleteByIndex(int index) {
		if (index < 0 || index >= size) {
			System.out.println("index 오류 입니다.");
			return null;
		} else if (index == 0) {
			return deleteFirst();
		}

		Node removeNode = getNodeByIndex(index);
		Node prev = removeNode.getPreviousNode();
		Node next = removeNode.getNextNode();

		prev.setNextNode(next);

		if (next != null) {
			next.setPreviousNode(prev);
		} else {
			head.setPreviousNode(prev);
		}

		size--;

		return removeNode;
	}

	public Node deleteLast() {
		if (size == 0) {
			System.out.println("비어있는 리스트 입니다.");
			return null;
		} else if (size == 1) {
			return deleteFirst();
		}

		Node removeNode = head.getPreviousNode();
		Node previousNode = removeNode.getPreviousNode();

		previousNode.setNextNode(head);
		head.setPreviousNode(previousNode);

		size--;

		return removeNode;
	}

	public String printDoublyLinkedList() {
		if (head.getNextNode() == null && head.getPreviousNode() == null)
			return "[]";

		Node temp = head;
		String str = "[";

		while (temp.getNextNode() != null) {
			str += temp.getData() + ",";
			temp = temp.getNextNode();
		}

		str += temp.getData();

		return str + "]";
	}
}
