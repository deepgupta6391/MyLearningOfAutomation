package arrays;

import java.util.Arrays;

public class PrintAsAsked {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };// 654123
		int len = arr.length;
		int res[] = new int[len];
		int j = 0;

		int mid = (len - 1) / 2;
		for (int i = len - 1; i > mid; i--) {
			res[j++] = arr[i];
		}
		
		for (int k = 0; k <= mid; k++) {
			res[j++] = arr[k];
		}
		System.out.println(Arrays.toString(res));
	}

}
