package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageToUseUtil {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");	
		
		//page objects:
		By emailId=By.id("username");
		By password=By.id("password");
		By loginBtn=By.id("loginBtn");

	

		ElementUtil util=new ElementUtil(driver);
		
		String title=util.waitForTitlePresent("HubSpot", 10);
		System.out.println(title);
		
		util.waitForElementPresent(emailId, 15);
		util.doSendKeys(emailId,"test@gmail.com");
		
		util.doSendKeys(password,"password");
		
		util.waitForElementPresent(loginBtn, 5);
		util.doClick(loginBtn);	
		
		

	}

}
