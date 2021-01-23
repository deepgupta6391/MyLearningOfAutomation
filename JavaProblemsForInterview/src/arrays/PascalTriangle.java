package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PascalTriangle {

	public static void main(String[] args) {

		int numRows = 5;
		System.out.println(generate(numRows));
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (numRows == 0)
			return result;

		result.add(new ArrayList<Integer>());
		result.get(0).add(1);

		for (int i = 1; i < numRows; i++) {
			result.add(new ArrayList<Integer>());
			result.get(i).add(1);
			for (int j = 1; j < i; j++) {
				result.get(i).add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
			}
			result.get(i).add(1);
		}

//		List<List<Integer>> list=Arrays.stream(arr).map(Arrays::asList).collect(Collectors.toList());

		return result;

	}

}
