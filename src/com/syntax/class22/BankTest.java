package com.syntax.class22;

public class BankTest {

	public static void main(String[] args) {
		Bank obj = new Bank(700);
		double fee = obj.chargeFee();
		System.out.println(fee);
		
		BandOfAmerica obj1=new BandOfAmerica(700);
		System.out.println(obj1.chargeFee());

	}

}
