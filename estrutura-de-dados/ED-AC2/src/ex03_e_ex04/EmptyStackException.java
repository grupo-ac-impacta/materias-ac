package ex03_e_ex04;

@SuppressWarnings("serial")
public class EmptyStackException extends RuntimeException {
	public EmptyStackException(String err) {
		super(err);
	}
}