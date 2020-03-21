package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please pay for a candy");
		int price = scan.nextInt();

		while (price != 2) {
			System.out.println("please pay for a candy");
			price = scan.nextInt();
		}
		System.out.println("--------------------------");
		
		do {
			System.out.println("please pay for a candy");
			price = scan.nextInt();

		}while(price !=2);
		
	}

}
