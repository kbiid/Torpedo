package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestClass {

	// Queue 객체가 존재하는가?
	@Test
	void test_queue() {
		Queue queue = new Queue();

		Assertions.assertNotNull(queue);
	}

	// isEmpty가 작동하는가?
	@Test
	void test_isEmpty() {
		Queue queue = new Queue();

		Assertions.assertTrue(queue.isEmpty());

	}

	// enQueue가 작동하는가?
	@Test
	void test_enQueue() {
		Queue queue = new Queue();

		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);

		Assertions.assertEquals(4, queue.getSize());

	}

	// deQueue가 작동하는가?
	@Test
	void test_deQueue() {
		Queue queue = new Queue();

		queue.enQueue(10);
		queue.enQueue(7);
		queue.enQueue(6);
		queue.enQueue(12);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);

		queue.deQueue();
		queue.deQueue();
		queue.deQueue();

		Assertions.assertEquals(12, queue.deQueue().getData());

	}

	// peek가 작동하는가?
	@Test
	void test_peek() {
		Queue queue = new Queue();

		queue.enQueue(7);
		queue.enQueue(6);
		queue.enQueue(12);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);

		Assertions.assertEquals(7, queue.peek().getData());

	}

}
