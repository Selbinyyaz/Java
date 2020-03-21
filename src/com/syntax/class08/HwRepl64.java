package com.syntax.class08;

import java.util.Scanner;

public class HwRepl64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp;
		int end;
		System.out.print("Int:");
		// write your code below
		inp = new Scanner(System.in);
		end = inp.nextInt();
		for (int i = 0; i < (2 * end); i++) {

			System.out.print(i + " ");
		}
	}

}
