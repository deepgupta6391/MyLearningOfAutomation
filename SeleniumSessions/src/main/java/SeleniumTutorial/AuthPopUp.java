package SeleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//after passing user name and password for the java script pop up
		
		String username="admin";
		String password="admin";
		
		driver.get("http://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

	}

}
