package arrays;

import java.util.Arrays;

public class RotateArrayRight {

	public static void main(String[] args) {
		//int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int[] nums=new int[] {-1};
		int k = 3;
		rotate(nums, k);
	}

	public static void rotate(int[] nums, int k) {
		k%=nums.length;
		System.out.println(Arrays.toString(nums));
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	public static void reverse(int[] nums, int start, int end) {

		while (start < end) {
			int t = nums[start];
			nums[start] = nums[end];
			nums[end] = t;
			start++;
			end--;
			
		}
	}
}
