package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {
	WebDriver driver;

	By termsServicesLink = By.linkText("HubSpot Customer Terms of Service.");
	By pageHeader = By.className("layout-header-title");
	By googleBtn = By.className("google-button");
	By signUp = By.linkText("Sign up");

	@BeforeTest(alwaysRun = true)
	@Parameters({ "url", "browser" })
	public void setUp(@Optional("optional value") String appUrl, String browserName) throws Exception {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("please pass the correct browser name...");
			throw new Exception("NoSuchBrowserException");
		}
		driver.get(appUrl);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 1,groups = {"login1","signup"})
	public void verifyCreateAccountTest() {
		// driver.findElement(signUp).click();
		Assert.assertTrue(driver.findElement(pageHeader).isDisplayed());
	}

	@Test(priority = 2,groups = {"signup"})
	public void verifyGoogleButton() {
		Assert.assertTrue(driver.findElement(googleBtn).isDisplayed());
	}

	@Test(priority = 3)
	public void verifyServicesAgreementLink() {
		Assert.assertTrue(driver.findElement(termsServicesLink).isDisplayed());
	}

	@AfterTest(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
