package com.test;

import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.TaskPage;

public class TaskPageTest extends BaseTest {

	TaskPage tp;
	
	@Test
	public void createTaskTest() {
		tp = new TaskPage(getDriver());
		
		
		tp.clickNewTask();
		tp.setNTaskTitle("UI Test1");
		tp.setNTaskAssignTo("JoJo");
		tp.setNTaskDueDate();
		tp.setNDeal("20");
		tp.setNTaskCloseDate();
		tp.setNDescription("Test API");
		tp.setNCompletion("In Process");
		tp.setNStatus();
		tp.setNType();
		tp.setNContact("velu");
		tp.setNCase("API Test");
		tp.setNTag("api");
		tp.setNPriority();
		tp.setNIdentifier("JoJo@gmail.com");
	}
}
