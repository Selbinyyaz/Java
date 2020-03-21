package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
		// good morning 5 times
		
		for (int b = 1; b < 6; b++) {// for loop good choice when you know number repeat
			System.out.println("Good morning");
		}
// while loop---> you don't know number repeat 
//do while	
		
		
		System.out.println("---------------------------");
		//print numbers from 10 to 1
		for(int i=10; i>=1;i--) {
			System.out.println(i);
			
		}
		System.out.println("---------------------------");
		int sum=0;
		for(int x=1;x<5;x++) {//0+1=1; 1+1=2; 2+1=3; 3+1=4;--->x<5
//			4+1=5--->false
			
			sum=sum+x;
		}
		System.out.println(sum);
	}
	

}
