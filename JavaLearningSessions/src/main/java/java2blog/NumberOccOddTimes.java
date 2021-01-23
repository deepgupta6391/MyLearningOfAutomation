package java2blog;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOccOddTimes {

	public static void main(String[] args) {
		int arr[] = new int[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };
		int val = getOddTimesElementHashing(arr);

		if (val != -1) {
			System.out.println("The number occurring odd number of times in an array is : " + val);
		} else {
			System.out.println("None of the number has even occurrences");
		}
	}

	static int getOddTimesElementHashing(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (map.containsKey(element)) {
				map.put(element, map.get(element) + 1);
			} else {
				map.put(element, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 2 == 1) {
				return entry.getKey();
			}
		}

		return -1;
	}

}
