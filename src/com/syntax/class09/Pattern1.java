package com.syntax.class09;

public class Pattern1 {

	public static void main(String[] args) {
		// print star;
		for (int i = 1; i <= 10; i++) {
			for (int y = 1; y <= 10; y++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// print 12345;
		for (int i = 1; i <= 4; i++) {
			for (int y = 1; y <= 5; y++) {
				System.out.print(y);
			}
			System.out.println();
		}

		// print 5 rows of 1-9
		for (int i = 1; i <= 5; i++) {
			for (int y = 1; y <= 9; y++) {
				System.out.print(y);
			}
			System.out.println();
		}

	}

}
