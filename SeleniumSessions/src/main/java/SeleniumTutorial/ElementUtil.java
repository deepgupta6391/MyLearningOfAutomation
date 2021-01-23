package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method is used to create WebElement on the basis of By locator
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("some exception occurred while creating the webelement....");
			System.out.println(e.getMessage());
		}
		return element;
	}

	/**
	 * This method is used to click on element
	 * 
	 * @param locator
	 */
	public void doClick(By locator) {
		try {
			getElement(locator).click();
		} catch (Exception e) {
			System.out.println("some exception occurred while clicking on the webelement....");
			System.out.println(e.getMessage());
		}
	}

	public void soActionsClick(By locator) {
		Actions action = new Actions(driver);
		WebElement element = getElement(locator);
		action.click(element).perform();
	}

	/**
	 * This method is used to pass the values in a webelement
	 * 
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		try {
			getElement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println("some exception occurred while passing the value to the webelement....");
			System.out.println(e.getMessage());
		}
	}

	public void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		WebElement element = getElement(locator);
		action.sendKeys(element, value).perform();
	}

	// Custom wait utils

	/**
	 * Explicit wait method for the web element to be present
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public void waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * Explicit wait method for the web element to be visible as well as enabled to
	 * be clickable
	 * 
	 * @param locator
	 * @param timeOut
	 */
	public void waitForElementToBeClickable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * Explicit wait method not only wait for the web element to be visible and but
	 * also has a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 */
	public void waitForElementToBeVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * 
	 * @param elements
	 * @param timeOut
	 */
	public void visibilityOfAllElements(List<WebElement> elements, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	/**
	 * Explicit wait method to wait for the specific title of the web page and
	 * returns the title
	 * 
	 * @param title
	 * @param timeOut
	 * @return
	 */
	public String waitForTitlePresent(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	public String waitForUrl(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.urlContains(url));
		return driver.getCurrentUrl();
	}

	/**
	 * This only works for javascript alerts
	 * 
	 * @param timeOut
	 * @return
	 */
	public boolean waitForAlertToBePresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.alertIsPresent());// if alert is present it will return true
		return true;
	}

}
