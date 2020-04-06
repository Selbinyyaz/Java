package com.syntax.class14;

public class MethodExamples {
	//want to create a method that will be greeting a person
	
	void greet(){
		System.out.println("Hello Gul");
		
	}
	void greet1(String name) {
		System.out.println("Hello "+name);
	}
		public static void main(String[] args) {
			//how do i call method greet? first we need to create an object of the class
			//where that method belongs
			
			//className variable = new className();
			MethodExamples object1=new MethodExamples();
			
			object1.greet1("Sarmed");
			object1.greet1("Guljemal");
			//object1.greet1('C');--> ce: not applicable type
			
		}
	
}
