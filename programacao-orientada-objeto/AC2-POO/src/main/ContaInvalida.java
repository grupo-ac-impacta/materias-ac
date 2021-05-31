package main;

@SuppressWarnings("serial")
public class ContaInvalida extends RuntimeException {
	public ContaInvalida(String err) {
		super(err);
	}
}