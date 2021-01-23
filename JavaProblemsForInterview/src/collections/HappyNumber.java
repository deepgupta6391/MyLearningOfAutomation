package collections;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		int n = 18;
		System.out.println(isHappy(n));
	}

	public static boolean isHappy(int n) {

		HashSet<Integer> set = new HashSet<>();

		while (!set.contains(n)) {
			set.add(n);

			n = getSum(n);

			if (n == 1)
				return true;
		}

		return false;
	}

	public static int getSum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10) * (n % 10);
			n = n / 10;
		}
		return sum;
	}
}
