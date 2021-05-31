package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import TADFilaPrioridadeHeap.HeapPriorityQueue;

class HeapPriorityQueueTest_2 {

	@Test

	void test() {

		HeapPriorityQueue<Integer, String> P = new HeapPriorityQueue<Integer, String>();

		P.insert(5, "A");

		P.insert(4, "B");

		P.insert(7, "I");

		P.insert(1, "D");

		P.removeMin();

		P.insert(3, "J");

		P.insert(6, "L");

		P.removeMin();

		P.removeMin();

		P.insert(8, "G");

		P.removeMin();

		P.insert(2, "H");

		P.removeMin();

		P.removeMin();

		assertEquals("[null, [(7,I),1], [(8,G),2]]", P.toString());
	}

}
