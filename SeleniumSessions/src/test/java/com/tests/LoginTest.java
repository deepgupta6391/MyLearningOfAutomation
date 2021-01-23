package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;

	By username = By.id("username");
	By password = By.id("password");
	By login = By.id("loginBtn");
	By signup = By.linkText("Sign up");
	By homePageHeader = By.className("dashboard-selector__title");

	
	@Parameters({ "url", "browser" })
	@BeforeTest(alwaysRun = true)
	public void setUp(String appUrl, String browserName) throws Exception {
		System.out.println("before method -- setup");

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("please pass the correct browser name...");
			throw new Exception("NoSuch]BrowserException");
		}

		driver.get(appUrl);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 1,groups = {"login1","signup"})
	public void signUpLink() {
		System.out.println("test method 1");
		Reporter.log("This is the signup link test");
		Assert.assertTrue(driver.findElement(signup).isDisplayed());
	}

	@Test(priority = 2)
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertEquals(title, "HubSpot Login");
	}

	@Test(priority = 3, groups = {"login2"})
	@Parameters({ "username", "password" })
	public void loginTest(String emailID, String pwd) {
		driver.findElement(username).sendKeys(emailID);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login).click();
		String homePageHeaderVal = driver.findElement(homePageHeader).getText();
		Assert.assertTrue(homePageHeaderVal.contains("Sales Dashboard"));
	}

	@AfterTest(alwaysRun = true)
	public void tearDown() {
		System.out.println("After method -- tearDown");
		driver.quit();
	}
}
