package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		int data[][] = new int[10][20];

		int data1[][] = { { 10, 20, 20 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				if (i % 2 != 0) {
					System.out.print("*");
					count++;
					break;
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}

}
