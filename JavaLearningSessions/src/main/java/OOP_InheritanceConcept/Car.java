package OOP_InheritanceConcept;

public class Car extends Vehicle{

	int val=10;
	
	public void start() {
		System.out.println("Car---start");
	}
	
	public void stop() {
		System.out.println("Car---stop");
	}
	
	protected void refuel() {
		System.out.println("Car---refuel");
	}
	
	public static void petrolTank() {
		System.out.println("Car----petroltank");
	}
}
