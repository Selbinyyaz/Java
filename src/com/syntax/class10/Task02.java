package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all integer elements in an array.

		int[] numbers = { 1, 2, 5, 4, 7 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {

			sum += numbers[i];
			System.out.println(numbers[i]);

		}

		System.out.println("The sum of all integers are " + sum);
		System.out.println("Using another loops-----------------");
		int sum1=0;
		for(int i:numbers) {
			;
			sum1+=i;
		}
		System.out.println(sum1);

	}

}
