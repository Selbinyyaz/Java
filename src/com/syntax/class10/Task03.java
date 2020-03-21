package com.syntax.class10;

public class Task03 {

	public static void main(String[] args) {
	//Create an array of countries. 
	//While retrieving all values from an array print capital for each country. (use 2 different loops). 
		String[] countries = { "Turkmenistan", "France", "Turkey", "USA", "Canada" };
		for (String capital : countries) {
			if (capital.equals("Turkmenistan")) {
				System.out.println(capital + ": Ashgabat");
			} else if (capital.equals("France")) {
				System.out.println(capital + ": Paris");
			} else if (capital.equals("Turkey")) {
				System.out.println(capital + ": Ankara");
			} else if (capital.equals("USA")) {
				System.out.println(capital + ": Washington");
			} else {
				System.out.println(capital + ": Ottowa");
			}
		}
		System.out.println("----------------2nd way-----------");
		String capital = null;
		for (int i = 0; i < countries.length; i++) {
			switch (countries[i]) {
			case "Turkmenistan":
				capital = "Ashgabat";
				break;
			case "France":
				capital = "Paris";
				break;
			case "Turkey":
				capital = "Ankara";
				break;
			case "USA":
				capital = "Washington";
				break;
			case "Canada":
				capital = "Ottowa";
				break;
			}
			System.out.println(capital);
		}
	}

}
