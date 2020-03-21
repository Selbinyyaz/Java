package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
		// nested loop----> rows-->outer loop
		//                 columns--->inner loop
		//5555
		//4444
		//3333
		//2222
		//1111
		for (int i = 5; i >= 1; i--) {
			for (int y = 5; y >=1; y--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		//print 54321
		//       54321
		//      54321
		//
		for (int i = 1; i <= 5; i++) {
			for (int y = 5; y >=1; y--) {
				System.out.print(y);
			}
			System.out.println();
		}

	}

}
