package strings;

public class ValidPlaindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		//String s = "race a car";

		System.out.println(isPalindrome(s));
	}

	static boolean isPalindrome(String s) {

		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			char head = s.charAt(start);
			char tail = s.charAt(end);

			if (!Character.isLetterOrDigit(head)) {
				start++;
				continue;
			}
			if(!Character.isLetterOrDigit(tail)) {
				end--;
				continue;
			}
			if (Character.toLowerCase(head) != Character.toLowerCase(tail)) {
				return false;
			} else {
				start++;
				end--;
			}

		}
		return true;
	}
}
