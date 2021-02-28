

public class RecursiveFactorial {
	public static int recursiveFactorial(int n) {
		if (n == 0) // caso base
			return 1;
		return n * recursiveFactorial(n - 1); // caso recursivo
	}
}
