package com.syntax.class30;
import java.util.*;
public class HW5 {

	public static void main(String[] args) {
		//Create a collection of integers in which you can keep duplicates. 
		//Write a logic to find sum of all integers
		List<Integer>numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		int sum=0;
		for(int i=0;i<numbers.size();i++) {
			sum=sum+numbers.get(i);
		}
		System.out.println("Total number is "+sum);
		
		

	}

}
