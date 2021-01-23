package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorText {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("loginBtn")).click();

		Thread.sleep(3000);
		
		String errorMsgTitle=driver.findElement(By.className("private-alert__title")).getText();
		String errorMsgText=driver.findElement(By.className("private-alert__body")).getText();
		System.out.println(errorMsgTitle);
		System.out.println(errorMsgText);
	}

}
