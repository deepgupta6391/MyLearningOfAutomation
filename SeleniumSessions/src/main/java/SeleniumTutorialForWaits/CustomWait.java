package SeleniumTutorialForWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		// page objects:
		By emailId = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		getElementWithElement(driver, emailId, 6).sendKeys("deeps@gmail.com");
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(loginBtn).click();

	}

	public static WebElement getElementWithElement(WebDriver driver, By locator, int timeout) {
		WebElement element = null;
		for (int i = 0; i < timeout; i++) {
			try {
				element = driver.findElement(locator);
				break;
			} catch (Exception e) {
				try {
					System.out.println("Waiting for the element to be present on the page --> "+i+"secs");
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		return element;
	}
	
	public static boolean isElementDisplayed(WebDriver driver, By locator, int timeout) {
		WebElement element = null;
		boolean flag=false;
		for (int i = 0; i < timeout; i++) {
			try {
				element = driver.findElement(locator);
				flag=element.isDisplayed();
				break;
			} catch (Exception e) {
				try {
					System.out.println("Waiting for the element to be present on the page --> "+i+"secs");
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		return flag;
	}

}
