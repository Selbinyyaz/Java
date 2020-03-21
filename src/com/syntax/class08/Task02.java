package com.syntax.class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// Write a program to ask a user to enter item they want to buy 
		//and the price of that item.
		//Every time user enters money accumulate(toplamak) the amount 
		//and tell the user how much is left to pay off the amount. 
		//If user give more money program should return a change. 
		//Whenever a user done with payments program should say “Thank you for shopping!”
		Scanner scan;
		String item;
		double price;
		double money;
		double amount=0;
		double change;
		double remainingBalance;
		
		scan = new Scanner(System.in);
		System.out.println("what are you buying today?");
		item = scan.nextLine();

		System.out.println("What is the price for the " + item);
		price = scan.nextDouble();
		do {
			System.out.println("please give a payment");
			money = scan.nextDouble();
			amount = amount + money;
			if (amount < price) {
				remainingBalance = price - amount;
				System.out.println("please give me more " + remainingBalance);
			} else if (amount > price) {
				change = amount - price;
				System.out.println("here is your change");
				break;
			}

		} while (price != amount);

		System.out.println("Thank you for shopping");

	}

}
