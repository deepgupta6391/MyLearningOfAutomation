package strings;

public class RepeatedSubStringPattern {

	public static void main(String[] args) {

		String s1 = "abcabcabcabc";
		String s2 = "abab";
		System.out.println(repeatedSubstringPattern(s2));

	}

	public static boolean repeatedSubstringPattern(String s) {
		int len = s.length();
		
		for (int i = len / 2; i >= 1; i--) {
			
			if (len % i == 0) {
				
				int num_repeats = len / i;
				
				String subS = s.substring(0, i);
				System.out.println(subS);
				
				StringBuilder sb = new StringBuilder();
				
				for (int j = 0; j < num_repeats; j++) {
					sb.append(subS);
				}
				System.out.println(sb);
				
				if (sb.toString().equals(s))
					return true;
			}
			
		}
		return false;

	}

}
