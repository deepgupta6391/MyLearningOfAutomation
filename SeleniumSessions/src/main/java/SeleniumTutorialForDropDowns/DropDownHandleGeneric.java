package SeleniumTutorialForDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleGeneric {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		
		By industry=By.id("Form_submitForm_Industry");
		By country=By.id("Form_submitForm_Country");
		
//		Select select1=new Select(driver.findElement(country));
//		select1.selectByVisibleText("India");
//		
//		Select select2=new Select(driver.findElement(industry));
//		select2.selectByVisibleText("Education");
		
//		doSelectByDropDownIndex(industry, 4);
//		doSelectByDropDownValue(country, "India");
		
		selectDropDownValue(industry, DropDown.INDEX.toString(), "3");
		
	}
	
	
	public static void selectDropDownValue(By locator,String type,String value) {
		
		Select select=new Select(getElement(locator));
		
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibletext":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("please pass the correct selection criteria");
			break;
		}
	}
	
	
	
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByVisibleText(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public static void doSelectByDropDownIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByDropDownValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
}
