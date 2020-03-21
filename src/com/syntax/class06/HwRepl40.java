package com.syntax.class06;

import java.util.Scanner;

public class HwRepl40 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String name = scan.nextLine();
		String responsibility = null;

		switch (name) {
		case "Shiva":
			responsibility = "Java Assignment";
			//use it system
			break;
		case "Sandish":
			responsibility = "SDLC Assignment";
			break;
		case "Weqas":
			responsibility = "Selenium Assignment";
			break;
		case "Asel":
			responsibility = "every Assignment";
			break;
		default:
			System.out.println("Invalid instructor selected");

		}
		if (name.equals("Shiva") || name.equals("Sandish") || name.equals("Weqas") || name.equals("Asel")) {
			System.out.println("Will take care of " + responsibility);
		}
	}

}
