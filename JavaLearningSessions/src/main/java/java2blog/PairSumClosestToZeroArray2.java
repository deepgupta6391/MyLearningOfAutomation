package java2blog;

import java.util.Arrays;

public class PairSumClosestToZeroArray2 {

	public static void main(String[] args) {
		int arr[] = { 1, 3, -5, 7, 8, 20, -40, 6 };
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int sum = 0;
		int minimumSum = Integer.MAX_VALUE;
		int minLeft = left;
		int minRight = right;
		while (left < right) {
			sum = arr[left] + arr[right];
			if (Math.abs(sum) < Math.abs(minimumSum)) {
				minimumSum = sum;
				minLeft = left;
				minRight = right;
			}
			if (sum < 0)
				left++;
			else
				right--;
		}

		System.out.println(" The pair whose sum is minimun : " + arr[minLeft] + " " + arr[minRight]);

	}

}
