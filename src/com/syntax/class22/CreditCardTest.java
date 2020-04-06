package com.syntax.class22;

public class CreditCardTest {

	public static void main(String[] args) {
		
		CreditCard obj=new CreditCard();
		obj.interestRate=0.084;
		obj.numberOfPayments=12;
		obj.balance=3000;
		System.out.println("Given balance is "+obj.balance+" that interest is "+obj.interestFee());
		
		Visa obj1=new Visa();
		obj1.interestRate=0.084;
		obj1.numberOfPayments=12;
		obj1.balance=200;
		System.out.println("Given balance is "+obj1.balance+" that interest is "+obj1.interestFee());
		
		AX obj2=new AX();
		obj2.interestRate=0.084;
		obj2.numberOfPayments=12;
		obj2.balance=2500;
		System.out.println("Given balance is "+obj2.balance+" that interest is "+obj2.interestFee());
		
	}

}
