package com.syntax.class09;

public class NestedLoop {

	public static void main(String[] args) {
		// using nested loop to print clock 23 to 59(hour--->h; minute-->m
		for (int h = 0; h <= 23; h++) {
			for (int m = 0; m <= 59; m++) {
				if (m < 10) {
					System.out.println(h + ":0" + m);

				} else {
					System.out.println(h + ":" + m);
				}
			}

		}
	}

}
