package tadPilhaLSE;

@SuppressWarnings("serial")
public class WrongOrderDelimitersException extends RuntimeException {
	public WrongOrderDelimitersException(String err) {
		super(err);
	}
}