package doublylinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestClass {

	// 노드가 있는가?
	@Test
	void test_node() {
		Node node = new Node();

		Assertions.assertNotNull(node);
	}

	// prev가 있는가?
	@Test
	void test_prev() {
		Node node = new Node();

		Assertions.assertEquals(null, node.getPrev());
	}

	// next가 있는가?
	@Test
	void test_next() {
		Node node = new Node();

		Assertions.assertEquals(null, node.getNext());
	}

	// 입력한 데이터가 보존되는가?
	@Test
	void test_nodeData() {
		Node node = new Node(1);

		Assertions.assertEquals(1, node.getData());
	}

	// doubly linkedlist가 존재하는가?
	@Test
	void test_doublylinkedlist() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		Assertions.assertNotNull(doublyLinkedList);
	}

	// doubly linkedlist에 노드가 처음부터 추가가 되는가?
	@Test
	void test_doublylinkedlistAddFirst() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		doublyLinkedList.addFirst(3);
		doublyLinkedList.addFirst(5);

		Assertions.assertEquals(5, doublyLinkedList.getNodeByIndex(0).getData());
	}

	// doubly linkedlist에 노드가 인덱스로 추가가 되는가?
	@Test
	void test_doublylinkedlistAddByIndex() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		doublyLinkedList.addByIndex(0, 3);
		doublyLinkedList.addByIndex(0, 5);
		doublyLinkedList.addByIndex(1, 4);
		doublyLinkedList.addByIndex(0, 1);
		doublyLinkedList.addByIndex(3, 6);

		Assertions.assertEquals(1, doublyLinkedList.getNodeByIndex(0).getData());
	}

	// doubly linkedlist에 노드가 인덱스로 추가가 되는가?
	@Test
	void test_doublylinkedlistAddLast() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		doublyLinkedList.addLast(5);
		doublyLinkedList.addLast(4);
		doublyLinkedList.addLast(3);
		doublyLinkedList.addLast(2);
		doublyLinkedList.addLast(1);

		Assertions.assertEquals(2, doublyLinkedList.getNodeByIndex(3).getData());
	}

	// doubly linkedlist에 맨 앞에 노드가 삭제가 되는가?
	@Test
	void test_doublylinkedlistDeleteFirst() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		doublyLinkedList.addFirst(1);
		doublyLinkedList.addFirst(2);
		doublyLinkedList.addFirst(3);
		doublyLinkedList.addFirst(4);
		doublyLinkedList.addFirst(5);

		doublyLinkedList.deleteFirst();

		Assertions.assertEquals(4, doublyLinkedList.getSize());
	}

	// doubly linkedlist를 인덱스로 삭제할 수 있는가?
	@Test
	void test_doublylinkedlistDeleteByIndex() {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		doublyLinkedList.addFirst(1);
		doublyLinkedList.addFirst(2);
		doublyLinkedList.addFirst(3);
		doublyLinkedList.addFirst(4);
		doublyLinkedList.addFirst(5);

		//doublyLinkedList.deleteByIndex(2);

		Assertions.assertEquals(4, doublyLinkedList.getNodeByIndex(2).getData());
	}

}
