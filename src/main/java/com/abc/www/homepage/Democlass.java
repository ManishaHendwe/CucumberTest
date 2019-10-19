package com.abc.www.homepage;

public class Democlass {
int x=50;
int y=20;
int z;
	public void sum(int a,int b) {
		x=x+++y++;
		y=++y+x--;
		z=x+y;
		System.out.println("Sum of two numbers: "+z);
		// TODO Auto-generated method stub

	}
	public void compare(int x,int y) {
		if (x>y)
		{
			System.out.println("x is greater than y");
		}
		else
		{
			System.out.println("y is greater than x");
		}
	}
public void sub(int a,int b)
{
}

	public void concat() {
	
		String str1="Manisha & ";
		String str2="Madhavi";
		String str3=str1.concat(str2);
		System.out.println("Two best friend "+ str3);
		
	}
	
	public void sum(int a,int b,int c) {
		z=a+b+c;
		System.out.println("Sum of three numbers is " +z);
		
	}
	
	public void sum(int a,double b)
	{
		double z=a+b;
		System.out.println("Sum of two numbers is " +z);
		
	}
	
	
}
