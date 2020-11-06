package com.syntax.class13;

public class even {

	public static void main(String[] args) {
		
//		If n is odd, print Weird
//		If n is even and in the inclusive range of 2 to 5, print Not Weird
//		If n is even and in the inclusive range of 6 to 20, print Weird
//		If n is even and greater than 20, print Not Weird
		
		int n = 24;

		if (n % 2 == 1) {// even
			System.out.println("Weird");
		} else if (n >= 2 && n <= 5) {
			System.out.println("Not weird");
		} else if (n >= 6 && n <= 20) {
			System.out.println("weird");
		} else {
			System.out.println("not weird");
		}
	}

}
