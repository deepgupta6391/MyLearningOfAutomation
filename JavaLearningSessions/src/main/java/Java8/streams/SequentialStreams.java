package Java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams {

	public static void main(String[] args) {

		//1.
		Stream<String> stream=Stream.of("Naveen","Tom","Selvin","Peter");
		stream.findFirst().ifPresent(System.out::println);
		
		//2.
		Arrays.asList("a1","a2","a3")
				.stream()
				.findFirst()
				.ifPresent(System.out::println);
		
		//3.range 1 to 5:
		IntStream.range(1,11).forEach(System.out::println);
		
		//4.
		Arrays.stream(new int[] {1,2,3,4,5})
			.map(n->2*n+1)
			.average()
			.ifPresent(System.out::println);
		
		//5. String data objects:
		Stream.of("a1","a2","a3")
				.map(s->s.substring(1))
				.mapToInt(Integer::parseInt)
				.max()
				.ifPresent(System.out::println);
		
		//6. doubles to STring objects:
		Stream.of(1.0,2.0,3.0)
				.mapToInt(Double::intValue)
				.mapToObj(i->"a"+i)
				.forEach(System.out::println);
		
		System.out.println("********************");
		
		//7.limit:
		Stream.iterate(9, n->n+1).limit(30).forEach(System.out::println);
		
		System.out.println("********************");
		
		//8.odd numbers:
		Stream.iterate(0, n->n+1)
				.filter(n->n%2!=0)
				.limit(10)
				.forEach(System.out::println);
	}

}
