package Java8.streams;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStream_OrangeHRM {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry=By.id("Form_submitForm_Industry");
		By country=By.id("Form_submitForm_Country");
		
		By industry_options=By.xpath("//select[@id='Form_submitForm_Industry']/option");
		
		
		
		//option 1
		Select industryOptions=new Select(driver.findElement(industry));
		List<WebElement> indus_list=industryOptions.getOptions();
		indus_list.stream().forEach(ele->System.out.println(ele.getText()));
		System.out.println("*******************************");
		//option 2
		
		long startTime=System.currentTimeMillis();
		
		List<WebElement> indus_list_again=driver.findElements(industry_options);
		//indus_list_again.stream().forEach(ele->System.out.println(ele.getText()));
		indus_list_again.parallelStream().forEach(ele->System.out.println(ele.getText()));
		
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

}
