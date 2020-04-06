package com.syntax.class21;

public class Parent {

	String name="Farid";
	String lastName="Smith";
	
	void hello() {
		System.out.println("I am parent class");
	}
}
class Child extends Parent{
	String name ="Ahmet";
	
	public void display() {
		System.out.println(name);
		System.out.println(super.name);// to call parent class
		System.out.println(lastName);// we don't need to put super because it is unique
	}
}