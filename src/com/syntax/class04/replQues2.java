package com.syntax.class04;

import java.util.Scanner;

public class replQues2 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Please enter the length");
		    int length = scan.nextInt();
		    System.out.println("Please enter the width");
		    int width = scan.nextInt();
		    
		    int rectangle = length*width;
		    
		    
		    if(rectangle>=288){
		      System.out.println("The shape of your object is rectangle");
		    }else{
		      System.out.println("The shape of your object is square");
		    }
	}

}
