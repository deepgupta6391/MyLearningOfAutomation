package SeleniumTutorialForXpathAndCSS;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.espncricinfo.com/series/18902/scorecard/1157752/india-vs-west-indies-1st-test-west-indies-in-india-2018-19");
		// a[contains(text(),'KL Rahul')]//parent::td//following-sibling::td

		//WebElement noThanks=driver.findElement(By.xpath("//button[@id='wzrk-cancel']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='wzrk-cancel']")));
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
		WebElement firstTable = driver.findElement(By.xpath("//h5[contains(text(),'India 1st INNINGS ')]"));
			
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", firstTable);

		System.out.println(getScoreCard(driver, "Virat Kohli"));
		System.out.println(getWicketTaker(driver,"Virat Kohli"));
	}

	public static ArrayList<String> getScoreCard(WebDriver driver,String name) {
		List<WebElement> playerDetails = driver
				.findElements(By.xpath("//a[contains(text(),'"+name+"')]//parent::td//following-sibling::td"));

		ArrayList<String> ar=new ArrayList<String>();
		
		for (int i = 1; i < playerDetails.size(); i++) {
			ar.add(playerDetails.get(i).getText());
		}
		
		return ar;
	}
	
	public static String getWicketTaker(WebDriver driver,String name) {
		return driver.findElement(By.xpath("// a[contains(text(),'"+name+"')]//parent::td//following-sibling::td//span[@class='cursor-pointer']")).getText();
	}

}
