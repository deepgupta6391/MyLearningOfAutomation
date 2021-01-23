package OOP_Interface;

interface USMedical extends WHO,UN{
	
	
	int min_free=10;
	
	
	
	public void orthopedicServices_USA();
	
	public void dentalServices_USA();
	
	public void nueroServices_USA();
	
	public void ambulanceServices_USA();
	
	public void emergencyServices_Common();

	//private void test(); //not allowed
	void test_USA();
	//protected void test1();/allowed
	
	//no method body -- 100% abstraction
	//only method declaration or say method prototype
	//no static methods in interface
	//variables are by default static and final in interface.
	//cannot create object of interface
	
	//After JDK 1.8
	//1. can have method body: with default method
	
	default void Services_911_USA() {
		System.out.println("US -- 911 services");
	}
	
	//2. can have static methods interface
	 static void billing_USA() {
		System.out.println("US -- Billing");
	}
	 
	  
}
