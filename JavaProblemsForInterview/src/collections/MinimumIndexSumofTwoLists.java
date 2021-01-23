package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class MinimumIndexSumofTwoLists {

	public static void main(String[] args) {
		String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = { "KFC", "Burger King", "Tapioca Express", "Shogun" };

		System.out.println(Arrays.asList(findRestaurant(list1, list2)));
	}

	public static String[] findRestaurant(String[] list1, String[] list2) {

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}

		ArrayList<String> res = new ArrayList<>();

		int minSum = Integer.MAX_VALUE;

		for (int j = 0; j < list2.length; j++) {
			if (map.containsKey(list2[j])) {
				int sum = j + map.get(list2[j]);
				if (sum < minSum) {
					System.out.println(sum);
					System.out.println(minSum);
					System.out.println("++++++++++-------1");
					minSum = sum;
					res.clear();
					res.add(list2[j]);
				} else if (sum == minSum) {
					System.out.println("++++++++++-------2");
					res.add(list2[j]);
				}
			}
		}

		return res.toArray(new String[res.size()]);
	}
}
