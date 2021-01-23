package SeleniumTutorial;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkTest2 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		DesiredCapabilities handleSSlErr = DesiredCapabilities.chrome();

		// 1 way didnt work
//		handleSSlErr.acceptInsecureCerts();		

		// 2 way
		handleSSlErr.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		handleSSlErr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		ChromeOptions co = new ChromeOptions();
		co.merge(handleSSlErr);

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		//driver.get("https://makemysushi.com/404?");
		driver.get("https://www.macys.com/");

		// links-- //a href<http://www.google.com>
		// images-- //img href<http://www.test.com>

		// 1. get the list of all the links and images
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));

		System.out.println("size of full links and images--->" + linksList.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		// 2. iterate linksList:
		for (int i = 0; i < linksList.size(); i++) {
			System.out.println(linksList.get(i).getAttribute("href"));
			if (linksList.get(i).getAttribute("href") != null && (!linksList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linksList.get(i));
			}
		}

		// get the size of all active links list:
		System.out.println("size of active links and images--->" + activeLinks.size());

		//3. check the href url, with httpconnection api:
		//200 -- ok
		//404 -- not found
		//500 -- internal error
		//400 -- bad request
		//403 -- forbidden
		//302 -- moved temporarily
		for (int j = 0; j < activeLinks.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			String response=connection.getResponseMessage();//ok
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"---------"+response);
		}
	}

}
