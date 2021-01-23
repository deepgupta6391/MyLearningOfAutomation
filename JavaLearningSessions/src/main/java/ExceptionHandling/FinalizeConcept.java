package ExceptionHandling;

import JavaBasics.Employee;

public class FinalizeConcept {

	public static void main(String[] args) {
		
		FinalizeConcept obj=new FinalizeConcept();
		obj=null;
		
//		Employee emp=new Employee();
//		emp=null;
		
//		System.gc();
		System.out.println("Bye!!");
	}
	
	@Override
	public void finalize() {
		System.out.println("inside the finalize method....");
	}

}
