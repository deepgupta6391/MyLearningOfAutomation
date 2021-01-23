package strings;

public class ExtractNumbersFromStringAndAdd {
	public static void main(String[] args) {

		String s1 = "hfghfgh54545";
		String s2 = "%^&amp;%dhfjf78";
		int sum = 0;

		boolean flag = s2.matches("[A-Za-z0-9]*");
		if (flag) {
			for (int i = 0; i < s2.length(); i++) {
				char c = s1.charAt(i);
				if (Character.isDigit(c))
					sum = sum + Character.getNumericValue(c);
			}

			System.out.println(sum);
		} else {
			System.out.println("String doesn't contain any numbers");
		}
	}
}
