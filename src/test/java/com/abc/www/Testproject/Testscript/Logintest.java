package com.abc.www.Testproject.Testscript;

import org.openqa.selenium.Alert;
//import junit.framework.Asser;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.abc.www.homepage.HomePage;
import com.abc.www.homepage.Registraion;

@SuppressWarnings("deprecation")
public class Logintest {

//	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
@Test(dataProvider="RegistrationData",dataProviderClass=Data.class)

	public void f1(String fname,String lname,String phone,String email, String city , String state, String postcode,String country,String uname, String pass,String cpass) throws InterruptedException {
		System.setProperty("webdriver.chrome.drever", "C:\\Users\\Sony\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.clickonRegister();
		
		Registraion reg=new Registraion(driver);
		reg.Enterfname(fname);
		reg.Enterlname(lname);
		reg.Enterphone(phone);
		reg.Enteemail(email);
		reg.Entercity(city);
		//Assert.assertTrue(hp.clickonRegister());
		//Assert.assertTrue("clicking on register link", hp.clickonRegister());
	
		
		//Assert.assertTrue("entering first name",reg.Enterfname("Manisha"));
//		Assert.assertTrue("entering last name",reg.Enterlname("Hendwe"));
//		Assert.assertTrue("entering phone number",reg.Enterphone("3576569799"));
//		Assert.assertTrue("entering email",reg.Enteemail("manish56@gmail.com"));
//		Assert.assertTrue("entering citye",reg.Entercity("Pune"));
//		Assert.assertTrue("entering state",reg.Enterstate("Maharashtra"));
//		Assert.assertTrue("entering postal code",reg.Enterpostalcode("440024"));
//		Assert.assertTrue("entering country",reg.EnterCountry("ANDORRA"));
//		Assert.assertTrue("entering uname",reg.Enteruname("Student"));
//		Assert.assertTrue("entering password",reg.Enterpass("maya"));
//		Assert.assertTrue("entering confirm pass",reg.Confirmpass("maya"));
//		Assert.assertTrue("entering submit button",reg.Submit());
//		
		
		
		//WebElement country=driver.findElement(By.name("country"));
		
		
		//sel.selectByVisibleText("ANDORRA ");
		//driver.switchTo().alert().sendKeys("abc");
		
		//Alert alt=driver.switchTo().alert();
		
//		alt.sendKeys("");
//		alt.accept();
//		alt.dismiss();
		//driver.switchTo().alert().dismiss(); -- to cancel the pop up
		
		
//		WebElement reg=driver.findElement(By.linkText("REGISTER"));
//		reg.click();
//		WebElement fname=driver.findElement(By.name("firstName"));
//		fname.sendKeys("Manisha");
//		WebElement lname=driver.findElement(By.name("lastName"));
//		lname.sendKeys("Hendwe");
//		WebElement phone=driver.findElement(By.name("phone"));
//		phone.sendKeys("9698575579");
//		WebElement email=driver.findElement(By.id("userName"));
//		email.sendKeys("manishh.45@gmail.com");
//		
//		WebElement address=driver.findElement(By.name("address1"));
//		address.sendKeys("kalapatru estate phase 1");
//		WebElement city=driver.findElement(By.name("city"));
//		city.sendKeys("Pune");
//		WebElement state=driver.findElement(By.name("state"));
//		state.sendKeys("Maharashtra");
//		
//		WebElement country=driver.findElement(By.id("userName"));
	
		Thread.sleep(5000);
		driver.close();
		
	}

}
