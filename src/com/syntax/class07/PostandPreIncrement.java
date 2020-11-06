 package com.syntax.class07;

public class PostandPreIncrement {

	public static void main(String[] args) {
		// preIncrement ++y
		//postIncrement y++

		int a = 10;
		a = a++;
		System.out.println(a);
		System.out.println("-----------------------");
		int x = 10;
		int y;
		y = x++;
		System.out.println(x);
		System.out.println(y);

		System.out.println("-------------------");

		int num1 = 1;
		while (num1 <= 5) {
			System.out.println(num1++);
		}
		System.out.println("********************");
		int num2 = 1;
		while (num2 <= 5) {
			System.out.println(++num2);
		}

	}

}
