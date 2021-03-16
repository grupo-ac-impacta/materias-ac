package ex02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayStackTest {
	static final ArrayStack<Integer> a = new ArrayStack<Integer>(3);
	static final ArrayStack<String> s = new ArrayStack<String>(3);
	
	@Test
	void pilhaString() {
		s.push("Leandro");
		assertEquals("[Leandro]", s.toString(), "Deve imprimir [Leandro]");
		
		s.push("Matheus");
		assertEquals("[Leandro, Matheus]", s.toString(), "Deve imprimir [Leandro, Matheus]");

		s.push("Luiz");
		assertEquals("[Leandro, Matheus, Luiz]", s.toString(), "Deve imprimir [Leandro, Matheus, Luiz]");

		Assertions.assertThrows(FullStackException.class, () -> {
			s.push("Danyllo");
		});

		assertEquals("Luiz", s.pop(), "Deve ter desempilhado Luiz");
		assertEquals("[Leandro, Matheus]", s.toString(), "Deve imprimir [Leandro, Matheus]");
		assertEquals("Matheus", s.pop(), "Deve ter desempilhado Matheus");
		assertEquals("[Leandro]", s.toString(), "Deve imprimir [Leandro]");
		assertEquals("Leandro", s.pop(), "Deve ter desempilhado Leandro");
		assertEquals("[]", s.toString(), "Deve imprimir []");
		
		assertTrue(s.isEmpty());
		
		Assertions.assertThrows(EmptyStackException.class, () -> {
			s.pop();
		});
	}
	
	@Test
	void pilhaInteiros() {
		a.push(7);
		assertEquals("[7]", a.toString(), "Deve imprimir [7]");
		
		a.push(9);
		assertEquals("[7, 9]", a.toString(), "Deve imprimir [7, 9]");

		a.push(1);
		assertEquals("[7, 9, 1]", a.toString(), "Deve imprimir [7, 9, 1]");

		Assertions.assertThrows(FullStackException.class, () -> {
			a.push(2);
		});

		assertEquals(1, a.pop(), "Deve ter desempilhado 1");
		assertEquals("[7, 9]", a.toString(), "Deve imprimir [7, 9]");
		assertEquals(9, a.pop(), "Deve ter desempilhado 9");
		assertEquals("[7]", a.toString(), "Deve imprimir [7]");
		assertEquals(7, a.pop(), "Deve ter desempilhado 7");
		assertEquals("[]", a.toString(), "Deve imprimir []");
		
		assertTrue(a.isEmpty());
		
		Assertions.assertThrows(EmptyStackException.class, () -> {
			a.pop();
		});
	}
}