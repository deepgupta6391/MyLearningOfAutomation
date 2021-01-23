package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SumofPairsOfElementsinArrayEqualtoNumber {

	public static void main(String[] args) {
		int array[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
//		System.out.println(Arrays.toString(findPairsUsingForLoop(array, 15)));
//		System.out.println(Arrays.toString(findPairsUsingWhile(array,15)));//index number changes
		System.out.println(Arrays.toString(findPairsUsingHashing(array, 15)));
	}

	public static int[] findPairsUsingForLoop(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	public static int[] findPairsUsingWhile(int[] nums, int target) {
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int l = 0, r = nums.length - 1;
		while (l < r) {
			int currentSum = nums[l] + nums[r];
			if (currentSum == target) {
				return new int[] { l, r };
			}
			// l++;
			// r--;
			else if (currentSum < target) {
				l++;
			} else {
				r--;
			}
		}
		return new int[] {};
	}

	public static int[] findPairsUsingHashing(int[] nums, int target) {
		HashMap<Integer, Integer> element = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {

			int diff = target - nums[i];
			if (element.containsKey(diff)) {
				return new int[] { element.get(diff), i };
			}
			element.put(nums[i], i);
			System.out.println(element);
		}


		return new int[] {};
	}

}
