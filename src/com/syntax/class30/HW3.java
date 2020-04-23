package com.syntax.class30;
import java.util.*;
import java.util.Map.Entry;
public class HW3 {

	public static void main(String[] args) {
	//Create a Map that will store Employee name and salary.
	//Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
	//John Smith=$100000
		
		Map<String, Integer> employees = new LinkedHashMap<>();
		employees.put("John", 65000);
		employees.put("Adam", 75000);
		employees.put("Mark", 100000);
		employees.put("Isabella",96000);
		employees.put("Emma", 120000);
		employees.put("Sophie", 85000);
		System.out.println(employees);
		System.out.println("-----------Using Collections-------------------");
		System.out.println(Collections.max(employees.values()));
		System.out.println("-----------Using for loop-------------------");
		Set<Entry<String, Integer>>entry=employees.entrySet();
		
		for(Entry<String,Integer>obj:entry) {
			String key=obj.getKey();
			Integer value=obj.getValue();
			System.out.println(value);
		}
		
		
		
		
		

	}

}
