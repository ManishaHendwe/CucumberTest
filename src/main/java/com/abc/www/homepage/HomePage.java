package com.abc.www.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utilities {
   WebDriver driver;
   
   
	public HomePage(WebDriver cdriver)
	{
		super();
		this.driver=cdriver;
	PageFactory.initElements(cdriver, this);
	}
	
	@FindBy(linkText="REGISTER") WebElement reg;
	@FindBy(linkText="SUPPORT") WebElement suport;
	@FindBy(className="REGISTER") WebElement reg1;
	@FindBy(xpath="//[@class='REGISTER']") WebElement reg3;
   @FindBy(xpath="// [contains(@class,'REGISTER')]") WebElement reg4;
	
	@FindBy(linkText="Sign On") WebElement sign;
	@FindBy(linkText="Support") WebElement support;
	@FindBy(linkText="Contact") WebElement contact;
	@FindBy(linkText="FLIGHT") WebElement flight;
	@FindBy(linkText="HOTELS") WebElement hotels;
	@FindBy(linkText="CAR RENTALS") WebElement carrent;
	@FindBy(linkText="CRUISES") WebElement cruises;
	@FindBy(linkText="DESTINATION") WebElement desti;
	@FindBy(linkText="VACATION") WebElement vacation;
	
	public boolean clickonRegister() {
		boolean result=super.clickSafelyon(reg);
		return result;
	}
	
	
	
}
