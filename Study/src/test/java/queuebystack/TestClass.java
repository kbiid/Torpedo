package queuebystack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestClass {

	// stackQueue가 존재하는가?
	@Test
	void test() {
		StackQueue stackQueue = new StackQueue();

		Assertions.assertNotNull(stackQueue);
	}

	// isEmpty가 작동하는가?
	@Test
	void test_isEmpty() {
		StackQueue stackQueue = new StackQueue();

		Assertions.assertTrue(stackQueue.isEmpty());
	}

	// enQueue가 작동하는가?
	@Test
	void test_enQueue() {
		StackQueue stackQueue = new StackQueue();

		stackQueue.enQueue(1);
		stackQueue.enQueue(2);
		stackQueue.enQueue(3);
		stackQueue.enQueue(4);
		stackQueue.enQueue(5);

		Assertions.assertEquals(5, stackQueue.getSize());
	}

	// deQueue가 작동하는가?
	@Test
	void test_deQueue() {
		StackQueue stackQueue = new StackQueue();

		stackQueue.enQueue(2);
		stackQueue.enQueue(3);
		stackQueue.enQueue(4);
		stackQueue.enQueue(5);

		Assertions.assertEquals(2, stackQueue.deQueue());
	}

	// peek가 작동하는가?
	@Test
	void test_peek() {
		StackQueue stackQueue = new StackQueue();

		stackQueue.enQueue(2);
		stackQueue.enQueue(3);
		stackQueue.enQueue(4);
		stackQueue.enQueue(5);

		Assertions.assertEquals(2, stackQueue.peek());
	}
}
