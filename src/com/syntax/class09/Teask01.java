package com.syntax.class09;

public class Teask01 {

	public static void main(String[] args) {
		// Print the following pattern:
//		55555
//		4444
//		333
//		22
//		1  
		for (int i = 5; i >= 1; i--) {
			for (int y = 1; y <=i; y++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
		System.out.println("-------------------------");
		for (int i = 1; i <= 5; i++) {
			for (int y = 1; y <=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int y = 1; y <=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
