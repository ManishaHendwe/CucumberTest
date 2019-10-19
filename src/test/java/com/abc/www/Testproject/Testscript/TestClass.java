package com.abc.www.Testproject.Testscript;

import com.abc.www.homepage.Democlass;
import com.abc.www.homepage.Democlass1;
import com.abc.www.homepage.Student;

public class TestClass {

	public static void main(String []args) {
	//creating object of democlass

		
		//Democlass1 obj1=new Democlass1();
	Democlass obj=new Democlass1();
	Student obj1=new Student();
		//calling democlass method
		obj.sum(20,30);
		obj.compare(20, 10);
		obj.sum(12,10,15);
		obj.sum(12, 10.5);
		obj.concat();
	obj.sub(20, 5);
	obj1.Student_details(21, "Madhavi");
	obj1.Student_details(24, "Arna");
	obj1.Student_details(26, "Manisha");
	obj1.change();
	obj1.Student_details(34, "xyz");
	obj1.Student_details(24, "Arna");
	obj1.Student_details(26, "Manisha");
	
	}
	
}
