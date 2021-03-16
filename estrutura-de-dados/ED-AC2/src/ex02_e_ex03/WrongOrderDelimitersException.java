package ex02_e_ex03;

@SuppressWarnings("serial")
public class WrongOrderDelimitersException extends RuntimeException {
	public WrongOrderDelimitersException(String err) {
		super(err);
	}
}