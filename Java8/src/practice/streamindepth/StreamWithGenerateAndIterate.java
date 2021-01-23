package practice.streamindepth;

import java.util.stream.Stream;

public class StreamWithGenerateAndIterate {

	public static void main(String[] args) {

		// generate is a supplier and it doesn't have limit
		Stream.generate(() -> 6).limit(10).forEach(System.out::println);

		//iterate is unary
		Stream.iterate(100, n->n+1).limit(5).forEach(System.out::println);
	}

}
