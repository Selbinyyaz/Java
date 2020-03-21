package com.syntax.class07;

public class HW01 {

	public static void main(String[] args) {
		// //Print even numbers from 20 to 1 (2 ways)
		//1 way
		int num3 = 20;
		while (num3 >= 1) {
			System.out.println(num3);
			num3 -= 2;
		}
		System.out.println("----------------------");

		// 2 way
		for (int i = 20; i >= 1; i -= 2) {
			System.out.println(i);
		}
		System.out.println("----------------------");
		// Print odd numbers between 20 and 50 (2 ways)
		int num5 = 20;
		num5++;
		while (num5 <= 50) {
			System.out.println(num5);
			num5 += 2;

		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
		for (int x = 20; x < 50; x++) {
			x++;
			System.out.println(x);
			
		}
		

	}

}
