package eg.edu.alexu.csd.datastructure.queue;

public class ArrayBasedQueue implements IQueue , IArrayBased {
	int f;
	int r;
	final static int CAPACITY = 1000;
	int N;
	Object[] Q;
	
	public ArrayBasedQueue() {
		this(CAPACITY);
	}
	
	public ArrayBasedQueue(int capacity) {
		N = capacity;
		Q = new Object[N];
		f = 0;
		r = 0;
	}
	

	@Override
	public void enqueue(Object item) {
		if( size() == N-1 ) { 
			throw new RuntimeException("Queue is full");
		}
		Q[r] = item;
		r = (r+1)%N;
	}

	@Override
	public Object dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		Object temp = Q[f];
		Q[f]= null;
		f = (f+1)%N;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		return f == r;
	}

	@Override
	public int size() {
		return (N-f+r)%N;
	}
	
	public Object front() {
		Object front = Q[f];
		return front;
	}

}
