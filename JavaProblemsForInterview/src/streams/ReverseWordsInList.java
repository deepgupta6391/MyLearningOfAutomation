package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsInList {

	public static void main(String[] args) {
		List<String> productList = Arrays.asList("MacBook", "iPhone", "Shoes", "Battery Charger", "Bat");

		System.out.println(productList);
		//productList.forEach(ele -> System.out.println(ele));

		List<String> res=productList.stream()
				.map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(res);
	}

}
