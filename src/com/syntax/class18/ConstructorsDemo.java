package com.syntax.class18;

public class ConstructorsDemo {
	static String str="Hello";
	
	ConstructorsDemo() {
		System.out.println("I am your constructor");
		System.out.println("I am non arguments constructor");
	}

	ConstructorsDemo(String str) {
		System.out.println("I am contructor with 1 string parameter " + str);
	}

	ConstructorsDemo(int num) {
		System.out.println("I am contructor with 1 integer value " + num);
	}

	ConstructorsDemo(String str, int num) {
		System.out.println("I am contructor with 2 parameters " + str + num);
	}

	void ConstructorsDemo() {// as soon as we add return type(void)---> it becomes METHOD!it is not recommend it.
		System.out.println();
	}

	public static void main(String[] args) {
		ConstructorsDemo obj = new ConstructorsDemo();
		ConstructorsDemo obj1 = new ConstructorsDemo(12);
	}
}
