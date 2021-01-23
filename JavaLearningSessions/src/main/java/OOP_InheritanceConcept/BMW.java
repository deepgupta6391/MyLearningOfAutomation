package OOP_InheritanceConcept;

public class BMW extends Car{
	
	@Override
	public void start() {
		System.out.println("BMW---starts");
	}
	
	public void autoAirSuspension() {
		System.out.println("BMW---suspension");
	}

}
