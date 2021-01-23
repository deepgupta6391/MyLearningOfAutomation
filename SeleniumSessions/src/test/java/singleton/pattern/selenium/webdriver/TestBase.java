package singleton.pattern.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver = null;

	public static void initialize() {
		//singleton pattern
		if (driver == null) {

			if (Constants.browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (Constants.browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.url);
	}

	public static void quit() {
		System.out.println("quitting the browser");
		driver.quit();
		driver = null;
	}

	public static void close() {
		System.out.println("closing the browser");
		driver.close();
		driver = null;
	}
}
