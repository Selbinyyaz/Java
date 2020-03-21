package com.syntax.class09;

public class Hw02 {

	public static void main(String[] args) {
// Create an array of names and store all names of your group. 
//Then print your name from that array. (use 2 different ways of creating an array).
		
		String[]name=new String[6];
		name[0]="Patyshagul";
		name[1]="Selbi";
		name[2]="Julia";
		name[3]="Arzu";
		name[4]="Adil";
		name[5]="Azra";
		System.out.println(name[1]);
		
		//2nd way
		String[]names= {"Patyshagul","Julia","Arzu","Adil","Selbi","Azra"};
		System.out.println(names[4]);

	}

}
