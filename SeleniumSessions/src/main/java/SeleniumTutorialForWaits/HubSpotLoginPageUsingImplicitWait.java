package SeleniumTutorialForWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageUsingImplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		//applied for all the elements
		//global wait
		//dynamic wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		WebElement emailID = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		emailID.sendKeys("test@gmail.com");
	}

}
