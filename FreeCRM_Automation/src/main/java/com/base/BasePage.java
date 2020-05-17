/*
 * Develop AutomationFramework(Minimum 4 Pages) from scratch on https://freecrm.co.in/ , 
 * push into GitHub and Share the Link.
//1. Page Object Pattern 2. UI Mapping 3. Data Driven 4. Support for Edge, Chrome, Firefox and HTMLUnit 
//5. Preference to CSS and XPath Selectors 6. TestNG HTML report and Extent Reports. 7. implement EventFiringWebDriver 
//8. Log4J 9. Analyze the code with FindBugs and CheckStyles(IDE plugins) solve violations and bugs then 
 * push it into GitHub
 * 
 * 
 */

package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


 protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
}
