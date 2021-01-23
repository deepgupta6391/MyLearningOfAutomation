package arrays;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int len = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[len++]=nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(len);

	}

}
