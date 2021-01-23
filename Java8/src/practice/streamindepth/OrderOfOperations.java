package practice.streamindepth;

import java.util.stream.Stream;

public class OrderOfOperations {

	public static void main(String[] args) {
		
		Stream<String> nameStream = Stream.of("mohan","john","vaibhav","amit");
		Stream<String> nameStartJ=nameStream.map(
												(s)->
												{
													System.out.println("Map: "+s);
													return s.toUpperCase();
												})
												.filter(
												(s)->
												{
												System.out.println("Filter: "+s);
												return s.startsWith("J");
												}						
												);
		
		//1.
//		String res1=nameStartJ.findAny().orElse(null);
//		System.out.println("The ans is: "+res1);
				
		//2.
		String res2=nameStartJ.findAny().get();
		System.out.println("The ans is: "+res2);

	}

}
