package basics;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = "MCMXCIV";
		if (s == "") {
			System.out.println(0);
		}
		int pre = convertRomanToInt(s.charAt(0));
		int sum = 0;
		for (int i = 1; i < s.length(); i++) {
			int temp = convertRomanToInt(s.charAt(i));
			if (pre < temp) {
				pre = temp - pre;
			} else {
				sum = sum + pre;
				pre = temp;
			}
		}
		if(pre!=0)
			sum+=pre;
		System.out.println(sum);
	}

	public static int convertRomanToInt(char s) {
		switch (s) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

}
