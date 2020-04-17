package eg.edu.alexu.csd.datastructure.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedBasedTest {
	LinkedBased test = new LinkedBased();
	
	@Test
	void testEnqueue() {
		test.enqueue(1);
		test.enqueue("l");
		assertEquals(1,test.head.element);
		assertEquals("l",test.tail.element);
	}

	@Test
	void testDequeue() {
		RuntimeException exception = assertThrows(RuntimeException.class, () ->test.dequeue());
		assertEquals("Empty Queue Exception",exception.getMessage());
		test.enqueue(1);
		test.enqueue("L");
		assertEquals(1,test.dequeue());
		assertEquals("L",test.dequeue());
		test.enqueue("first");
		assertEquals("first",test.dequeue());
	}
	
	@Test
	void testEmpty() {
		assertTrue(test.isEmpty());
		test.enqueue(1.2);
		test.enqueue("test");
		assertFalse(test.isEmpty());
	}
	
	@Test
	void testSize() {
		assertEquals(0,test.size());
		test.enqueue(12);
		test.enqueue("F");
		assertEquals(2,test.size());
	}
}
