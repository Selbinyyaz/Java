package com.syntax.class07;

public class IfWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean rain = true;
		if (rain) {// will print one statement
			System.out.println("Take umbrealla");
		}
		while (rain) {
			System.out.println("Take umbrealla");
			rain = false;
		}
		while (rain) {// not execute
			System.out.println("Take umbrealla");

		}

	}

}
