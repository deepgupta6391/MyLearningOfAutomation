package java2blog;

import java.util.Arrays;

public class SeperateOddAndEvenNumbersInArray {

	public static void main(String[] args) {
		int arr[] = { 12, 17, 70, 15, 22, 65, 21, 90 };
		int left = 0;
		int right = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] % 2 == 0) {
				left++;
			}
			while (arr[i] % 2 != 0) {
				right--;
			}

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}

		}

		System.out.println(Arrays.toString(arr));

	}

}
