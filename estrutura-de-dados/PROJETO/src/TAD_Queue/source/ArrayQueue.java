package TAD_Queue.source;

import exceptions.EmptyQueueException;
import exceptions.FullQueueException;
import interfaces.Queue;

public class ArrayQueue<E> implements Queue<E> {
	private static final int MAX = 20;
	private E queue[]; // fila
	private int size; // num. elementos
	private int first; // primeiro da fila
	private int last; // ultimo da fila
	private int cap; // capacidade

	public ArrayQueue() { // construtor
		this(MAX);
	}

	ArrayQueue(int c) { // construtor
		cap = c;
		queue = (E[]) new Object[cap];
		size = first = last = 0;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public boolean isFull() {
		return (size == cap);
	}

	public int size() {
		return size;
	}

	public E front() throws EmptyQueueException {
		if (isEmpty())
			throw new EmptyQueueException();
		return queue[first];
	}

	public E dequeue() throws EmptyQueueException {
		if (isEmpty())
			throw new EmptyQueueException();
		E r = queue[first]; // remove primeiro da fila
		queue[first] = null;
		first = (first + 1) % cap;
		size--;
		return r;
	}

	public void enqueue(E item) throws FullQueueException {
		if (isFull())
			throw new FullQueueException();
		queue[last] = item;
		last = (last + 1) % cap;
		size++;
	}

	public String toString() {
		String s;
		s = "[";
		for (int i = 0; i < queue.length; i++) {
			if (queue[i] != null) {
				s += queue[i];
				s += ", ";
			}
		}
		if (s.length() > 1)
			s = s.substring(0, s.length() - 2);
		return s + "]";
	}

	/*@Override
	public E front() throws EmptyQueueException {
		// TODO Auto-generated method stub
		return null;
	} */
}

