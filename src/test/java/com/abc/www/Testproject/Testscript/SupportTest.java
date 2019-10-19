package com.abc.www.Testproject.Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.abc.www.homepage.HomePage;
import com.abc.www.homepage.SupportPage;

public class SupportTest {
	WebDriver driver;
	@Test(priority=0)
	public void support() throws InterruptedException{
		System.setProperty("webdriver.chrome.drever", "C:\\Users\\Sony\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.clickonRegister();
		SupportPage sp=new SupportPage(driver);
		sp.Gotoback("submit");
		Thread.sleep(5000);
		driver.close();
		
		
		
	}
	
	@AfterSuite
	public void close()
	{
		driver.close();
	}
	
}
