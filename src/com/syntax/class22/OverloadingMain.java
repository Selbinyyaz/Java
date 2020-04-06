package com.syntax.class22;

public class OverloadingMain {

	public static void main(int[] args) {
		System.out.println("Method with int array arguments");

	}
	public static void main(String args) {
		System.out.println("method with string argument");
	}
	public static void main(String args, String args1) {
		System.out.println("method with 2 string argument");
	}
	public static void main(String args, int num) {
		System.out.println("method with 2 string argument");
	}
	public static void main(int num, String args) {
		System.out.println("method with 2 string argument");
	}
	public static void main(String[] args) {//Java always looks for this main method with this signature
		System.out.println("Method with String array arguments");
		OverloadingMain.main("str");
		main("hi","Hello");
		main(new int[2]);
		
	}
}
