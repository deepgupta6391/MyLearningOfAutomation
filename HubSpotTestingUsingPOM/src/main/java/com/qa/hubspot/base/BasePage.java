package com.qa.hubspot.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	WebDriver driver;
	Properties prop;
	public static boolean highlightElement;

	public WebDriver init_driver(String browserName) {
		highlightElement = prop.getProperty("highlight").equals("yes") ? true : false;
		System.out.println("browser name is: " + browserName);

		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();

			if (prop.getProperty("headless").equals("yes")) {
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--headless");
				driver = new ChromeDriver(co);
			} else {
				driver = new ChromeDriver();
			}
		}

		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			if (prop.getProperty("headless").equals("yes")) {
				FirefoxOptions fo = new FirefoxOptions();
				fo.addArguments("--headless");
				driver = new FirefoxDriver(fo);
			} else {
				driver = new FirefoxDriver();
			}
		}

		else if (browserName.equals("ie")) {
			WebDriverManager.iedriver().setup();
			InternetExplorerOptions ieo = new InternetExplorerOptions();
			ieo.setCapability("requireWindowFocus", true);
			ieo.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			driver = new InternetExplorerDriver(ieo);
		} else if (browserName.equals("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("browser Name " + browserName + " is not found, please pass the correct browser");
		}

		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.manage().window().fullscreen();
		driver.manage().window().maximize();

		// driver.get(url);

		return driver;
	}

	public Properties init_properties() {
		prop = new Properties();
		String path = null;
		String env = null;

		try {
			env = System.getProperty("env");
			if (env.equals("qa")) {
				path = "./src/main/java/com/qa/hubspot/config/qa.config.properties";
			} else if (env.equals("stg")) {
				path = "./src/main/java/com/qa/hubspot/config/stg.config.properties";
			}
		} catch (Exception e) {
			path = "./src/main/java/com/qa/hubspot/config/config.properties";
		}

		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("some issue with config properties.... Please correct your config...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}