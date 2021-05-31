package exceptions;

public class FullQueueException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FullQueueException()
	{
		super("Fila cheia!");
	}
	
}
