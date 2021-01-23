package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllSelectedValuesFromMultiSelectList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));		
		List<WebElement> selectOpt=new Select(month).getAllSelectedOptions();		
		for(int i=0;i<selectOpt.size();i++) {
			System.out.println(selectOpt.get(i).getText());
		}
		
		
		month.click();
		
		Select select=new Select(month);
		
		List<WebElement> opt=select.getOptions();
		System.out.println(opt.size());// returns the count
//		try {
//			driver.wait();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		month.sendKeys("Mar");

		
	
		
		

	}

}
