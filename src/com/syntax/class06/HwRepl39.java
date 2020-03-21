package com.syntax.class06;

import java.util.Scanner;

public class HwRepl39 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    System.out.println("Please enter your mark");
	    int num= scan.nextInt();
	    char grade = 0;
	    
		if (num > 1 && num < 25) {
			grade = 'F';
			System.out.println("Your grade is " + grade);
		} else if (num > 25 && num < 45) {
			grade = 'E';
			System.out.println("Your grade is " + grade);
		} else if (num > 45 && num < 50) {
			grade = 'D';
			System.out.println("Your grade is " + grade);
		} else if (num > 50 && num < 60) {
			grade = 'C';
			System.out.println("Your grade is " + grade);
		} else if (num > 60 && num < 80) {
			grade = 'B';
			System.out.println("Your grade is " + grade);
		} else if (num > 80) {
			grade = 'A';
			System.out.println("Your grade is " + grade);
		} else {
			System.out.println("Please enter valid mark");
		}
//if(grade!=0){
//    System.out.println("Your grade is +grade);		
	}

}
