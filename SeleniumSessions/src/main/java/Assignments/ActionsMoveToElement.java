package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//SpiceJet Website
public class ActionsMoveToElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		String loginSignup = "//a[@id='ctl00_HyperLinkLogin']";
		String members = "//a[contains(text(),'SpiceClub Members')]";
		String memberLogin = "//li[@class='hide-mobile']//a[contains(text(),'Member Login')]";
		String signup = "//li[@class='hide-mobile']//a[contains(text(),'Sign up')]";
		
		By loginBy=By.xpath(loginSignup);
		By membersBy=By.xpath(members);
		By memberLoginBy=By.xpath(memberLogin);
		By signupBy=By.xpath(signup);
		
		moveToElementUsingLocator(driver, loginBy);
		moveToElementUsingLocator(driver, membersBy);
		moveToElementUsingLocator(driver, memberLoginBy);
		moveToElementUsingLocator(driver, signupBy);
	}

	public static void moveToElementUsingLocator(WebDriver driver, By locator) {

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(locator);
		action.moveToElement(element).build().perform();
		System.out.println(element.getText());
		waitForElementToPresent(driver,locator, 5);
		
	}
	
	public static void waitForElementToPresent(WebDriver driver, By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
