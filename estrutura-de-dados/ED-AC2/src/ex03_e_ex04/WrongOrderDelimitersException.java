package ex03_e_ex04;

@SuppressWarnings("serial")
public class WrongOrderDelimitersException extends RuntimeException {
	public WrongOrderDelimitersException(String err) {
		super(err);
	}
}