package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Softwares/jars/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.xpath("//*[@id='uid-firstName-5']")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id='uid-lastName-6']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='uid-email-7']")).sendKeys("deeps@gmail.com");


	}

}
