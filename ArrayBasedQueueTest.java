package eg.edu.alexu.csd.datastructure.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayBasedQueueTest {

	@Test
	void test() {
		ArrayBasedQueue q = new ArrayBasedQueue(6);
		assertEquals(true,q.isEmpty());
		assertEquals(0,q.size());
		Exception thrown1 = assertThrows(RuntimeException.class,()->q.dequeue());
		assertEquals("Queue is empty",thrown1.getMessage());
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		assertEquals(5,q.size());
		Exception thrown2=assertThrows(RuntimeException.class,() ->q.enqueue(6));
		assertEquals("Queue is full",thrown2.getMessage());
		assertEquals(1,q.dequeue());
		assertEquals(2,q.dequeue());
		assertEquals(3,q.dequeue());
		assertEquals(4,q.dequeue());
		assertEquals(5,q.dequeue());
		assertEquals(true,q.isEmpty());
		Exception thrown3 = assertThrows(RuntimeException.class,()->q.dequeue());
		assertEquals("Queue is empty",thrown3.getMessage());	
	}

}
