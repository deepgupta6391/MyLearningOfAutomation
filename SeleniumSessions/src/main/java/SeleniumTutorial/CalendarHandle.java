package SeleniumTutorial;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {

	public static void main(String[] args) throws InterruptedException {

		LocalDate d = LocalDate.now();
		System.out.println(d);
		String currDate = d.toString().split("-")[2];
		// System.out.println(currDate);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Depart' and @type='text']")).click();
		Thread.sleep(2000);

		String departDate = "12";
		

		String startMonthValue=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
		
		while(!startMonthValue.contains("July 2021")) {
			driver.findElement(By.xpath("(//button[@class='ixi-icon-arrow rd-next'])[1]")).click();
			startMonthValue=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
		}

		if (Integer.valueOf(departDate) >= Integer.valueOf(currDate)) {
			// Departure selection
			List<WebElement> startDateList = driver
					.findElements(By.xpath("(//div[@class='rd-month'])[1]/table//div[contains(@class,'day')]"));
			for (WebElement e : startDateList) {
				if (e.getText().equals(departDate)) {
					e.click();
					break;
				}
			}

			// return selection
			driver.findElement(By.xpath("//input[@placeholder='Return' and @type='text']")).click();
			Thread.sleep(2000);
			
			String endMonthValue=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();
			
			while(!endMonthValue.contains("November 2021")) {
				driver.findElement(By.xpath("(//button[@class='ixi-icon-arrow rd-next'])[2]")).click();
				endMonthValue=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();
			}

			List<WebElement> endDateList = driver
					.findElements(By.xpath("(//div[@class='rd-month'])[4]/table//div[contains(@class,'day')]"));
			for (WebElement e : endDateList) {
				if (e.getText().equals("22")) {
					e.click();
					break;
				}
			}
			
			
		} else {
			System.out.println("Enter correct depart date");
		}
		
	}

}
