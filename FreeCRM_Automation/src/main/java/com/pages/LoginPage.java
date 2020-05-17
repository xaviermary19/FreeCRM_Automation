package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.base.BasePage;

public class LoginPage extends BasePage {
	
	//WebDriver driver;
		
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")
	WebElement login;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")
	WebElement emailId;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")
	WebElement password;
	@FindBy(how = How.XPATH, using  = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	public void clickSigninLink() {
		
		login.click();
	}
	public HomePage signIn(String email, String pwd) {
		emailId.sendKeys(email);
		System.out.println(email);
		password.sendKeys(pwd);
		System.out.println(pwd);
		loginBtn.click();
		return new HomePage(driver);
		
	}

}
