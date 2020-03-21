package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {
		
		//check if patient has any allergies
		// if no allergies ---> you are healthy
		// otherwise check if the patient has:
			//orange allergy----> do not eat oranges
			//apple allergy----> do not eat apples
			// kiwi allergy ----> do not eat kiwis
		
		boolean allergy = false;
		boolean appleAllergy = false;
		boolean orangeAllergy = true;
		boolean kiwiAllergy = false;
		
		if(allergy) {
			System.out.println("Please answer below");
			if (orangeAllergy) {
				System.out.println("don't eat oranges");
			}
				if (appleAllergy) {
					System.out.println("do not eat apple");
				}
			
		}else {
			System.out.println("you are healthy");
		}

	}

}
