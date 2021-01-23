package streams.flatmap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerStream {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://popuptest.com/goodpopups.html");

		driver.findElement(By.linkText("Good PopUp #2")).click();
		
		String title=switchToWindow(driver, "PopupTest");
		System.out.println(title);
		
		driver.quit();
	}

	public static String switchToWindow(WebDriver driver, String title) {

		return driver.getWindowHandles()
					.stream()
						.map(handler -> driver.switchTo().window(handler).getTitle())
							.filter(ele -> ele.contains(title))
								//.findFirst()
									.findAny()
									.orElseThrow(() -> {
										throw new RuntimeException("No Such Window");
				});
	}

}
