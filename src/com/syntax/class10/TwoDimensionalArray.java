package com.syntax.class10;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		String[][] month = { { "January", "February", "December" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };
		//System.out.println(month[3][1]);
		//int rows = month.length;// how many arrays
		//int firstArray = month[0].length;
		//System.out.println(firstArray);

		for (int i = 0; i < month.length; i++) {// repeats over rows
			for (int j = 0; j < month[i].length; j++) {// repeats over columns
				System.out.print(month[i][j]+" ");

			}
			System.out.println();
		}
	}

}
