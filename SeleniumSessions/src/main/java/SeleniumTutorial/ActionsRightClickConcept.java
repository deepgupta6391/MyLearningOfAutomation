package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsRightClickConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickMeElement=driver.findElement(By.className("context-menu-one"));
		
		Point point =rightClickMeElement.getLocation();
		System.out.println(point.x+" "+point.y+" "+point.getY());
		
		System.out.println(rightClickMeElement.getSize());
		Rectangle rec=rightClickMeElement.getRect();
		System.out.println(rec.getHeight()+" "+rec.getWidth()+" "+rec.getX());
		
		Actions action=new Actions(driver);
		
		action.contextClick(rightClickMeElement).build().perform();
		
		
		String text=driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-copy')]/span")).getText();
		System.out.println(text);
	}

}
