package SeleniumTutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/************Need to see tutorial*/
public class RobotTutorial {

	public static void main(String[] args) throws AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://tus.io/demo.html");
		WebElement chooseFile = driver.findElement(By.id("js-file-input"));
		chooseFile.click();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_PERIOD);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_X);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
}
