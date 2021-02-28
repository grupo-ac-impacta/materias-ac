package tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import subAc1.RecursiveMethods;

class Tests {

	@Test
	void recursiveFactorialTest() {
		assertEquals(3628800, RecursiveMethods.recursiveFactorial(10), "Should give as return 3628800");
	}

	@Test
	void linearSumTest() {
		int[] arr = { 5, 10, 3 };
		assertEquals(18, RecursiveMethods.linearSum(arr, arr.length), "Should give as return 18");
	}

	@Test
	void reverseArrayTest() {
		int[] arr = { 1, 2, 3, 4 };
		assertEquals("[4,3,2,1]", RecursiveMethods.reverseArray(arr, 0, arr.length - 1),
				"Should give as return [4,3,2,1]");
	}

	@Test
	void iterativeReverseArrayTest() {
		int[] arr = { 2, 3, 4, 5 };
		assertEquals("[5,4,3,2]", RecursiveMethods.iterativeReverseArray(arr, 0, arr.length - 1),
				"Should give as return [5,4,3,2]");
	}

	@Test
	void binarySumTest() {
		int[] arr = { 2, 4, 1, 3 };
		assertEquals(10, RecursiveMethods.binarySum(arr, 0, arr.length), "Should give as return 10");
	}

	@Test
	void binaryFibTest() {
		assertEquals(34, RecursiveMethods.binaryFib(9), "Should give as return 34");
	}

	@Test
	void linearFibTest() {
		int[] expectedArray = { 5, 3 };
		assertArrayEquals(expectedArray, RecursiveMethods.linearFib(5), "Should give as return { 5, 3 }");
	}

}
