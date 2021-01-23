package SeleniumTutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpHandle {
 
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String parentWindowID=it.next();
		System.out.println("Parent windows id is : "+parentWindowID);
		
		String childWindowID=it.next();
		System.out.println("Child window id is : "+childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println("Child window title is : "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is : "+driver.getTitle());

		driver.quit();
	}

}
