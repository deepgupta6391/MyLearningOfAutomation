package SeleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Softwares/jars/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//session id will be created here
		driver.get("https://google.com");
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//validation point:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}else {
			System.out.println("in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		//driver.quit();//session id will become null after this command
		driver.close();//session id will be shown but here the session id will expire or invalid after this command
		System.out.println(driver.getTitle());//Session ID is null. Using WebDriver after calling quit()-->NoSuchSessionException:

	}

}
