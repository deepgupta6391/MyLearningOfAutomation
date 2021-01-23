package com.qa.hubspot.page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.util.AppConstants;
import com.qa.hubspot.util.ElementUtil;

public class HomePage extends BasePage {

	WebDriver driver;
	ElementUtil elementUtil;

	By header = By.cssSelector("h1.dashboard-selector__title");
	By headerContentsList = By.xpath("//div[@class='mobile-nav-left-container']//a[@class='primary-link']");
	By accountMenuLink = By.id("account-menu");
	By accountName = By.xpath("//a[@class='navAccount-current']/div[@class='navAccount-accountName']");
	By contactsLink=By.xpath("//div[@class='nav-left']//a[@id='nav-primary-contacts-branch']");
	By optionsUnderContactsLink = By.xpath("//div[@class='mobile-nav-left-container']//a[@id='nav-primary-contacts-branch']//following-sibling::div//a/div[contains(@style,'color')]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil=new ElementUtil(driver);
	}

	public String getHomePageTitle() {
		elementUtil.waitForTitlePresent(AppConstants.HOME_PAGE_TITLE);
		return elementUtil.doGetPageTitle();
	}

	public String getHomePageHeader() {
		elementUtil.waitForElementPresent(header);
		return elementUtil.doGetText(header);
	}

	public String getLogedInUserAccountName() {
		//driver.findElement(accountMenuLink).click();
		elementUtil.waitForElementPresent(accountMenuLink);
		elementUtil.doClick(accountMenuLink);
		Actions action = new Actions(driver);
		action.moveToElement(elementUtil.getElement(accountName)).perform();
		return elementUtil.doGetText(accountName);
	}

	public ArrayList<String> getHeaderContentsList() {
		elementUtil.waitForElementVisible(contactsLink);
		List<WebElement> listOfHeaderContents = driver.findElements(headerContentsList);
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 1; i < listOfHeaderContents.size(); i++) {
			arr.add(listOfHeaderContents.get(i).getAttribute("textContent").trim());
		}
		return arr;
	}

	public List<String> getLinksUnderContacts() {
		driver.findElement(contactsLink).click();
		List<WebElement> listUnderContacts = driver.findElements(optionsUnderContactsLink);
		List<String> textUnderContacts = new ArrayList<String>();
		for (int i = 0; i < listUnderContacts.size(); i++) {
			//System.out.println(listUnderContacts.get(i).getAttribute("textContent").trim());
			textUnderContacts.add(listUnderContacts.get(i).getAttribute("textContent").trim());
		}
		return textUnderContacts;
	}
}
