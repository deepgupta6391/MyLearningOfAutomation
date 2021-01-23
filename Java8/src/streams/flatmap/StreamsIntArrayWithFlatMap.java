package streams.flatmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsIntArrayWithFlatMap {

	public static void main(String[] args) {
		int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		
//		Stream<int[]> streamArray=Stream.of(data);
//		IntStream intStream=streamArray.flatMapToInt(x -> Arrays.stream(x));
//		intStream.forEach(System.out::println);
//		
//		IntStream intStreamFilter=intStream.filter(x -> x>5);
//		intStreamFilter.forEach(System.out::println);
		Stream.of(data).flatMapToInt(x -> Arrays.stream(x));

		Arrays.asList(data).stream().flatMapToInt(x -> Arrays.stream(x)).filter(x->x>5).forEach(System.out::println);
		
		System.out.println("**********************************************");
		IntStream val=Stream.of(data).flatMapToInt(x -> Arrays.stream(x));
		val.forEach(System.out::println);
	}

}
