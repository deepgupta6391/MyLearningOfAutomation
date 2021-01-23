package SeleniumTutorialForXpathAndCSS;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_3 {

	public static void main(String[] args) {
		//a[contains(text(),'Divya Kannan')]//parent::td//preceding-sibling::td/input[@name='contact_id' and @type='checkbox']
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(10))
						.pollingEvery(Duration.ofSeconds(1))
						.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//strong[text()='Company']"))));
		
		WebElement element=driver.findElement(By.xpath
		("//a[contains(text(),'Divya Kannan')]//parent::td//preceding-sibling::td/input[@name='contact_id' and @type='checkbox']"));
		
		js.executeScript("arguments[0].scrollIntoView();",element );
		element.click();
		
		String company=driver.findElement(By.xpath("//a[contains(text(),'Divya Kannan')]//parent::td//following-sibling::td/a[@context='company']")).getText();
		System.out.println("Company name is : "+company);
		
	}

}
