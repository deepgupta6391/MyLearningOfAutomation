package FunctionalInterface.Predicate.Function.BinaryOperator.UnaryOperator.Supplier_Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaExpAndMethosReferences {

	public static void main(String[] args) {

		List<String> namesList = Arrays.asList("Tom", "Peter", "Deepshikha", "Simon");

		// 1.With Anonymous class
		namesList.forEach(new Consumer<String>() {// Anonymous class

			public void accept(String t) {
				System.out.println(t);
			}
		});

		System.out.println("-----------------------");

		// 2. Lambda Exp:
		namesList.forEach(str -> System.out.println(str));

		System.out.println("-----------------------");

		// 3.Method References:
		namesList.forEach(System.out::println);
		System.out.println("*****************************************");
		
//		List<String> names=namesList.stream().filter(n->n.startsWith("D") || n.startsWith("S")).collect(Collectors.toList());
//		names.forEach(System.out::println);
	}

}
