package exceptions;

@SuppressWarnings("serial")
public class IndexOutOfBoundsException extends RuntimeException {
	public IndexOutOfBoundsException(String err) {
		super(err);
	}
}
