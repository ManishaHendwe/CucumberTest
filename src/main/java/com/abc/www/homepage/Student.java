package com.abc.www.homepage;

public class Student {
	
	int age;
	static String course="Big data";
	String name;
	
	public void Student_details(int a,String name)
	{
		System.out.println("Student name is "+name+ "and age is"+a+"Cousers is"+course);
	}

	
	public static void change()
	{
		course="Selenium";
	}
	
}
