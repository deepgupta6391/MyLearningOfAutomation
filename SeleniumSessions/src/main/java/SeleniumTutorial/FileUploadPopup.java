package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type="file" should be there
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Deepshikha\\Pictures\\city.jpg");
	}

}
