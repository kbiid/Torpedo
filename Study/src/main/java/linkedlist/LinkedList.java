package linkedlist;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		head = new Node(null);
		tail = new Node(null);
		size = 0;
	}

	public void addFirstNode(Object data) {
		nullData(data);
		Node newNode = new Node(data);
		newNode.setNextNode(head);

		head = newNode;
		size++;
		if (head.getNextNode() == null) {
			head.setNextNode(tail);
		}
	}

	public void addLastNode(Object data) {
		nullData(data);
		Node newNode = new Node(data);

		if (isEmpty()) {
			addFirstNode(data);
		} else {
			tail.setNextNode(newNode);
			tail = newNode;
			size++;
		}
	}

	public void nullData(Object data) {
		if (data == null) {
			throw new NullPointerException("data is NUll");
		}
	}

	public Node getNodeByIndex(int index) {
		if (!isRightIndex(index)) {
			throw new IndexOutOfBoundsException("index Error");
		}
		Node getNode = head;
		for (int i = 0; i < index; i++) {
			getNode = getNode.getNextNode();
		}
		return getNode;
	}

	public boolean isRightIndex(int index) {
		if (index < 0 || index > size) {
			return false;
		} else {
			return true;
		}
	}

	public void addNode(int index, Object data) {
		if (index == 0) {
			addFirstNode(data);
		} else {
			Node before_Node = getNodeByIndex(index - 1);
			Node index_Node = before_Node.getNextNode();
			if (index_Node == null) {
				throw new NullPointerException("node is null");
			}
			Node newNode = new Node(data);

			before_Node.setNextNode(newNode);
			newNode.setNextNode(index_Node);

			size++;
			if (newNode.getNextNode() == null) {
				tail = newNode;
			}
		}
	}

	public String toString() {
		if (head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";

		while (temp.getNextNode() != null) {
			str += temp.getData() + ",";
			temp = temp.getNextNode();
		}
		str += temp.getData();
		return str + "]";
	}

	public Object removeFirstNode() {
		if (isEmpty()) {
			throw new NullPointerException("LinkedList is Empty!!");
		}
		Node temp = head;
		head = temp.getNextNode();

		Object returnData = temp.getData();
		temp = null;
		size--;

		return returnData;
	}

	public Object remove(int index) {
		if (index == 0) {
			return removeFirstNode();
		}
		Node temp = getNodeByIndex(index - 1);
		Node deleteNode = temp.getNextNode();
		temp.setNextNode(temp.getNextNode().getNextNode());

		Object returnData = deleteNode.getData();
		if (deleteNode == tail) {
			tail = temp;
		}
		deleteNode = null;
		size--;

		return returnData;
	}

	public int getLinkedListSize() {
		return size;
	}

	public Object getIndexData(int index) {
		Node node = getNodeByIndex(index);
		return node.getData();
	}

	public int getNodeIndex(Object data) {
		Node node = head;
		int index = 0;

		while (node.getData() != data) {
			node = node.getNextNode();
			index++;

			if (node == null) {
				return -1;
			}
		}
		return index;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}
}
