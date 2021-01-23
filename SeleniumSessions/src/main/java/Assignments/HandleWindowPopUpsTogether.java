package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowPopUpsTogether {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
				
		String parentWindowID=it.next();
		System.out.println("Parent window id is : "+parentWindowID);
		
		String childWindowID1=it.next();
		System.out.println("Child1 window id is : "+childWindowID1);
		driver.switchTo().window(childWindowID1);
		System.out.println("Child1 window title is : "+driver.getTitle());		
		driver.close();
		
		String childWindowID2=it.next();
		System.out.println("Child2 window id is : "+childWindowID2);
		driver.switchTo().window(childWindowID2);
		System.out.println("Child2 window title is : "+driver.getTitle());		
		driver.close();
		

		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is : "+driver.getTitle());
		driver.quit();

	}

}
