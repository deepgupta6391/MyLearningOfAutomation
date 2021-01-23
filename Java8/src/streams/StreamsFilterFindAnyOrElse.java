package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {

	public static void main(String[] args) {
		
		//list of customers objects:
		
		
		List<Customer> customersList=Arrays.asList(
				new Customer("Tom", 30),
				new Customer("Steve",31),
				new Customer("Peter", 34),
				new Customer("Simon", 23));
		
		//1. filter-findAny
		Customer customer=customersList.stream()//convert list to stream
		.filter(x -> "Peter".equals(x.getName()))//filter on the basis of Peter
		.findAny()//if finds then return
		.orElse(null);
		
		System.out.println(customer.getName()+" "+customer.getAge());
		
		System.out.println("======================================");
		
		//2. filter - did not find any.. or else
		Customer customer1=customersList.stream()//convert list to stream
				.filter(x -> "Deeps".equals(x.getName()))//filter on the basis of Peter
				.findAny()//if finds then return
				.orElse(null);
				
		System.out.println(customer1);
		System.out.println("======================================");
		//3. filter with multiple conditions:
		Customer customer2=customersList
		.stream()
		.filter(x -> "Simon".equals(x.getName()) && 23==x.getAge())
		.findAny()
		.orElse(null);
		
		System.out.println(customer2.getName()+"   "+customer2.getAge());
	}

}
