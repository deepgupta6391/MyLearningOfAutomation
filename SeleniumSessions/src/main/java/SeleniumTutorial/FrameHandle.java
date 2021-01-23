package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://londonfreelance.org/courses/frames/index.html");
		List<WebElement> frameList=driver.findElements(By.tagName("frame"));
		System.out.println(frameList.size());
		frameList.forEach(name -> System.out.println(name.getAttribute("name")));
		System.out.println("========================================================");
		
		//WebElement frameElement=driver.findElement(By.name("main"));
		
		//driver.switchTo().frame(frameElement);
		
		//driver.switchTo().frame("main");
		driver.switchTo().frame(2);
		
		String text=driver.findElement(By.cssSelector("body > h2")).getText();		
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		

	}

}
