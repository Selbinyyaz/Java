package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 10;

		if (time < 12) {
			System.out.println("Good morning");
		}
		// while (time<12){
		// System.out.println("Good morning");// code will execute infinitely

		while (time < 12) {//if time >12 will be show nothing because it is false
			System.out.println("Good morning");
			time++;// we use increment to limit the loop;
		}
         //how to print numbers from 1 to 50?
		int num=1;
		while(num<=50) {
			System.out.println(num);
			num++;// num--; infinity
		}
		System.out.println("***********************************");
		//how to print number from 5 to 15 all in 1 line 
		int num2=5;
		while(num2<=15) {
			System.out.print(num2+" ");
			num2++;
		}
		//how to print values from 10 to 1
		int num3= 10;
		while(num3>1) {
			System.out.println(num3);
			num3--;
		}
	}
}
