package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) {

		List<String> productList = Arrays.asList("MacBook", "iPhone", "Shoes", "Battery Charger", "Bat");

		System.out.println(productList);
		productList.forEach(ele -> System.out.println(ele));

		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		// predicate here means boolean value
		List<String> result = productList.stream().filter(ele -> !ele.equals("Shoes")).collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
