package Java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsIntArrayWithFlatMap {

	public static void main(String[] args) {
		int data[]= {1,2,3,4,5,6,7,8,9};
		
		IntStream intstream=Arrays.stream(data);
		
		Arrays.stream(data).filter(x ->x>5).forEach(System.out::println);
		
		Stream.of(data).flatMapToInt(x->Arrays.stream(x)).forEach(System.out::println);
		
		String data1[]= {"Sheela","Geela","Peela","Neela"};
		
		Arrays.stream(data1).filter(x -> x.contains("G")).forEach(System.out::println);
	}

}
