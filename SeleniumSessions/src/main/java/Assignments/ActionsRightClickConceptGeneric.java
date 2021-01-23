package Assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsRightClickConceptGeneric {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickMeElement = driver.findElement(By.className("context-menu-one"));

		Actions action = new Actions(driver);

		action.contextClick(rightClickMeElement).build().perform();
		
		String locator="//ul[contains(@class,'context-menu-list')]/li/span";
		
		System.out.println(getRightClickOptions(driver, locator));

	}
	
	public static ArrayList<String> getRightClickOptions(WebDriver driver,String locator) {
		List<WebElement> listOfElements=driver.findElements(By.xpath(locator));
		System.out.println(listOfElements.size());
		
		ArrayList<String> ar=new ArrayList<>();
		
		for(WebElement ele:listOfElements) {
			String text=ele.getText();
			//System.out.println(text);
			ar.add(text);
		}
		return ar;
	}

}
