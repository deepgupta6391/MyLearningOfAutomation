package strings;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// char[] s= {'h','e','l','l','o'};
		char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };
		reverseString(s);
	}

	public static void reverseString(char[] s) {

		int len = s.length;
		int left = 0;
		int right = len - 1;
		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}

		System.out.println(Arrays.toString(s));
	}

}
