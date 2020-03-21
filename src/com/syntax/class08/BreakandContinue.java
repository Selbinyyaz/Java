package com.syntax.class08;

public class BreakandContinue {

	public static void main(String[] args) {
		// once i=4---> we want to stop the loop
		System.out.println("------------BREAK------------");
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				break;
			}
			// I am inside for loop
			System.out.println(i);
		}
		// we want skip 4
		// 1,2,3,skip,5,6,7,8,9,10
		System.out.println("------------CONTINUE------------");
		for (int y = 1; y <= 6; y++) {
			if (y == 4) {
				continue;
			}
			// I am inside the for loop
			System.out.println(y);
		}
		System.out.println("------------CONTINUE example------------");
		//write a program that print numbers from 1 to 10
		// i don't know want to print 5, 6 7;
		for (int x = 1; x < 11; x++) {
			if (x == 5 || x == 6 || x == 7) {
				continue;
			}

			System.out.println(x);
		}
		System.out.println("------------CONTINUE example------------");
		// write a program that print numbers from 1 to 100
        // i do not want to print between 35-55
		for (int z = 1; z <= 100; z++) {
			if (z >= 35 && z <= 55) {
				continue;
			}
			System.out.println(z);
		}
	}

}
