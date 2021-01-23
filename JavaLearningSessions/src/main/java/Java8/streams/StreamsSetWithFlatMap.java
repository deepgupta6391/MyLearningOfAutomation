package Java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setName("Deeps");
		
		emp1.addDevices("iPhone8");
		emp1.addDevices("Samsung9");
		emp1.addDevices("iPhoneX");
		emp1.addDevices("macbook pro");
		
		Employee emp2=new Employee();
		emp2.setName("Tom");
		
		emp2.addDevices("lenovo windows10");
		emp2.addDevices("Samsung10");
		emp2.addDevices("iPhone8");
		emp2.addDevices("macbook air");
		
		List<Employee> empLists=new ArrayList<>();
		empLists.add(emp1);
		empLists.add(emp2);
		
		empLists.stream()
				.map(x->x.getDevices())
				.flatMap(x->x.stream())
				.distinct()
				.collect(Collectors.toList())
				.forEach(x->System.out.println(x));
		
		
	}

}
