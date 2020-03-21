package com.syntax.class04;

import java.util.Scanner;

public class ReplHW {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your name");
		 String name = scan.nextLine();
		 
		 System.out.println("Enter your mobile number");
		 String phone1 = scan.nextLine();
		 
		 
		 
		 System.out.println("Enter your age");
		 int age = scan.nextInt();
		 
		 System.out.println("Your name is "+name + " your age is "+age+" your mobile number is "+phone1);

	}

}
