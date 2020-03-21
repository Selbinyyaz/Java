package com.syntax.class04;

import java.util.Scanner;

public class ReplQues033 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		  System.out.println("Please enter a number");
		  int num =input.nextInt();
		  //if a user enters a number and it is even, 
		  //print "Value is even", otherwise print "Value is odd"
          //If the number if even then check if it is greater than 1000 or not.
          //If the number is greater than 1000, then print "Even value is large", 
		  //else print "Even value is just right". 
		  
		  
	if(num%2==0){
		    System.out.println("Value is even");
		  
		    if(num>1000) {
		    	System.out.println("Even value is large");
		  
		  }else { 
		    	System.out.println("Even value is just right");
		  }
		    	
	}else {
		    System.out.println("Value is odd");
		  }
	}


}
