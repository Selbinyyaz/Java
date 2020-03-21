package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		// ask a user where he or she is from
		// based on the country we will define favorite food
		// your favorite food is ____
		
		String country;
		String favoriteFood;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country");
        country=scan.nextLine();
        
        switch(country) {
        case "Belarus":
        	favoriteFood="Potato";
        	break;
        case "Turkey":
        	favoriteFood="Baklava";
        	break;
        case "Asghanistan":
        	favoriteFood="Mantu";
        	break;
        case "Kazakhstan":
        	favoriteFood="Beshparmak";
        	break;
        case "Turkmenistan":
        	favoriteFood="Turkmen pilav";
        	break;
        default:
        	favoriteFood="Invalid";
        	
        }
        System.out.println("Your favorite food is "+favoriteFood);
	}

}
