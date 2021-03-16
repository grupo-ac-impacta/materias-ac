package ex09;

public class EmptyQueueException extends RuntimeException
{
	public EmptyQueueException()
	{
		super("Queue is empty.");
	}
	
}
