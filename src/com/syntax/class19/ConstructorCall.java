package com.syntax.class19;

public class ConstructorCall {
	
	public ConstructorCall() {
		System.out.println("I am non argument constructor");
	}
	public ConstructorCall(String str) {
		this();//always must be first line inside the constructor
	}
	public ConstructorCall(String str, String str1) {
		//this("bye","good");//CE: we need to call constructor(String str1, string str2)
		this("bye");
	}
	public static void main(String[] args) {
		ConstructorCall obj=new ConstructorCall("Hello","thank");
	}
}
