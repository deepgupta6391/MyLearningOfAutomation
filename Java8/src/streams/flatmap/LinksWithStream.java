package streams.flatmap;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksWithStream {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");

		// both are same
		// driver.findElements(By.cssSelector("ul.footer-nav > li"));
		// List<WebElement> footerList=driver.findElements(By.cssSelector("ul.footer-nav
		// li"));

		List<String> newFooterList = new ArrayList<>();
		
		driver.findElements(By.cssSelector("ul.footer-nav li")).stream()
				.forEach(ele -> newFooterList.add(ele.getText()));
		System.out.println("Size of the footer is : "+newFooterList.size());
		newFooterList.forEach(System.out::println);
		
		
		driver.quit();
	}

}
