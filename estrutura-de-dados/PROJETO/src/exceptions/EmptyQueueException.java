package exceptions;

public class EmptyQueueException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyQueueException()
	{
		super("Fila vazia!");
	}
	
}
