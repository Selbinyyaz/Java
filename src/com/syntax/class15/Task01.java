package com.syntax.class15;

public class Task01 {
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	void larger(int a, int b) {
		if(a>b) {
			System.out.println(a+" is larger than "+b);
		}else {
			System.out.println(a+" is larger than "+b);
		}

		
	}

	// Create a method that will take a number and prints whether the number is even
	// or odd.
	void evenOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a+" is even number");
		} else {
			System.out.println(a+" is odd number");
		}
	}

	// Create a method that will print whether given String is palindrome or not.
	void isPalindrome(String word) {
		String rev="";
		char[] array = word.toCharArray();
		
		for (int i = array.length - 1; i >= 0; i--) {
			rev += array[i];
		}
		if (rev.equalsIgnoreCase(word)) {
			System.out.println("This is palindrome");
		} else {
			System.out.println("This is not a palindrome");

		}
	}
     //Create a method that will say Hello in different language based on the country that will passed when method is executed. 
	void greet(String country, String language) {
		System.out.println("In "+country+" they say "+language);
	}
}
