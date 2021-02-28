

public class RecursiveMethods {
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
	public static int[] reverseArray(int[] A, int i, int j) {
		if (i < j) {
			int aux = A[i];
			A[i] = A[j];
			A[j] = aux;
			reverseArray(A, i++, j--);
		}

		return A;
	}

	// A: arranjo inteiro, i, j: >= 1
	public static int[] iterativeReverseArray(int[] A, int i, int j) {
		if (i < j) {
			int aux = A[i];
			A[i] = A[j];
			A[j] = aux;
			i--;
			j++;
			return iterativeReverseArray(A, i, j);
		}
		return A;
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
	/*
	 * public static int linearFib(int[] k) { if (k[0] <= 1) return [k, 0]; }
	 */
}
