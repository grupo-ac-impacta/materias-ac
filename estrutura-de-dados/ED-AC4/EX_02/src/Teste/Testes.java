/*
 * insert(5, A) 5,A
insert(4, B) 4,B - 5,A
insert(7, I) 4,B - 5,A - 7,I
insert(1, D) 1,D - 4,B - 5,A - 7,I
removeMin( ) 4,B - 5,A - 7,I
insert(3, J) 3,J - 4,B - 5,A - 7,I
insert(6, L) 3,J - 4,B - 5,A - 6,L- 7,I
removeMin( ) 4,B - 5,A - 6,L- 7,I
removeMin( ) 5,A - 6,L- 7,I
insert(8, G) 5,A - 6,L- 7,I - 8,G
removeMin( ) 6,L- 7,I - 8,G
insert(2, H) 2,H - 6,L- 7,I - 8,G
removeMin() 6,L- 7,I - 8,G
removeMin() 7,I - 8,G
*/

package Teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

import Pessoa.Pessoa;

import Pessoa.PessoaComparator;
import TADFiladePrioridade.SortedListPriorityQueue;
import Exceptions.EmptyPriorityQueueException;
import Interface.Entry;

class SortedListPriorityQueueTest {

	@Test

	void teste_basico() {

		SortedListPriorityQueue<Integer, String> P = new SortedListPriorityQueue<Integer, String>();

		Entry<Integer, String> saida;

		saida = P.insert(5, "A");

		saida = P.insert(4, "B");
		
		saida = P.insert(7, "I");

		saida = P.insert(1, "D");

		saida = P.removeMin();
		
		saida = P.insert(3, "J");
		
		saida = P.insert(6, "L");
		
		saida = P.removeMin();
		
		saida = P.removeMin();
		
		saida = P.insert(8, "G");
	
		saida = P.removeMin();
		
		saida = P.insert(2, "H");

		saida = P.removeMin();
		
		saida = P.removeMin();	

		assertEquals("[(7,I), (8,G)]", P.toString());	
	}

}