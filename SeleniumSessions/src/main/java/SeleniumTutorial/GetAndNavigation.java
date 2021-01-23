package SeleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Softwares/jars/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.amazon.com");//once the page is fully loaded it go to next line and get the title of the page
		
		driver.navigate().to("https://www.amazon.com");//it will not wait for the page to fully load and once the title of the page is visible it will execute the next line
		
		System.out.println(driver.getTitle());

	}

}
