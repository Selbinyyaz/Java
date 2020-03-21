package com.syntax.class09;

public class ArraysIntro {

	public static void main(String[] args) {
		// declare an array and initialize it and store values
		int[] array = new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		//access elements from an array
		System.out.println(array[1]);
		
		//second way
		//Storing elements into array
		String[] carArray = new String[3];
		carArray[0]="BMW";
		carArray[1]="Honda";
		carArray[2]="Toyota";
		System.out.println("I am driving "+carArray[2]);
		
		
		//Change an Array Element
		//To change the value of a specific element, refer to the index number:
		int[] numbers = new int[4];
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		//change value of numbers[0]
		numbers[0]=40;
		System.out.println(numbers[0]);

	}

}
