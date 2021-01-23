package streams.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSetWithFlatMap {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setName("Deeps");
		emp1.addDevices("iPHone12");
		emp1.addDevices("Lenovo Laptop");
		emp1.addDevices("iPhone11");
		emp1.addDevices("Mac Book Pro");
		
		Employee emp2=new Employee();
		emp2.setName("Jiten");
		emp2.addDevices("iPHone12");
		emp2.addDevices("Dell");
		emp2.addDevices("iPhone11");
		emp2.addDevices("Mac Book Air");
		
		List<Employee> empLists=new ArrayList<Employee>();
		empLists.add(emp1);
		empLists.add(emp2);
		
		List<String> devicesList=empLists.stream()
										.map(x -> x.getDevices())//Stream<Set<String>>
										.flatMap(x -> x.stream())//Stream<String>
										.distinct()
										.collect(Collectors.toList());
		
		//devicesList.forEach(x -> System.out.println(x));
		devicesList.forEach(System.out::println);
	}
}
