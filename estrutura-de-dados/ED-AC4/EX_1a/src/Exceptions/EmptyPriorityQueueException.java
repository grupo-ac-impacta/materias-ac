package Exceptions;

public class EmptyPriorityQueueException extends RuntimeException
{
	public EmptyPriorityQueueException()
	{
		super("Queue is empty.");
	}
	
}