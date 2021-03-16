package ex08;

import java.util.EmptyStackException;

public interface Queue<E> {
	
	public int size();

	public boolean isEmpty();

	public E top() throws EmptyQueueException;
	
	public E dequeue() throws EmptyStackException;
	
	public void enqueue(E elem);
	
}