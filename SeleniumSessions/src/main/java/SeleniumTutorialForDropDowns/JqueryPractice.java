package SeleniumTutorialForDropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryPractice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();

		//selectValue(driver, "choice 2 3", "choice 4");
		selectValue(driver, "all");
	}

	public static void selectValue(WebDriver driver, String... values) {

		List<WebElement> choiceList = driver.findElements(By.xpath(
				"//input[@id='justAnInputBox']//parent::div//following-sibling::div//span[@class='comboTreeItemTitle']"));

		if (!values[0].equalsIgnoreCase("ALL")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (String value : values) {
					if (text.equals(value))
						choiceList.get(i).click();
				}
			}
		} else {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);
				choiceList.get(i).click();
			}
		}
	}
}
