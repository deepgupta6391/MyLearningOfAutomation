package arrays;

public class FibonacciNumber {

	public static void main(String[] args) {

		System.out.println(fib(4));
	}

	public static int fib(int N) {

		if (N == 0 || N == 1)
			return N;

		return (fib(N - 1) + fib(N - 2));

	}
}
