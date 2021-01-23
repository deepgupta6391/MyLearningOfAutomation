package ngwebdriver.poc;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalTest {

	CalculatorPage calPage;
	
	@BeforeTest
	public void setUp() {
		calPage=new CalculatorPage();
	}
	
	@Test(priority = 1)
	public void sumTest() {
		String res=calPage.doSum("10","20");
		Assert.assertEquals(res, "30");
	}
	
	@Test(priority = 2)
	public void subTest() {
		String res=calPage.doSub("20","5");
		Assert.assertEquals(res, "15");
	}
	
	@Test(priority = 3)
	public void divTest() {
		String res=calPage.doDiv("100","20");
		Assert.assertEquals(res, "5");
	}

}
