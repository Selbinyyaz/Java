package com.syntax.class19;

public class ConstructorsThis {
	
	ConstructorsThis() {
		this(1);
		System.out.println("Hi");

	}

	ConstructorsThis(int x) {
		this(1, 2);
		System.out.println("hello");
	}

	ConstructorsThis(int x, int y) {
		System.out.println("How are you");
	}

	public static void main(String[] args) {
		ConstructorsThis obj = new ConstructorsThis();
	}
}
