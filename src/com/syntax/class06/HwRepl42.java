package com.syntax.class06;

import java.util.Scanner;

public class HwRepl42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter the roll number of the Child");
		 int num = scan.nextInt();
		 
		 switch(num){
		   case 101:
		     System.out.println("Student name:Ramesh");
		     break;
		    case 102:
		     System.out.println("Student name:Mahesh");
		     break;
		    case 103:
		     System.out.println("Student name:Mukesh");
		     break;
		    default:
		    System.out.println("Not found Student name:in Class");
		    
		 
		 }

	}

}
