package FunctionalInterface.Predicate.Function.BinaryOperator.UnaryOperator.Supplier_Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {

		// Represents an operation that accepts a single input argument and returns no
		// result.

		Consumer<String> func = x -> System.out.println(x);
		func.accept("This is Deepshikha here");

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list.forEach(x -> System.out.println(x));
		System.out.println("===================================================");
		List<String> nameList = Arrays.asList("Deeps", "Dee", "Deepshikha", "Java", "Selenium", "Rest", "API");
		nameList.forEach(x -> System.out.println(x.length()));

		System.out.println("---------------------------------------");
		list.forEach(System.out::println);
	}

}
