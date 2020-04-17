package eg.edu.alexu.csd.datastructure.queue;

import java.lang.Exception;
import java.lang.Object;

public class LinkedBased implements IQueue,ILinkedBased{
	int size=0;
	public class Node{
		Object element;
		Node next;
	}
	Node head;
	Node tail;
	
	@Override
	public void enqueue(Object item) {
		Node node = new Node();
		node.element = item;
		node.next=null;
		if(size==0) {
			head=node;
		}else {
			tail.next=node;
		}
		tail=node;
		size++;
	}

	@Override
	public Object dequeue(){
		if(size==0) {
			throw new RuntimeException("Empty Queue Exception");
		}else {
			Object result = head.element;
			Node node = head.next;
			head.next=null;
			head=node;
			size--;
			return result;
		}
	}

	@Override
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}else {
			return false;	
		}
	}

	@Override
	public int size() {
		return size;
	}
	
}
