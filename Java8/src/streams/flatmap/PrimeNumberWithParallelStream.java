package streams.flatmap;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

	public static void main(String[] args) {
		
		//System.out.println(isPrime(13));
		long t1=System.currentTimeMillis();
		Long count=Stream.iterate(0, n-> n+1)
				.limit(500000)
				//.parallel()
				.filter(PrimeNumberWithParallelStream::isPrime)
				.peek(x -> System.out.println(x))
				.count();
		
		System.out.println("Total prime numbers are : "+count);
		long t2=System.currentTimeMillis();
		System.out.println("total time taken : "+(t2-t1)/1000);
		
		//parallel
		//total time taken : 43
		
		//sequential
		//36 sec
	}
	
	public static boolean isPrime(int number) {
		if(number<=1) return false;
		
		return !IntStream.rangeClosed(2, number/2).anyMatch(x -> number%x==0);
	}

}
