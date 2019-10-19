package com.abc.www.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportPage extends Utilities{

	WebDriver driver;
	   
	   
	public SupportPage(WebDriver cdriver)
	{
		super();
		this.driver=cdriver;
	PageFactory.initElements(cdriver, this);
	}
	
	
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img") WebElement back;

	
	
	public boolean Gotoback(String txt)
	{
		boolean result=super.goback(back, txt);
		return result;
	}
	

}
