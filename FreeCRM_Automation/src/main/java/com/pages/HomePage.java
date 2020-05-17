package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.base.BasePage;

public class HomePage extends BasePage {

	@FindBy(how = How.XPATH, using = "//*[@id=\"main-nav\"]/a[6]/span")
	WebElement taskMenu;
	@FindBy(how = How.XPATH, using = "//*[@id=\"top-header-menu\"]/div[3]/span[2]/a")
	WebElement freeAccountLink;
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public void clickTask() {
		Actions action = new Actions(driver);
		action.moveToElement(taskMenu).click().build().perform();
	}
	public void clickFreeAccount() {
		Actions action = new Actions(driver);
		action.moveToElement(freeAccountLink).click().perform();;
	}
}
