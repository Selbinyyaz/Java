package com.syntax.class22;

public class CreditCard {
//Create a class CreditCard and define variable balance and interest. 
//Create an instance method that will calculate interest based on the given balance. 
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
//Call the method by creating an object of each of the three classes.
	double balance, interest;
	double interestRate;
	int numberOfPayments;
	

	public double interestFee() {

		 interest = (interestRate / numberOfPayments) * balance;
        return interest;
	}

}

class Visa extends CreditCard {

}

class AX extends CreditCard {
	
	public double interestFee() {
		return interest = (interestRate / numberOfPayments) * balance;

	}
}