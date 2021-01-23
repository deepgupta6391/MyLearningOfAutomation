package java.interview.question.by.naveen;

public class PalindromeNumber {

	public static void isPalindrome(int num) {

		int sum = 0;
		int temp=num;
		while (num > 0) {
			sum = sum * 10 + num % 10;
			num = num / 10;
		}

		if (sum == temp) {
			System.out.println(temp + " -- is plaindrome number");
		} else {
			System.out.println(temp + " -- This is not a palindrome number");
		}

	}

	public static void main(String[] args) {

		isPalindrome(345343);
	}

}
