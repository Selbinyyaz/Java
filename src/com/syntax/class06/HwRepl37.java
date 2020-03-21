package com.syntax.class06;

import java.util.Scanner;

public class HwRepl37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Are you thirsty?");
	    boolean thirsty = scan.nextBoolean();
	    System.out.println("Are you sleepy?");
	    boolean sleepy = scan.nextBoolean();
	    String drink;
	    
	    if(thirsty && !sleepy){
	      drink="Water";
	    }else if(thirsty && sleepy) {
	    	drink = "Coffee";
	    }else if(!thirsty && sleepy) {
	    	drink="Tea";
	    }else {
	    	drink="Nothing";
	    }
	    System.out.println("Looks like you need "+drink);
	  


	}

}
