package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
	
		boolean classToday= true;// false
		boolean flag = true;// you can put false
		
		if (flag) {// if first one true then allow if conditions 
			// if false then all of them false
			System.out.println("hello");
		if (classToday) {
			System.out.println("Hello Friends");
		}else {
			System.out.println("Hello family");
		}
		}else {
			System.out.println("Bye");
		}
		System.out.println("I am outside of if condition");
	}

}
