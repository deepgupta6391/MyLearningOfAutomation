package arrays;

public class LargestNumberAtLeastTwiceofOthers {

	public static void main(String[] args) {
		int nums1[] = new int[] { 3, 6, 1, 0 };
		int nums2[] = new int[] { 1, 2, 3, 4 };
		int nums3[] = new int[] { 1 };

		System.out.println(dominantIndex(nums1));
		System.out.println(dominantIndex(nums2));
		System.out.println(dominantIndex(nums3));
	}

	public static int dominantIndex(int[] nums) {
		int largest = nums[0];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
				index = i;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (((2 * nums[i]) <= largest) || nums[i] == largest)
				continue;
			else
				return -1;
		}

		return index;
	}

}
