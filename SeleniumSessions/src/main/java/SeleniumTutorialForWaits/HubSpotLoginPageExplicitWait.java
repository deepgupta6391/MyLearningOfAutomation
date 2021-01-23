package SeleniumTutorialForWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageExplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		//wait1.until(ExpectedConditions.titleContains("HubSpot"));
		//OR
		wait1.until(ExpectedConditions.titleIs("HubSpot Login"));
		
		System.out.println(driver.getTitle());
		
		By emailId=By.id("username");

		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
		//TimeoutException: Expected condition failed:
		//waiting for presence of element located by: By.id: 
		//username (tried for 3 second(s) with 500 milliseconds interval)
		
		WebElement email=driver.findElement(emailId);
		email.sendKeys("test@gmail.com");
		
//		WebElement emailID = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		

	}

}
