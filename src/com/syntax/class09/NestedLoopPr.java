package com.syntax.class09;

public class NestedLoopPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 9; i++) {
			for (int y = 0; y <= 9; y++) {
				for (int z = 0; z <= 9; z++) {
					for (int c = 0; c <= 9; c++) {
						System.out.println(i + "" + y + "" + z + "" + c);
					}
				}
			}
		}

	}

}
