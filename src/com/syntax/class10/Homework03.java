package com.syntax.class10;

public class Homework03 {

	public static void main(String[] args) {
		// Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array: “Saturday is Java coding Day”.
		String[]words= {"Saturday","is","Java","coding","day"};
		for(int i=0; i<words.length;i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println();
		//2nd way
		for(String word:words) {
			System.out.print(word+" ");
		}
			
			//System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
			
		

	}

}
