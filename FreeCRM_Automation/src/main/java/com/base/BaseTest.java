package com.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	WebDriver driver;
	public static Properties prop;
	public BaseTest() {
		try {
			prop = new Properties();
			FileInputStream pfile = new FileInputStream(System.getProperty("user.dir") + "/resources/config.properties");
			prop.load(pfile);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@BeforeSuite()
	public void beforeSuite()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\antoj\\eclipse-workspace\\FreeCRM_Automation\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\antoj\\eclipse-workspace\\FreeCRM_Automation\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
			
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	@AfterSuite()
	public void tearDown() {
		//driver.close();;
	}
}
