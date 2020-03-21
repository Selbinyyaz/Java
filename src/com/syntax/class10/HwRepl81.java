package com.syntax.class10;

public class HwRepl81 {

	public static void main(String[] args) {
		// Write a program that prints the highest value in the array.
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
		};
		int largest = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (largest < a[i][j]) {
					largest = a[i][j];
				}
			}

		}
		System.out.println(largest);
	}

}
