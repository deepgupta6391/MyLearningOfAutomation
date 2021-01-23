package SeleniumTutorialForXpathAndCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumTutorial.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_1 {

	public static void main(String[] args) {
		
//		XPATH:
//			1.	//htmltag[@prop1=’value]
//			Ex: //input[@id=’username’]
//			Ex://*[@id=’username’]
//
//			2.	//htmltag[@prop1=’value’ and @prop2=’value’]
//			Ex: //input[@id=’username’ and @type=’email’]
//
//			Note: even more than 2 property can be given using the above  syntax.
//
//			3.	Contains() in xpath:
//			•	//htmltag[contains(@prop,’value’)]
//			•	If id is dynamic like:
//			<input id=’test_123’>
//			<input id=’test_232’>
//			<input id=’test_143’>
//			<input id=’test_153’>
//				//input[contains(@id,’test_’)]
//				
//			•	(//input[contains(@class,'form-control')])[1]
//			Or
//			(//input[contains(@class,'form-control')])[position()=1]
//
//			•	(//input[contains(@class,'form-control')])[2]
//			Or
//			(//input[contains(@class,'form-control')])[position()=2]
//
//			•	(//input[contains(@class,'form-control')])[last()] =>it goes to the last element of this xpath
//			4.	text() in xpath:
//			•	Formula: //htmltag[text()=’value’]
//			Ex: //i18n-string[text()='Forgot my password']
//			Ex: //i18n-string[text()="Don't have an account?"]
//			Ex: //i18n-string[contains(text(),'have an account?')]	
//			5.	starts-with  in xpath:
//			//htmltag[starts-with(@prop,’value’)]
//			Ex: //button[starts-with(@class,'uiButton')]/i18n-string
//			Ex: //img[starts-with(@class,'nav')]
//			Ex: //h1[starts-with(text(),'Sales')]
//
//			6.	parent child:
//			//div//input  -- indirect child
//			//div/input  --direct child

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		ElementUtil util=new ElementUtil(driver);
		System.out.println("Title of the page is : "+util.waitForTitlePresent("Login", 5));
		
		boolean res=driver.findElement(By.xpath("//i18n-string[contains(text(),\"Don't have an account?\")]")).isDisplayed();
		System.out.println(res);
				
		By username=By.id("username");
		By password=By.id("password");
		By login=By.id("loginBtn");
		
		util.doSendKeys(username, "deep.gupta.6391@gmail.com");
		util.doSendKeys(password, "Lovely@1234");
		util.doClick(login);
		
		By header=By.xpath("//h1[@class='dashboard-selector__title']");		
		util.waitForElementPresent(header, 10);
		
		String headerValue=driver.findElement(header).getText();
		System.out.println("The header value is "+headerValue);
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Sales Dashboard']")).isDisplayed());
	}

}
