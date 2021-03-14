package tadFilatest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import tadFila.QueueEmptyException;
import tadFila.Fila;


class FilaTest {

	Object o;
	static final Fila a = new Fila(1);

	@Test

	void test() throws QueueEmptyException {

		assertEquals("[]", a.toString(), "Fila vazia");

		a.insere(1);

		assertEquals("[1]", a.toString(), "Deve resultar [1]");

		a.insere(2);

		assertEquals("[1, 2]", a.toString(), "Deve resultar [1, 2]");

		assertEquals(1, a.retira(), "Deve resultar 1");

		assertEquals("[2]", a.toString(), "Deve resultar [2]");

		assertEquals(2, a.retira(), "Deve resultar 2");

		assertEquals("[]", a.toString(), "Deve resultar []");

		assertThrows(QueueEmptyException.class, () -> {
			a.retira();
		});

	}

}
