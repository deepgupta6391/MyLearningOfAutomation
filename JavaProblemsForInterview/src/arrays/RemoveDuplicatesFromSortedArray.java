package arrays;

import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 6 };

		// int[] nums = { 1, 1, 2 };

		if (nums.length == 0)
			System.out.println(0);
		else {
			
			int len = 0;
			int prev = nums[0];
			
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] != prev) 
				{
					nums[len++] = prev;
				}
				prev = nums[i];
			}
			
			nums[len++] = prev;

			System.out.println(Arrays.toString(nums));
			System.out.println(len);
		}
	}

}
