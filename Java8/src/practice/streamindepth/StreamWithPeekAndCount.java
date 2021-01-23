package practice.streamindepth;

import java.util.stream.Stream;
//peek() method is generally used for logging and debugging purpose only.
public class StreamWithPeekAndCount {

	public static void main(String[] args) {

		Stream<String> nameStream = Stream.of("mohan", "john", "vaibhav", "amit");
		Stream<String> lst = nameStream.map(String::toUpperCase);
		long nameStarWithVCount = lst.peek(System.out::println).filter(s -> s.startsWith("V") || s.startsWith("A"))
				.count();
		System.out.println(nameStarWithVCount);

	}

}
