package SeleniumTutorialForDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		selectValueFromDropDownByText(day, "6");
		selectValueFromDropDownByText(month, "Jun");
		selectValueFromDropDownByText(year, "2013");
		
		selectValueFromDropDownByIndex(day, 30);
		
		Select select=new Select(day);
		System.out.println(select.isMultiple());
		List<WebElement> options=select.getOptions();
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}
		
		System.out.println("**********************************");
		
		
	}
	
	
	/**
	 * This method is used to select the value from a drop down on the basis of given text
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDownByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	/**
	 * This method is used to select the value from a drop down on the basis of given index
	 * @param element
	 * @param index
	 */
	public static void selectValueFromDropDownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

}
