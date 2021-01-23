package SeleniumTutorialJavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		System.out.println(JavaScriptUtil.getTitleJS(driver));
		
		//JavaScriptUtil.generateAlert(driver, "This is my code");
		
		//JavaScriptUtil.refreshBrowserByJS(driver);
		
		//System.out.println(JavaScriptUtil.getBrowserInfo(driver));
		
//		JavaScriptUtil.sendkeysUsingJSWithId(driver, "username", "deep@gmail.com");
//		JavaScriptUtil.sendkeysUsingJSWithId(driver, "password", "Lovely1234");//		
//		WebElement login=driver.findElement(By.id("loginBtn"));
//		JavaScriptUtil.clickElementByJS(login, driver);
		
//		WebElement signUpLink=driver.findElement(By.linkText("Sign up"));
//		WebElement loginForm=driver.findElement(By.id("hs-login"));
		//JavaScriptUtil.drawBorder(loginForm, driver);
		
		//JavaScriptUtil.flash(loginForm, driver);
		
		//System.out.println(JavaScriptUtil.getPageInnerText(driver));
		driver.navigate().to("https://classic.crmpro.com/");
		Thread.sleep(5000);
		//JavaScriptUtil.scrollPageDown(driver);
		JavaScriptUtil.scrollIntoView(driver, driver.findElement(By.xpath("//h3[text()='Forms']")));

	}

}
