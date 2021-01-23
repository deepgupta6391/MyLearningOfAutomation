package SeleniumTutorialForXpathAndCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumTutorial.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_2 {
	static ElementUtil util;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://app.hubspot.com/login");

		util = new ElementUtil(driver);
		System.out.println("Title of the page is : " + util.waitForTitlePresent("Login", 5));

		// div[@class='input-group']//following::input[@name='username']
		// input[@name='username']//preceding::div
		// input[@name='username']//parent::div
		// div[@class='input-group']//child::input
		// div[@class='input-group']//ancestor::div

		// span[text()='test 0']//ancestor::td//preceding-sibling::td
		// span[text()='test 0']//ancestor::td//preceding-sibling::td//input
		// span[text()='test 0']//ancestor::td//preceding-sibling::td//child::input

		// span[text()='test 1']//ancestor::td//preceding-sibling::td//input

		driver.findElement(By.id("username")).sendKeys("deep.gupta.6391@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Lovely@1234");
		driver.findElement(By.id("loginBtn")).click();

		By header = By.xpath("//h1[@class='dashboard-selector__title']");
		util.waitForElementPresent(header, 10);

		driver.navigate().to("https://app.hubspot.com/contacts/7508022/contacts/list/view/all/");
		util.waitForTitlePresent("Contacts", 10);

		selectContact(driver, "naveen k");
		selectContact(driver,"test 1");
	}

	public static void selectContact(WebDriver driver,String name) {
		By nameCheckBox = By.xpath(
		"//span[text()='"+name+"']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__inner']");
		util.waitForElementToBeClickable(nameCheckBox,5);
		driver.findElement(nameCheckBox).click();
	}

}
