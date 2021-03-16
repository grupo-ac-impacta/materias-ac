package ex08;

public class FullQueueException extends RuntimeException
{
	public FullQueueException()
	{
		super("Fila cheia!");
	}
	
}
