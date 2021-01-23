package basics;

public class ReverseAnInteger {

	public static void main(String[] args) {

		int x = -2147483648;
		long rev = 0;
		boolean neg = x < 0 ? true : false;

		if(neg) {
			x*=-1;
		}
		while (x > 0) {
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		if (rev > Integer.MAX_VALUE) {
			System.out.println(0);
		} else {
			System.out.println(neg?(-1*rev):rev);
		}
		
	}

}
