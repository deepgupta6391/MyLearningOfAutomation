package desiredcapabilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IE {

	public static void main(String[] args) {
		WebDriverManager.iedriver().setup();

//		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
//		cap.setCapability("browserstack.sendKeys", "true");
//		InternetExplorerOptions op=new InternetExplorerOptions(cap);
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://app.hubspot.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("username")).sendKeys("deep.gupta.6391@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Lovely@1234");
		WebElement btn=driver.findElement(By.id("loginBtn"));
//		Actions action=new Actions(driver);
//		action.moveToElement(btn).click().build().perform();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn);

		
	}

}
