package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElementAndNumberWhichOccursOddTimes {

	public static void main(String[] args) {

		int array[] = new int[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 40, 20, 40, 20 };

		//System.out.println(majorityElement(array));
		System.out.println(numberOccursOddTimes(array));
	}

	public static int majorityElement(int[] nums) {

		if (nums.length == 1)
			return nums[0];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (map.containsKey(i) && map.get(i) + 1 > nums.length / 2) {
				return i;
			} else {
				map.put(i, map.getOrDefault(i, 0) + 1);
			}
		}

		return -1;
	}

	public static int numberOccursOddTimes(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		
		for(Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()%2!=0)
				return entry.getKey();
		}

		return -1;

	}

}
