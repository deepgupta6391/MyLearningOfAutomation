package Java8.FunctionalInterfaces;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		
		getText(()->"Java");
		
		Supplier<Integer> random=() -> new Random().nextInt();
		Stream.generate(random).limit(4).forEach(System.out::println);
	}
	
	
	public static void getText(Supplier<String> text) {
		System.out.println(text.get().length());
	}

}
