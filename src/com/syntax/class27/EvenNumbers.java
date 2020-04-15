package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers {

	public static void main(String[] args) {
//4. Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i <= 50; i += 2) {
			numbers.add(i);
		}
		System.out.println(numbers);

		System.out.println("------Iterator------");
		Iterator<Integer> num = numbers.iterator();
		while (num.hasNext()) {
			if (num.next() % 5 == 0) {
				num.remove();
			}

		}
		System.out.println(numbers);
	}
}