package string;

public class Anagrams {

	public static void main(String[] args) {
		String a = "hello";
		a = a.toUpperCase();
		String b = "Hello";
		b = b.toUpperCase();

		int c[] = new int[26];
		int d[] = new int[26];
		for (int i = 0; i < a.length(); i++) {
			// System.out.println(a.charAt(i)-'A');
			c[a.charAt(i) - 'A']++;
			d[b.charAt(i) - 'A']++;
		}

		for (int i = 0; i < 26; i++) {
			if (c[i] != d[i]) {
				System.out.println("Not anagram");
				break;
			}

		}

	}

}
