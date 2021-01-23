package TestNGSessions;

import org.testng.annotations.Test;
/*there are dependsOnGroups and InheritedDependentTestMethods as well*/
public class DependsOnMethod {

	@Test(priority = 1)
	public void loginTest() {
		System.out.println("login test...");
	}

	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("home page test");
		int i = 9 / 0;
	}

	@Test(dependsOnMethods = { "loginTest", "homePageTest" })
	public void searchTest() {
		System.out.println("search test...");
	}

}
