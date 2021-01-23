package selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFFOnGrid {

	WebDriver driver;
	
	@Test
	public void getTitle() {
		
		//-------------------1 Way--------------------------
		//1. define desired capabilities
//		DesiredCapabilities cap=DesiredCapabilities.firefox();
//		cap.setBrowserName("firefox");
//		cap.setPlatform(Platform.WINDOWS);
//		
//		//2.Firefox options def:
//		FirefoxOptions options=new FirefoxOptions();
//		options.merge(cap);
		
		//----------------------2nd Way-------------------------
		FirefoxOptions options=new FirefoxOptions();
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
		cap.setPlatform(Platform.WINDOWS);
		
		String hubUrl="http://localhost:4444/wd/hub";
		try {
			driver =new RemoteWebDriver(new URL(hubUrl), cap);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("https://google.com");
		System.out.println("Title is : "+driver.getTitle());
		driver.quit();
	}
}
