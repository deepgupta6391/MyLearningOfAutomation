package singleton.pattern.selenium.webdriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrmTest {

	@BeforeMethod
	public void setUp() {
		TestBase.initialize();
	}
	
	@Test
	public void verifyTitleTest() throws InterruptedException {
		Thread.sleep(5000);
		String title=TestBase.driver.getTitle();
		System.out.println("Page title is : "+title);
	}
	
	@Test
	public void verifySignUp() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		TestBase.quit();
	}
}
