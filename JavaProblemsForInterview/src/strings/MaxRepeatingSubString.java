package strings;

public class MaxRepeatingSubString {

	public static void main(String[] args) {
		// String a = "ababc", b = "ab";
		// String a = "ababc", b = "ba";
		// String a="ababc", b="ac";
		String a = "aaabaaaabaaabaaaabaaaabaaaabaaaaba", b = "aaaba";
		System.out.println(maxRepeating(a, b));

	}

	public static int maxRepeating(String sequence, String word) {
//		int count = 0;
//		int j = 0;
//
//		for (int i = 0; i < sequence.length(); i++) {
//			if (sequence.charAt(i) == word.charAt(j)) {
//				j++;
//			} else {
//				if (word.length() == j) {
//					count++;
//					j=0;
//				}
//				j--;
//			}
//
//		}
		
		 StringBuilder sb = new StringBuilder(word);
	        int result = 0;
			// check if the string is part of sb
	        while (sequence.contains(sb)) {
	        	System.out.println(sb.toString());
	            result++;
	           sb.append(word);
	        }
	        return result;
	
	}

}