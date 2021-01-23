package SeleniumTutorial;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//driver.findElement(By.id("username")).sendKeys(userMap.get("admin"));
//		driver.findElement(By.id("username")).sendKeys(userMap.get("patient").split("_")[0]);
//		driver.findElement(By.id("password")).sendKeys(userMap.get("patient").split("_")[1]);
		
		
		doLogin(driver, getUserMap(), "patient");
	}
	
	public static Map<String, String> getUserMap() {
		Map<String, String> userMap=new HashedMap<>();
		userMap.put("admin","admin");//username & password
		userMap.put("patient","tom@gmail.com_test123");
		userMap.put("doctor", "peter@gmail.com_test12345");
		
		return userMap;
	}

	public static void doLogin(WebDriver driver,Map<String,String> userMap,String userKey) {
		driver.findElement(By.id("username")).sendKeys(userMap.get("patient").split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(userMap.get("patient").split("_")[1]);
		
	}
}
