package ConstructorChaining;

public class Business {

	String type;
	int revenue;
	String branches;
	
	public Business() {
		System.out.println("Default business class constructor...");
	}

	public Business(String type, int revenue, String branches) {
		this.type = type;
		this.revenue = revenue;
		this.branches = branches;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
