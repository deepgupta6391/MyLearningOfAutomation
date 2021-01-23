package java2blog;

import java.util.Arrays;

public class SortArray0s1sAnd2s {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 0, 0, 1, 2, 2, 1 };

		sort(arr, arr.length);

		System.out.println(Arrays.toString(arr));

	}

	public static void sort(int arr[], int n) {
		int i, count0 = 0, count1 = 0, count2 = 0;
		for (i = 0; i < n; i++) {
			switch (arr[i]) {
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;

			}
		}
		i=0;
		while (count0 > 0) {
			arr[i++] = 0;
			count0--;
		}
		while (count1 > 0) {
			arr[i++] = 1;
			count1--;
		}
		while (count2 > 0) {
			arr[i++] = 2;
			count2--;
		}
	}

}
