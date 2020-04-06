package com.syntax.class15;

public class MethodsReturningValue01 {
	int largest(int a, int b) {
		int largest1;
		if (a > b) {
			largest1 = a;

		} else {
			largest1 = b;
		}
		return largest1;

	}

	public static void main(String[] args) {
		MethodsReturningValue01 obj = new MethodsReturningValue01();
		System.out.println(obj.largest(12, 2));
		// or we can do differently
		int larg = obj.largest(23, 5);
		System.out.println(larg);

	}
}
