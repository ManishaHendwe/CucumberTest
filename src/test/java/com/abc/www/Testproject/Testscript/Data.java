package com.abc.www.Testproject.Testscript;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider(name="RegistrationData")
	public Object[][] testdata(){
		return new Object[][] {
			{"Manisha","Hendwe","3576569799","manish56@gmail.com","Pune","Maharashtra","440024","ANDORRA",
				"Student","maya","maya"}
			
				
			};
		}
	

}
