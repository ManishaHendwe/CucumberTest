package com.abc.www.Testproject.Testscript;

import java.util.Scanner;

import com.abc.www.inheritance.Employee;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter emplyoee age :");
		
		int x=scn.nextInt();
		scn.nextLine();

System.out.println("Enter emplyoee name :");
		
		String y=scn.nextLine();
		//scn.nextLine();
		
		
		System.out.print("Enter emplyoee sal:");
		
		int z=scn.nextInt();
		
		obj.concat(x,y,z);
scn.close();
obj.autoboxing(x);
	}

}
