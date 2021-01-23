package SeleniumTutorialForXpathAndCSS;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreBoard {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.espncricinfo.com/series/18902/scorecard/1157752/india-vs-west-indies-1st-test-west-indies-in-india-2018-19");

		WebElement firstInningsTable = driver.findElement(By.xpath("//h5[contains(text(),'India 1st Innings ')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(0);", firstInningsTable);

		List<WebElement> batsMenList = driver.findElements(By.xpath(
				"//h5[contains(text(),'India 1st Innings')]//ancestor::span[@class='Collapsible__trigger is-open']//following-sibling::div[@class='Collapsible__contentOuter']//table[@class='table batsman']//a"));

		for (int i = 0; i < batsMenList.size(); i++) {
			// System.out.println(batsMenList.get(i).getText().trim());
			String playerName = batsMenList.get(i).getText();

			if (playerName.length() <= 7) {
				System.out.print(playerName + "\t" + "\t");
			} else {
				System.out.print(playerName + "\t");
			}

			if (playerName.contains("(")) {
				playerName = playerName.substring(0, playerName.indexOf("(") - 1);
			} else if (playerName.contains("†")) {
				playerName = playerName.substring(0, playerName.indexOf("†") - 1);
			} else {
				playerName = playerName.trim();
			}

			getScoreCard(driver, playerName);
			System.out.println();
		}
	}

	public static void getScoreCard(WebDriver driver, String playerName) {
		List<WebElement> playerDetails = driver.findElements(By.xpath(
				"//h5[contains(text(),'India 1st Innings')]//ancestor::span[@class='Collapsible__trigger is-open']//following-sibling::div[@class='Collapsible__contentOuter']//table[@class='table batsman']//a[contains(text(),'"
						+ playerName + "')]//parent::td//following-sibling::td"));

		for (int i = 1; i < playerDetails.size(); i++) {
			System.out.print(playerDetails.get(i).getText() + "\t");
		}

	}

}
