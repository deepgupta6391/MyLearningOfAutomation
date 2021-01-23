package MyTests;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWithJava8 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		List<WebElement> linksList=driver.findElements(By.tagName("a"));		
		System.out.println(linksList.size());
		
		//1.
//		for (WebElement element: linksList) {
//			System.out.println(element.getText());
//		}
		
		//2.Java8		
		//linksList.forEach(ele -> System.out.println(ele.getText()));

		//3.
		//List<String> collectList=
							linksList.stream()
							.filter(ele -> !ele.getText().equals(""))
							.map(ele -> ele.getText())
							//.collect(Collectors.toList());
							.forEach(System.out::println);
		//collectList.forEach(System.out::println);
							
		//4.
//		String firstText=linksList.stream().filter(ele -> !ele.getText().equals("")).findFirst().get().getText();
//		System.out.println(firstText);
							
		//5.
//		String anyText=linksList.stream().filter(ele -> !ele.getText().equals("")).findAny().get().getText();
//		System.out.println(anyText);
		
		//6. exclude blank and include only those text starting with amazon
//		linksList.stream().filter(ele -> !ele.getText().equals("") && ele.getText().startsWith("Amazon"))
//		.map(ele -> ele.getText()).forEach(System.out::println);
		
		//7.
		linksList.stream()
					.filter(ele -> !ele.getText().isEmpty())
					.filter(ele -> ele.getText().startsWith(" "))
					.map(ele -> ele.getText().trim())
					.forEach(System.out::println);
		
		driver.quit();
	}

}
