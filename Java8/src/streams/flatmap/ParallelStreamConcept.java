package streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {
		
		ForkJoinPool corePools=ForkJoinPool.commonPool();
		System.out.println(corePools.getParallelism());

		//1. parallel()
		Stream stream=Stream.of("Deeps","Jitu","Lulu","Papa","Mom");
		//BaseStream parallel=stream.parallel();
		
		Stream.of("Deeps","Jitu","Lulu","Papa","Mom").forEach(System.out::println);
		System.out.println("***************************************");
		Stream.of("Deeps","Jitu","Lulu","Papa","Mom").parallel().forEach(System.out::println);
		System.out.println("***************************************");
		
		//2. use parallelStream() method on a collection string
		Arrays.asList("Deeps","Jitu","Lulu","Papa","Mom").parallelStream().forEach(System.out::println);
		System.out.println("***************************************");
		
		
		//1 to 10:
		System.out.println("----Normal Stream----");
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		System.out.println("----parallel Stream----");
		IntStream.range(1, 10).parallel().forEach(System.out::println);
		System.out.println("***************************************");
		
		
		//to print from a-z -->97-122 using getAlphatesList()
		System.out.println("--------Normal Stream---------");
		getAlphatesList().stream().forEach(System.out::println);
		System.out.println("----parallel Stream----");
		getAlphatesList().parallelStream().forEach(System.out::println);
		
		
		//check if stream is running in parallel mode
		IntStream range=IntStream.rangeClosed(1, 10);
		System.out.println(range.isParallel());//false
		
		IntStream range1=IntStream.rangeClosed(1, 10);
		range1.parallel();
		System.out.println(range1.isParallel());//true
		
	}
	
	public static List<String> getAlphatesList() {
		List<String> alpha=new ArrayList<String>();
		
		int n=97;
		while(n<=122) {
			char c=(char) n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;
	}

}
