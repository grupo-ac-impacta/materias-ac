package exceptions;

public class InvalidPositionException extends RuntimeException
{
	public InvalidPositionException()
	{
		super("Invalid Position.");
	}
	
	public InvalidPositionException(String err)
	{
		super(err);
	}


}