package OOP_EncapsulationConcept;

public class EmployeeData {

	public String name;
	public int id;
	public int age;
	public String dept;
	private int salary;

	public EmployeeData(String name, int id, int age, String dept, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}

	public void getEmployeeName() {
		System.out.println("get emp name");
		getEmployeeBonus();
	}

	private void getEmployeeBonus() {
		System.out.println("get emp bonus");
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}

	public static void main(String[] args) {
		
		EmployeeData e1=new EmployeeData("Tom", 1, 25, "IT", 4000);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
		e1.getEmployeeName();
		e1.getEmployeeBonus();
	}

}
