package com.abc.www.homepage;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilities {

	public boolean clickSafelyon(WebElement ele) {
		try {
		ele.click();
		return true;
	}
		catch(NoSuchElementException e) {
			//throw new RuntimeException("Element you are finding is not on page" +e);
			System.out.println("Element you are finding is not on page");
			return false;
		}catch(ElementNotVisibleException exe)
		{
			//throw new RuntimeException("Element is not visible" +exe);
			
			System.out.println("Element is not visible");
			return false;
		}catch(Exception ex) {
			//throw new RuntimeException("Exception has occured" +ex);
			System.out.println("Exception has occured");
			return false;
		}
	}
	
	public boolean entersafely(WebElement ele, String txt)
	{
		ele.sendKeys(txt);
		return true;
	}
	
	public boolean goback(WebElement ele, String txt)
	{
		ele.sendKeys(txt);
		return true;
	}
	
	public void enternumber(WebElement ele, int number)
	{
		//ele.se(number);
	}
	
	public boolean selectfromdrop(WebElement ele,String txt)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(txt);
		return true;
	}
}
