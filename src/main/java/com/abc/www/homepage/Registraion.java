package com.abc.www.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registraion extends Utilities{
	
	WebDriver driver;
	public Registraion(WebDriver cdriver){
		super();
		this.driver=cdriver;
	PageFactory.initElements(cdriver, this);
	}
	
	@FindBy(name="firstName") WebElement fname;

	
	@FindBy(name="lastName") WebElement lname;
	@FindBy(name="phone") WebElement phone;
	@FindBy(name="country") WebElement country;
	@FindBy(name="userName") WebElement email;
	@FindBy(name="address1") WebElement address;
	@FindBy(name="city") WebElement city;
	@FindBy(name="state") WebElement state;
	@FindBy(name="postalCode") WebElement pcode;
	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement pwd;
	
	@FindBy(name="confirmPassword") WebElement cpwd;
	
	@FindBy(name="register") WebElement submit;
	
	public boolean Enterfname(String txt)
	{
		boolean result=super.entersafely(fname, txt);
		return result;
	}
	
	public boolean Enterlname(String txt)
	{
		boolean result=super.entersafely(lname, txt);
		return result;
	}
	
	
	public boolean Enterphone(String txt)
	{
		boolean result=super.entersafely(phone, txt);
		return result;
	}
	
	public boolean Enteemail(String txt)
	{
		boolean result=super.entersafely(email, txt);
		return result;
	}
	
	public boolean Entercity(String txt)
	{
		boolean result=super.entersafely(city, txt);
		return result;
	}
	
	
	public boolean Enterstate(String txt)
	{
		boolean result=super.entersafely(state, txt);
		return result;
	}
	
	public boolean Enterpostalcode(String txt)
	{
		boolean result=super.entersafely(pcode, txt);
		return result;
	}
	
	
	public boolean EnterCountry(String txt)
	{
		boolean result=super.selectfromdrop(country, txt);
		return result;
	}
	
	public boolean Enteruname(String txt)
	{
		boolean result=super.entersafely(uname, txt);
		return result;
	}
	
	
    public boolean Enterpass(String txt)
{
    	boolean result=super.entersafely(pwd, txt);
    	return result;
}
    
    public boolean Confirmpass(String txt)
    {
    	boolean result=super.entersafely(cpwd, txt);
    	return result;
    }

    public boolean Submit()
    {
    	boolean result=super.clickSafelyon(submit);
    	return result;
    }

    
    
}
