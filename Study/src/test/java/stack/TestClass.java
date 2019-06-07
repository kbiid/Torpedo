package stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestClass {

	// Stack 클래스가 존재하는가?
	@Test
	void test_StackClass() {
		Stack stack = new Stack();

		Assertions.assertNotNull(stack);
	}

	// isEmpty() 기능이 작동하는가?
	@Test
	void test_isEmpty() {
		Stack stack = new Stack();

		Assertions.assertTrue(stack.isEmpty());
	}

	// push 기능이 작동하는가?
	@Test
	void test_push() {
		Stack stack = new Stack();

		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(7);
		stack.push(6);

		Assertions.assertEquals(4, stack.getStackDepth());
	}

	// pop 기능이 작동하는가?
	@Test
	void test_pop() {
		Stack stack = new Stack();

		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(7);
		stack.push(6);

		Assertions.assertEquals(6, stack.pop());
	}

	// peek 기능이 작동하는가?
	@Test
	void test_peek() {
		Stack stack = new Stack();

		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(7);

		Assertions.assertEquals(7, stack.peek());
	}

}
