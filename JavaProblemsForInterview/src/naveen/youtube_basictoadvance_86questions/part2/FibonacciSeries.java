package naveen.youtube_basictoadvance_86questions.part2;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num = 10;
		fibonacci(num);
	}

	public static void fibonacci(int num) {
		int t0 = 0;
		int t1 = 1;

		for (int i = 2; i <= num; i++) {
			System.out.print(t0 + " ");
			int sum = t0 + t1;
			t0 = t1;
			t1 = sum;
		}
		
		System.out.println(t0);

	}

}
