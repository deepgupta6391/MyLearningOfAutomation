package Java8.streams;

import java.util.Arrays;

public class StreamsStringarrayWithFlatMap {

	public static void main(String[] args) {
		String data[][]=new String[][] {{"a","b"},{"c","d"},{"e","a"}};
		
		Arrays.stream(data)
		.flatMap(x->Arrays.stream(x))
		.filter(x->"a".equals(x.toString()))
		.forEach(System.out::println);

	}

}
