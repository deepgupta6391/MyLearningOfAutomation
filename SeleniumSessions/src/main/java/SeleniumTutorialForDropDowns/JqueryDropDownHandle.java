package SeleniumTutorialForDropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		

		 selectChoiceValues(driver, "choice 2", "choice 6 2 3", "choice 2 3");
		// selectChoiceValues(driver, "choice 7");
		//selectChoiceValues(driver, "All");
	}

	/**
	 * This method accepts single as well as multiple values to select the checkbox
	 * 
	 * @param driver
	 * @param values
	 */
	public static void selectChoiceValues(WebDriver driver, String... values) {
		List<WebElement> choiceList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));

		if (!values[0].equalsIgnoreCase("ALL")) {
			for (int i = 0; i < choiceList.size(); i++) {
				System.out.println(choiceList.get(i).getText());
				String text = choiceList.get(i).getText();

				for (String val : values) {
					if (text.equals(val)) {
						choiceList.get(i).click();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}
				}

			}
		}
		// select all values
		else {
			try {
			for (int all = 0; all < choiceList.size(); all++) {
				System.out.println(choiceList.get(all).getText());
				choiceList.get(all).click();
			}
		} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
