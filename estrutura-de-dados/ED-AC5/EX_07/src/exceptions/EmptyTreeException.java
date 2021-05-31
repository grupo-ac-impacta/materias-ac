package exceptions;

public class EmptyTreeException extends RuntimeException
{
	public EmptyTreeException()
	{
		super("Tree is empty.");
	}
	
}