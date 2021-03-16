package ex08;

public class EmptyQueueException extends RuntimeException
{
	public EmptyQueueException()
	{
		super("Fila vazia!");
	}
	
}
