package com.syntax.class15;

public class Methods {
	//create a method that will say welcome 10 times
	void sayWelcome() {
		for (int i = 0; i < 10; i++) {
			System.out.println("welcome");
		}
	}

	void sayAnything(String word, int times) {
		for (int i = 1; i <= times; i++) {
			System.out.println(word);
		}

	}
	// create a method isItRaining 
	// that will 
	void isItRaining(boolean isRain) {
		if(isRain) {
			System.out.println("Learn java");
		}else {
			System.out.println("Go for walk");
		}
	}

}
