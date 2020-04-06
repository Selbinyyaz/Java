package com.syntax.class22;

public class Bank {
	double money, fee;

	public Bank(double money) {// constructor;
		this.money = money;

	}

	double chargeFee() {//overridden method
		if (money < 1000) {
			fee = money * 0.1;
		} else {
			fee = 0;
		}

		return fee;

	}
}

class BandOfAmerica extends Bank {

	public BandOfAmerica(double money) {
		super(money);

	}

	double chargeFee() {// overridden method-->same return type;
		if (money < 1000) {
			fee = money * 0.2;
		} else {
			fee = 0;
		}

		return fee;

	}

}