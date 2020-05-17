package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BasePage;

public class TaskPage extends BasePage {
	
	//WebDriver driver;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement newLink;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
	WebElement nTitle;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div")
	WebElement nAssignTo;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[1]/div/input")
	WebElement nDueDate;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[5]")
	WebElement ndateSelect;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[15]")
	WebElement ntime;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/input")
	WebElement ndeal;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[1]/div/div[1]/div/input")
	WebElement ncloseDate;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[4]")
	WebElement ncDateSelect;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[1]/div/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[10]")
	WebElement ncDateTime;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div/div/textarea")
	WebElement ndescription;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[1]/div/div/input")
	WebElement ncompletion;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[1]/div/div")
	WebElement nstatus;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[1]/div/div")
	WebElement nreview;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div")
	WebElement ntype;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div[2]/div[3]")
	WebElement ncustomerSupport;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/div/input")
	WebElement ncontact;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div/input")
	WebElement ncasetxt;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div")
	WebElement ntags;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[2]/div/div")
	WebElement npriority;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[2]/div/div/div[2]/div[4]")
	WebElement nhigh;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[2]/div/div/input")
	WebElement nidentifier;
	@FindBy(how = How.XPATH, using = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement saveBtn;
	
	public TaskPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void clickNewTask() {
		newLink.click();
	}
	public HomePage createNewTask(String title, String assignto, String deal, String description, String completion, String contact, String casetxt, String identifier) {
		
			nTitle.clear();
			nTitle.sendKeys(title);
		
			nAssignTo.sendKeys(assignto);
		
			nDueDate.clear();
			nDueDate.click();
			Actions action = new Actions(driver);
			action.moveToElement(ndateSelect).click().perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ntime);
			action.moveToElement(ntime).click().perform();
			
			ndeal.clear();
			ndeal.sendKeys(deal);
		
			ncloseDate.clear();
			ncloseDate.click();
			action.moveToElement(ncDateSelect).click().perform();
			js.executeScript("arguments[0].scrollIntoView(true);", ncDateTime);
			action.moveToElement(ncDateTime).click().perform();
			
			ndescription.clear();
			ndescription.sendKeys(description);
		
			ncompletion.sendKeys(completion);
		
			nstatus.click();
			action.moveToElement(nreview).click().perform();
			
		
			//WebDriverWait wait = new WebDriverWait(driver,30);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div")));
			//ntype.click();
			//action.moveToElement(ncustomerSupport).click().perform();
			
			ncontact.sendKeys(contact);
		
			ncasetxt.sendKeys(casetxt);
		
			//ntags.sendKeys(tag);
		
			npriority.click();
			action.moveToElement(nhigh).click().perform();
			
			nidentifier.sendKeys(identifier);
			
			saveBtn.click();
			return new HomePage(driver);
		}
		
	
	
}
