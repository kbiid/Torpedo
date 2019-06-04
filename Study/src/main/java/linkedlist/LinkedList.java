package linkedlist;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size = 0;

	protected void addFirstNode(Object data) {
		Node newNode = new Node(data);

		newNode.setNextNode(head);

		head = newNode;
		size++;

		if (head.getNextNode() == null)
			tail = head;
	}

	protected void addLastNode(Object data) {
		Node newNode = new Node(data);

		if (size == 0) {
			addFirstNode(data);
		} else {
			tail.setNextNode(newNode);

			tail = newNode;

			size++;
		}
	}

	protected Node getNodeByIndex(int index) {

		Node getNode = head;

		for (int i = 0; i < index; i++) {
			getNode = getNode.getNextNode();
		}

		return getNode;

	}

	protected void addNode(int index, Object data) {
		if (index == 0) {
			addFirstNode(data);
		} else {
			Node before_Node = getNodeByIndex(index - 1);
			Node index_Node = before_Node.getNextNode();
			Node newNode = new Node(data);

			before_Node.setNextNode(newNode);
			newNode.setNextNode(index_Node);

			size++;

			if (newNode.getNextNode() == null)
				tail = newNode;
		}
	}

	public String toString() {

		if (head == null)
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
	
	protected Object removeFirstNode() {
		
		Node temp = head;
		head = temp.getNextNode();
		
		Object returnData = temp.getData();
		temp = null;
		size--;
		
		return returnData;
	}
	
	protected Object remove(int index) {
		
		if(index == 0)
			return removeFirstNode();
		
		Node temp = getNodeByIndex(index - 1);
		
		Node deleteNode = temp.getNextNode();
		
		temp.setNextNode(temp.getNextNode().getNextNode());
		
		Object returnData = deleteNode.getData();
		
		if(deleteNode == tail)
			tail = temp;
		
		deleteNode = null;
		size--;
		
		return returnData;
	}
	
	protected int getLinkedListSize() {
		return size;
	}
	
	protected Object getIndexData(int index) {
		Node node = getNodeByIndex(index);
		
		return node.getData();
	}
	
	protected int getNodeIndex(Object data) {
		Node node = head;
		
		int index = 0;
		
		while(node.getData() != data) {
			node = node.getNextNode();
			index++;
			
			if(node == null)
				return -1;
		}
		
		return index;
	}
	
}
