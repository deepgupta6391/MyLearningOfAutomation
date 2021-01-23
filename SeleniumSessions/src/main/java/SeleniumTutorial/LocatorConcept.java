package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Softwares/jars/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		Thread.sleep(5000);

		//1. id: - 1st priority, because it is unique
//		WebElement email=driver.findElement(By.id("username"));
//		email.sendKeys("deep.gupta.6391@gmail.com");
//		
//		WebElement pwd=driver.findElement(By.id("password"));
//		pwd.sendKeys("Lovely@123");

//		driver.findElement(By.id("username")).sendKeys("deep.gupta.6391@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Lovely@123");
		
		//2. name: - 2nd priority
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		//3.xpath: - III, in case of dynamic ids
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("deep.gupta.6391@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Lovely@123");
		
		//4.Css Selector: - III
//		driver.findElement(By.cssSelector("#username")).sendKeys("deep.gupta.6391@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("Lovely@123");
		
		//5. Class Name: - IV - least priority, bcz it is not always unique
		driver.findElement(By.className("login-email")).sendKeys("test123@gmail.com");
		driver.findElement(By.className("login-password")).sendKeys("test123");//working
		driver.findElement(By.className("m-bottom-3")).sendKeys("test123");//working
//		form-control private-form__control login-email
//		form-control private-form__control login-password m-bottom-3
		
		
		//6. linkText: used only for links
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7.partial link text
		driver.findElement(By.partialLinkText("Sign")).click();
		
	}

}
