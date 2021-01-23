package strings;

public class DetectCapital {

	public static void main(String[] args) {

		String s1 = "USA";
		String s2 = "leetcode";
		String s3 = "Google";
		System.out.println(detectCapitalUse(s2));
	}

	public static boolean detectCapitalUse(String word) {

		if (word.equals(word.toUpperCase())) {
			return true;
		}

		for (int i = 1; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				return false;
		}

		return true;
	}

}
