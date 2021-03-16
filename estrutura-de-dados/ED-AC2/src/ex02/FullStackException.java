package ex02;

@SuppressWarnings("serial")
public class FullStackException extends RuntimeException {
	public FullStackException(String err) {
		super(err);
	}
}