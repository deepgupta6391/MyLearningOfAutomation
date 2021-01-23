package com.qa.hubspot.tests;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.page.HomePage;
import com.qa.hubspot.page.LoginPage;
import com.qa.hubspot.util.AppConstants;
import com.qa.hubspot.util.Credentials;

public class HomePageTest {
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	LoginPage loginPage;
	HomePage homePage;
	Credentials userCred;

	@BeforeTest
	public void setUp() throws InterruptedException {
		basePage = new BasePage();
		prop = basePage.init_properties();
		String browserName = prop.getProperty("browser");
		driver = basePage.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		loginPage = new LoginPage(driver);
		userCred = new Credentials(prop.getProperty("username"), prop.getProperty("password"));
		homePage = loginPage.doLogin(userCred);
	}

	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String title = homePage.getHomePageTitle();
		System.out.println("home page title is : " + title);
		Assert.assertEquals(title, AppConstants.HOME_PAGE_TITLE);
	}

	@Test(priority = 2)
	public void verifyHomePageHeaderTest() {
		String header = homePage.getHomePageHeader();
		System.out.println("home page header is : " + header);
		Assert.assertEquals(header, AppConstants.HOME_PAGE_HEADER);
	}

	@Test(priority = 3)
	public void verifyLoggedInUserTest() {
		String accountName = homePage.getLogedInUserAccountName();
		System.out.println("logged in user account name : " + accountName);
		Assert.assertEquals(accountName, prop.getProperty("accountname"));
	}

	@Test(priority = 4)
	public void verifyHeaderContents() {
		List<String> actualArr = homePage.getHeaderContentsList();
		System.out.println("Actual list of contents : " + actualArr);
//		List<String> expectedArr = new ArrayList<String>();
//		expectedArr.add("Contacts");
//		expectedArr.add("Conversations");
//		expectedArr.add("Marketing");
//		expectedArr.add("Sales");
//		expectedArr.add("Service");
//		expectedArr.add("Automation");
//		expectedArr.add("Reports");
		System.out.println("Extected list of contents : " + Arrays.asList(AppConstants.HOME_PAGE_HEADER_CONTENTS));
		Assert.assertEquals(actualArr, Arrays.asList(AppConstants.HOME_PAGE_HEADER_CONTENTS));
	}

	@Test(priority = 5)
	public void verifyLinksUnderContacts() {
		List<String> valuesUnderContacts = homePage.getLinksUnderContacts();
		System.out.println("Actual list of contents under contacts: " + valuesUnderContacts);

//		List<String> expectedArr = new ArrayList<String>();
//		expectedArr.add("Contacts");
//		expectedArr.add("Companies");
//		expectedArr.add("Activity Feed");
//		expectedArr.add("Lists");
		System.out.println("Expected list of contents : " + Arrays.asList(AppConstants.LINKS_UNDER_CONTACTS));
		Assert.assertEquals(valuesUnderContacts, Arrays.asList(AppConstants.LINKS_UNDER_CONTACTS));
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
