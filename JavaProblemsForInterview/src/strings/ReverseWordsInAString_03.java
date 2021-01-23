package strings;

import java.util.Arrays;

public class ReverseWordsInAString_03 {

	public static void main(String[] args) {
		String s="Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {

		String[] arr = s.split(" ");
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(arr[i]);
			ans.append(sb.reverse().toString()+" ");
		}
		return ans.toString().trim();
	}
}
