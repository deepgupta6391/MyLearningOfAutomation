package JavaBasics;

public class Employee {
	
	//data members: class members:
	//1. class vars: declare at the class level
	//2. class methods:
	
	
	String name;
	int age;
	char gender;
	boolean isPermanent;

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		System.out.println("Default global string value : "+e1.name);
		System.out.println("Default int value : "+e1.age);
		System.out.println("Default char value : "+e1.gender);
		System.out.println("Default boolean value :"+e1.isPermanent);
		
		new Employee().name="Sheela";
		System.out.println(new Employee().name);
		System.out.println(new Employee());
		System.out.println(e1);
		e1=null;
		System.out.println(e1);
	}

}
