package naveen.youtube_basictoadvance_86questions.part1;

public class VowelAndConsonant {

	public static void main(String[] args) {

		// a e i o u
		char c = 'd';

//		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//			System.out.println(c + " is a vowel");
//		} else {
//			System.out.println(c + " is a consonant");
//		}

		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c + " is a vowel");
			break;
		default:
			System.out.println(c + " is a consonant");
			break;
		}
	}

}
