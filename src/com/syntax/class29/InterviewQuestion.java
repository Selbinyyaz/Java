package com.syntax.class29;
import java.util.*;
public class InterviewQuestion {

	public static void main(String[] args) {
		// how to remove duplicates from ArrayList
		
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
System.out.println("------------------------------");
		Set<String> set=new LinkedHashSet<>();
		set.addAll(aList);
		System.out.println(set);
		set.add("Alijon");
		set.add("Usman");
		
		//how to get only 1 value from set?
		if(set.contains("Jasmine")) {
			System.out.println("We have Jasmine");
		}
		System.out.println("--------Convert to ArrayList --------------");
		//1 convert to list
		List<String> list=new ArrayList<>(set);
		String name=list.get(4);
		System.out.println(name);
		list.add("Jane");
		list.add("Jane");
		list.add("Jane");
		System.out.println(list);
		System.out.println("--------Convert to Array --------------");
		//2 convert to array
		Object[] array=set.toArray();
		System.out.println(array[5]);
		//arrays is a utility class that have methods to work with arrays
		Arrays.sort(array);
		System.out.println("--------to sort any collection--------------");
		//to sort elements of any collection
		//collections is a utility class that have methods to work with collections
		Collections.sort(list);
		System.out.println(list);

		
		

	}

}
