package tadFila;

public class N� {
	// Vari�veis de inst^ancia
	private Object item;
	private N� prox;
	// Construtores simples
	public N�() {
		this(null,null);
	}
	public N�(Object i, N� n) {
	item = i;
	prox = n;
	}
	// M�todos de acesso
	Object retItem() {
	return item;
	}
	N� retProx() {
	return prox;
	}
	// Modificadores
	void posItem(Object novoItem) {
	item = novoItem;
	}
	void posProx(N� novoN�) {
	prox = novoN�;
	}
}
