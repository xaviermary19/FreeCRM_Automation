package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.TaskPage;
import com.utils.ExcelHelper;

public class LoginPageTest extends BaseTest {
	
	LoginPage lp;
	ExcelHelper eh;
	
	String sheetName = "sheet1";
	
	@Test(priority =1)
	public void clickSigninLinkTest() throws InterruptedException {
		lp = new LoginPage(getDriver());
		lp.clickSigninLink();
		HomePage hp = lp.signIn(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority =2, dataProvider = "getTaskTestData")
	public void createNewTaskTest(String title, String assignto, String deal, String description, String completion, String contact, String casetxt, String identifier) throws InterruptedException {
		HomePage hp = new HomePage(getDriver());
		hp.clickTask();
		TaskPage tp = new TaskPage(getDriver());
		Thread.sleep(3000);
		tp.clickNewTask();
		
		eh = new ExcelHelper();
		hp = tp.createNewTask(title,assignto,deal,description,completion,contact,casetxt,identifier);
		
	}
	@DataProvider
	public Object[][] getTaskTestData(){
		Object data[][] = eh.getTaskData(sheetName);
		return data;
	}
	
		
}
	
	
	


