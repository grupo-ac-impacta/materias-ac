package subAc1;
//import java.util.ArrayList;

public class RecursiveMethods {
	public static String toString(int[] arr) {
		String result = "[";
		for (int value : arr) {
			result += String.valueOf(value) + ",";
		}
		result = result.substring(0, result.length() - 1);

		return result + "]";
	}

//	public static int[] stringToArr(String arr) {
//		String[] arrString = arr.split(",");
//		int index = 0;
//		arrString.toArray().remove(i);
//	}

	public static int recursiveFactorial(int n) {
		if (n == 0) // caso base
			return 1;
		return n * recursiveFactorial(n - 1); // caso recursivo
	}

	// A: arranjo inteiro, n: >= 1 e tamanho mínimo de A
	public static int linearSum(int[] A, int n) {
		if (n == 1)
			return A[0];

		return linearSum(A, n - 1) + A[n - 1];
	}

	// A: arranjo inteiro, i, j: >= 1
	public static String reverseArray(int[] A, int i, int j) {
		if (i < j) {
			int aux = A[i];
			A[i] = A[j];
			A[j] = aux;
			reverseArray(A, i + 1, j - 1);
		}

		return RecursiveMethods.toString(A);
	}

	// A: arranjo inteiro, i, j: >= 1
	public static String iterativeReverseArray(int[] A, int i, int j) {
		while (i < j) {
			int aux = A[i];
			A[i] = A[j];
			A[j] = aux;
			i++;
			j--;
			return iterativeReverseArray(A, i, j);
		}
		return RecursiveMethods.toString(A);
	}

	// A: arranjo inteiro, i: 0, n: length de A
	public static int binarySum(int[] A, int i, int n) {
		if (n == 1)
			return A[i];

		return binarySum(A, i, Math.round(n / 2)) + binarySum(A, i + Math.round(n / 2), (int) Math.floor(n / 2));
	}

	// k: int
	public static int binaryFib(int k) {
		if (k <= 1)
			return k;

		return binaryFib(k - 1) + binaryFib(k - 2);
	}

	// k: int
	public static int[] linearFib(int k) {
		if (k <= 1) {
			int[] arr = { k, 0 };
			return arr;
		}

		int[] arr = linearFib(k - 1);
		int[] rs = { arr[0] + arr[1], arr[0] };
		return rs;
	}

}
