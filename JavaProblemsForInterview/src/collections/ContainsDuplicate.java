package collections;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4 };
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {
		if (nums.length == 0)
			return false;

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if (!set.add(i))
				return true;
		}

		return false;
	}

}
