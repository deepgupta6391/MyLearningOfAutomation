package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadUsingAutoIT {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).click();
		Runtime.getRuntime().exec("F:\\Selenium Learning from Naveen\\AutoIt\\Fileupload.exe");
		Thread.sleep(3000);
		
	}

}
