package tadFila;

public class QueueEmptyException extends RuntimeException
{
	public QueueEmptyException()
	{
		super("Fila esta vazia");
	}
	
}
