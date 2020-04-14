package com.syntax.class_Interface;

public class MarksTest {

	public static void main(String[] args) {
		Marks obj=new A(60, 70, 80);
		System.out.println(obj.getPercentage());
		
		Marks obj1=new B(56, 67, 78, 90);
		System.out.println(obj1.getPercentage());

	}

}
