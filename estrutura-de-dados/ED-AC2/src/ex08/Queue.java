package ex08;

import java.util.EmptyStackException;

public interface Queue<E> {
	
	public int size();

	public boolean isEmpty();

	public Object peek() throws EmptyQueueException;
	
	public Object remove() throws EmptyStackException;
	
	public void add(Object elem);
	
}