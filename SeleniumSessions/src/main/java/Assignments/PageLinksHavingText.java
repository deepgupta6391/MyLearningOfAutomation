package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLinksHavingText {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

		List<WebElement> listLinks = driver.findElements(By.tagName("a"));

		System.out.println("Number of links in the home page is : " + listLinks.size());

		for (int i = 0; i < listLinks.size(); i++) {
			String text = listLinks.get(i).getText();
			if (!text.isEmpty()) {
				System.out.println(text);
			}
		}
	}

}