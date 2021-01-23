package Java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreamAndFilter_Amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By linksList = By.tagName("a");
		List<WebElement> links = driver.findElements(linksList);
		System.out.println(links.size());

//		List<String> collectList=links.stream().filter(ele -> !ele.getText().equals("")&& ele.getText().contains("Amazon"))
//				.map(ele -> ele.getText()).collect(Collectors.toList());
		
		List<String> collectList=links.stream().filter(ele -> !ele.getText().isEmpty())
				.filter(ele->!ele.getText().startsWith(" "))
				.map(ele -> ele.getText().trim()).collect(Collectors.toList());
		collectList.stream().forEach(System.out::println);
	}

}
