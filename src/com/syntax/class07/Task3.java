package com.syntax.class07;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//we are playing a lottery and a lucky number is 17
		// we want to keep asking user any number from 1-20
		//until he guess the lucky number--->congr
		
		
		Scanner scan = new Scanner(System.in);
		int num;
		int luckyNumber = 17;

		do {
			System.out.println("Hey enter any number between 1-20");
			num = scan.nextInt();
		} while (num != luckyNumber);
		System.out.println("Congralutaions!!!!!!!!");
		
// int num = 1;
// while (num <= 20) {
//			System.out.println("Hey enter number");
//			num++;
//			num = scan.nextInt();
//			if (num == 17){
//System.out.println("Congrulations!!!!!!");
//			}

//		}
	
		
	}

}
