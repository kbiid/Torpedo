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
	
	protected void deleteFirst() {
		
		if(head.getNext() == null) 
			return;
		
		if(size == 1) {
			head.setNext(null);
			head.setPrev(null);
		}		
		else {
			head.setNext(head.getNext().getNext());
			head.getNext().setPrev(head);
		}
		
		size--;
		
	}

}
