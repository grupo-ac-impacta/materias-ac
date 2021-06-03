package exceptions;

public class EmptyPriorityQueueException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyPriorityQueueException()
	{
		super("Fila de prioridade vazia!");
	}
	
}
