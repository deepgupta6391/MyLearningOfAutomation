package OOP_EncapsulationConcept;

public class EmployeeTest {

	public static void main(String[] args) {
		
		EmployeeData e1=new EmployeeData("Jitu",15, 33, "Data", 7000);
		System.out.println(e1.name);
		e1.getEmployeeName();
		System.out.println(e1.getSalary());
		e1.setSalary(10000);
		
		System.out.println(e1.getSalary());
	}

}
