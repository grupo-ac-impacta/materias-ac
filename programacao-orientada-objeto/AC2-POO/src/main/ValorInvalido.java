package main;

@SuppressWarnings("serial")
public class ValorInvalido extends RuntimeException {
	public ValorInvalido(String err) {
		super(err);
	}
}