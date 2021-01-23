package Java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamProblems {

	public static void main(String[] args) {

		List<Employee> empLst = createEmployeeList();
		/*
		 * 1. filter all the employee whose age is greater than 20 and print the
		 * employee names
		 */

		List<String> employees = empLst.stream().filter(x -> x.getAge() > 20).map(x -> x.getName())
				.collect(Collectors.toList());
		System.out.println(employees);

		/*
		 * 2. count number of employees with age 25
		 */
		long empNum = empLst.stream().filter(x -> x.getAge() > 25).count();
		System.out.println("Number of employees grater than age 25 --->" + empNum);

		/*
		 * 3.find the employee with name “Mary”.
		 */

		Optional<Employee> e1 = empLst.stream().filter(e -> e.getName().equalsIgnoreCase("mary")).findAny();
		if (e1.isPresent()) {
			System.out.println(e1.get());
		}

		/* 4.find maximum age of employee */
		empLst.stream().mapToInt(Employee::getAge).max().ifPresent(System.out::print);

		System.out.println("****************************");

		/* 5.sort all the employee on the basis of age */
		empLst.stream().mapToInt(Employee::getAge).sorted().forEach(System.out::println);

		System.out.println("--------------");

		empLst.sort((e2, e3) -> e2.getAge() - e3.getAge());
		empLst.forEach(System.out::println);

		/* 6 join the all employee names with “,” using java 8 */
		List<String> empNames = empLst.stream().map(Employee::getName).collect(Collectors.toList());
		String names = String.join(",", empNames);
		System.out.println(names);

		/* 7. Given the list of employee, group them by employee name */
		empLst.stream().collect(Collectors.groupingBy(Employee::getName))
				.forEach((name, employeeLst) -> System.out.println(name + "========" + employeeLst));

		/* 8.Remove Duplicates */
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 3, 2, 4, 2 };
		Arrays.stream(arr).distinct().forEach(i -> System.out.print(" " + i));
		System.out.println();
		Arrays.stream(arr).collect(Collectors.toSet()).forEach(i -> System.out.print(" " + i));
		System.out.println("***********************************");

		System.out.println("**************SIMPLY RANDOM***********************");

		/*
		 * 1. square them and filter the numbers which are greater 10000 and then find
		 * average of them.
		 */
		Integer[] arr1 = new Integer[] { 100, 24, 13, 44, 114, 200, 40, 112 };
		Arrays.stream(arr1).mapToInt(x -> x * x).filter(n -> n > 1000).average().ifPresent(System.out::println);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&Reduce Examples*********************");
		System.out.println();
		/* 2. */
		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
		words.stream().reduce((w1,w2)->w1.length()>w2.length()?w1:w2).ifPresent(System.out::println);
		
		String[] array1 = { "Geeks", "for", "Geeks" };
		Arrays.stream(array1).reduce((w1,w2)->w1+ "-" +w2).ifPresent(System.out::println); 
		
		List<Integer> array2 = Arrays.asList(-2, 0, 4, 6, 8); 
		int a=array2.stream().reduce(0,(ele1,ele2) -> ele1+ele2);
		System.out.println(a);
		
		int mul=IntStream.range(2,8).reduce((n1,n2)->n1*n2).orElse(-1);
		System.out.println(mul);
		
		System.out.println();
		/****************** Student ***********************************/
		System.out.println("*********************STUDENT********************");
		/*
		 * 1. filter Student with name John, if you do not find it in the list then
		 * return null.
		 */
		
		
		List<Student> students = createStudentList();
		Student student = students.stream().filter(x -> x.getName().equalsIgnoreCase("John")).findAny().orElse(null);
		System.out.println("List1 " + student);
		List<Student> studentLst = students.stream().filter(x -> x.getName().equalsIgnoreCase("John"))
				.collect(Collectors.toList());
		studentLst.forEach(System.out::println);
		students.stream().map(x -> x.getName()).filter(x -> x.equalsIgnoreCase("john")).findAny()
				.ifPresent(System.out::println);
	}

	public static List<Employee> createEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee("John", 21);
		Employee e2 = new Employee("Martin", 19);
		Employee e3 = new Employee("Mary", 31);
		Employee e4 = new Employee("Stephan", 18);
		Employee e5 = new Employee("John", 26);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);

		return employeeList;
	}

	public static List<Student> createStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(1, "Arpit", "M", 19);
		Student s2 = new Student(2, "John", "M", 17);
		Student s3 = new Student(3, "Mary", "F", 14);
		Student s4 = new Student(4, "Martin", "M", 21);
		Student s5 = new Student(5, "Monica", "F", 16);
		Student s6 = new Student(6, "John", "F", 20);

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		return studentList;
	}
}
