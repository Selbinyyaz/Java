package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		// how to print 50 to 1;
		// how to print odds numbers from to 1 to 20;

		int num = 50;
		while (num >= 1) {
			System.out.println(num);
			num--;
		}
		System.out.println("*********************");
		int num1 = 1;
		while (num1 < 20) {
			System.out.println(num1);
			num1 +=2;
		}
		System.out.println("------------------------");
		// 2 way using mod and if condition
		int x=1;
		while(x<=20) {
			if(x%2!=0) {
				System.out.println(x);
			}
			x++;
		}
		System.out.println("+++++++++++++++++++++++++++");
		// 3 way 
		int y = 1;
		while(y<=20) {
			System.out.println(y++);
			y++;
		}
		
	}

}
