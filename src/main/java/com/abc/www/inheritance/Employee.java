package com.abc.www.inheritance;

public class Employee {

	
	int age;
	String name;
	int sal;
	
	
		
		public void concat(int x,String y,int z)
		
		{
			age=x;
			name=y;
			sal=z;
			System.out.println("Emp age is "+x+" name is "+y+" and salray is"+z);
		}
		// TODO Auto-generated method stub

	
public void autoboxing(int x) {
	Integer i=new Integer(age);
	System.out.println("Autoboxig is running" +i);
}
}
