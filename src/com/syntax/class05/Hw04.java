package com.syntax.class05;

import java.util.Scanner;

public class Hw04 {

	public static void main(String[] args) {
		//2.Program to find largest number among three numbers using 
		//nested if provided by a user (numbers must be distinct)
       
		Scanner input = new Scanner(System.in);
        System.out.println("Enter any three numbers");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int largest;
        
        if(x>y) {
        	//here x is already larger than y
        	if(x>z) {
        		largest = x;
        	}else {// x>y but x<z
        		largest=z;
        	}
        	
        }else {//y>x
        	if(y>z) {//y is larger than x and y is >z
        		largest =y;
        	}else {// y>x but y<z
        		largest = z;
        	}
        	System.out.println("Largest number is "+largest);
        }
	}

}
