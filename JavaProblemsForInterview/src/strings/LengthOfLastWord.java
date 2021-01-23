package strings;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// String s = "Hello World";
		String s = " ";

		System.out.println("Lenth of last word is : " + lengthOfLastWord(s));

	}

	public static int lengthOfLastWord(String s) {

		String[] arr = s.split(" ");

		if (arr.length > 0) {
			String lastWord = arr[arr.length - 1];
			return lastWord.length();
		}

		return 0;
	}

}
