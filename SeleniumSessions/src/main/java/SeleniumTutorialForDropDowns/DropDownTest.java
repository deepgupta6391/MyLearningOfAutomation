package SeleniumTutorialForDropDowns;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		String date = "20-Dec-1996";
		String dateVal[] = date.split("-");
		DropDownUtil.selectValueFromDropDownByText(month, dateVal[1]);
		DropDownUtil.selectValueFromDropDownByText(day, dateVal[0]);		
		DropDownUtil.selectValueFromDropDownByText(year, dateVal[2]);

		ArrayList<String> dayValues = DropDownUtil.getDropDownValues(day);
		System.out.println(dayValues);
//		for(String val:dayValues) {
//			System.out.println(val);
//		}
		
		//dayValues.forEach(val -> System.out.println(val));

		ArrayList<String> monthList = DropDownUtil.getDropDownValues(month);
		System.out.println(monthList);
		ArrayList<String> yearList = DropDownUtil.getDropDownValues(year);
		System.out.println(yearList);
	}

}
