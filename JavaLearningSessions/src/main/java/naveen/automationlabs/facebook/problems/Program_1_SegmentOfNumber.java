package naveen.automationlabs.facebook.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program_1_SegmentOfNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(13);
		list.add(7);
		list.add(29);
		list.add(35);
		list.add(45);

		int upperBond = 48;
		int lowerBond = 3;

		System.out.println("The largest segment is : " + largestSegmentOfNumbers(list, upperBond, lowerBond));

	}

	public static int largestSegmentOfNumbers(List<Integer> list, int upBond, int lowBond) {
		List<Integer> sortedList = list;
		Collections.sort(sortedList);
		System.out.println("Sorted list is : " + sortedList);
		System.out.println(sortedList.get(0));
		List<Integer> result = new ArrayList<>();

		for (int num : sortedList) {
			for (int i = lowBond; i < upBond; i++) {
				if (i == num) {
					int lengthOfSegment = num - lowBond;
					result.add(lengthOfSegment);
					lowBond = num;
					break;
				}
			}
		}

		System.out.println("Result of segments are : " + result);
		return Collections.max(result);
	}

}
