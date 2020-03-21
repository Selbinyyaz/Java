package com.syntax.class12;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Good Morning Students!";

		System.out.println("-------charAt() Function");
		char letter1 = str.charAt(0);
		System.out.println(letter1);

		System.out.println("Letter at index 4 is " + str.charAt(4));// there is space

		// get all characters 1 by 1 from a String?
		char letter;
		for (int i = 0; i < str.length(); i++) {
			letter = str.charAt(i);
			System.out.print(letter + " ");
		}
		System.out.println();
		System.out.println("-------indexOf Function");
		String name = "Syntax Technologies";
		int index= name.indexOf("y");
		System.out.println(index);
		
		index=name.indexOf(" ");
		System.out.println(index);
		
		System.out.println("Index of not existing character="+name.indexOf("!"));
		
		index=name.indexOf("Technologies");
		System.out.println(index);

	}

}
