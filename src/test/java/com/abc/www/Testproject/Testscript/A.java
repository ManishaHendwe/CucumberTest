package com.abc.www.Testproject.Testscript;

import com.abc.www.inheritance.Employee;

public class A{
	
	public void finalize() {
		System.out.println("Finalize block executed");
	}
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		A e1=new A();
		A e2=new A();
		e1=null;
		e2=null;
		System.gc();
		System.out.println("FINALIZED RUN");
	}

}
