package SeleniumTutorialForDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValues {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);
	}
	
	/**
	 * This method get the list of all values in the drop down list
	 * @param element
	 */
	public static void getDropDownValues(WebElement element) {
		System.out.println("===================================================");
		Select select = new Select(element);

		List<WebElement> dropList = select.getOptions();
		System.out.println("Total number of values in the drop down : " + dropList.size());

		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
			System.out.println(text);
		}
	}

}
