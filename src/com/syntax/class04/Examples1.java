package com.syntax.class04;

import java.util.Scanner;

public class Examples1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
	    String gender = scan.next();
	    gender = "F";
	    if(gender=="F") {
	    	System.out.println("Woman");
	    }if(gender=="M")
	    	System.out.println("Man");
	    

	}

}
