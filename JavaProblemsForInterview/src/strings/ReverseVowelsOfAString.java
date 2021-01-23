package strings;

import java.util.Arrays;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		String s = "leetcode";

		System.out.println(reverseVowels(s));
	}

	public static String reverseVowels(String s) {
		
		int left=0;
		int right=s.length()-1;
		char[] s1=s.toCharArray();
		while(left<right) {
			if(!isVowel(s1[left])) {
				left++;
				continue;
			}
			if(!isVowel(s1[right])) {
				right--;
				continue;
			}
			
			//swapping
			char t=s1[left];
			s1[left]=s1[right];
			s1[right]=t;
			
			left++;
			right--;
		}
		
		return String.valueOf(s1);

	}

	static boolean isVowel(char c) {
		return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
				|| c == 'U');
	}
}
