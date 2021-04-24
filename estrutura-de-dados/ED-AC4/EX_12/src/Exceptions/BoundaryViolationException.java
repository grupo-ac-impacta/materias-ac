package Exceptions;

public class BoundaryViolationException extends RuntimeException
{
	public BoundaryViolationException()
	{
		super("Queue is full.");
	}
	
}