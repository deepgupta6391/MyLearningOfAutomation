package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	
	@Test(invocationCount = 9)
	public void createUser() {
		System.out.println("create user test....");
		//hit your API
	}
}
