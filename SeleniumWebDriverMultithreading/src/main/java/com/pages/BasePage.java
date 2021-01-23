package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	public WebDriver driver;

	// init driver:
	public WebDriver setUp(String browserName) {

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\jars\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\jars\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;
	}
}
