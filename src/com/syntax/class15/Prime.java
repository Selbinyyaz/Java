package com.syntax.class15;

public class Prime {
	//Write a method to return whether given number is prime or not?
	int givenNum(int given) {
		
		boolean isPrime = true;
		for (int i = 2; i < given; i++) {
			if (given % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(given + " is a prime number");
		} else {
			System.out.println(given + " is not a prime number");
		}
		return given;

	}
	public static void main(String[] args) {
		Prime number=new Prime();
		int pr=number.givenNum(6);
		//System.out.println(pr);
	}
}
	
	


