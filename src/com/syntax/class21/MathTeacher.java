package com.syntax.class21;

public class MathTeacher extends Teacher{
	
	public MathTeacher(String name, String lastName) {
		//super();compiler will make call implicitly
		super(name,lastName);
		System.out.println("My math teacher is "+name);
	}

}
