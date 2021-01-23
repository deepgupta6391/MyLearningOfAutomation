package Java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {

	public static void main(String[] args) {

		List<Customer> customersList=Arrays.asList(
				new Customer("Tom", 30),
				new Customer("Steve",31),
				new Customer("Peter", 34),
				new Customer("Simon", 23)
				);
		
		
		//1. filter-findAny
		Customer customer=customersList.stream().filter(x -> "Peter".equals(x.getName()))
			.findAny()//if it finds then return
			.orElse(null);
		
		System.out.println(customer.getName()+" "+customer.getAge());
		
		System.out.println("************************");
		
		customersList.stream().map(x->x.getName()).filter(x->"Peter".equals(x)).findAny().ifPresent(System.out::println);
		
		System.out.println("************************");
		
		//2. filter-orElse
		Customer customer1=customersList.stream().filter(x -> "peter".equals(x.getName()))
				.findAny()//if it finds then return
				.orElse(null);
			
		System.out.println(customer1);
		System.out.println("************************");
		//3.filter with multipleconditions:
		Customer customer2=customersList.stream()
			.filter(x -> "Simon".equals(x.getName()) && 23==x.getAge())
			.findAny()
			.orElse(null);
		System.out.println(customer2.getName()+" "+customer2.getAge());
	}

}
