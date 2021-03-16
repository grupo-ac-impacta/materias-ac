package ex08;

import java.util.EmptyStackException;

class ArrayQueue implements Queue{
	private static final int MAX= 20;
	private Object queue[]; // fila
	private int size;		// num. elementos
	private int first;		// primeiro da fila
	private int last;		// ultimo da fila
	private int cap;		// capacidade
	
	ArrayQueue() {			// construtor
		this(MAX);
	}
	ArrayQueue(int c) { //construtor
		cap = c;
		queue = new Object[cap];
		size = first = last = 0;
	}

	public boolean isEmpty() { return (size==0); }
	public boolean isFull() { return (size==cap); }
	public int size() { return size; }
	public Object peek() throws EmptyQueueException {
		if(isEmpty())
			throw new EmptyQueueException();
		return queue[first];
	}
	public Object remove() throws EmptyQueueException {
		if(isEmpty())
			throw new EmptyQueueException();
		Object r = queue[first];	// remove primeiro da fila
		first = (first + 1) % cap;
		size--;
		return r;
	}
	public void add(Object item) throws FullQueueException {
		if(isFull())
			throw new FullQueueException();
		queue[last] = item;
		last = (last + 1) % cap;
		size++;
	}
}
