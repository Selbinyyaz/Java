package com.syntax.class30;
import java.util.*;


public class AllMaps {

	public static void main(String[] args) {
		// lets create a grocery map(item, quantity) in which we do not care about the order
       Map<String, Integer>grocery=new HashMap<>();
       grocery.put("milk",1 );
       grocery.put("cucumber", 3);
       grocery.put("banana",12 );
       grocery.put("cheese", 2);
       grocery.put("grapes", 3);
     
       System.out.println(grocery);
       
       
       //create a map of item to buy(item, quantity) in which we want save the order
       Map<String, Integer>household=new LinkedHashMap<>();
       household.put("lysol",2 );
       household.put("santizer",2 );
       household.put("paper towel",3);
       household.put("toilet paper",10 );
       household.put("face mask",50 );
       System.out.println(household);
       
      //create a map in which we store all previous items in ascending order
       Map<String, Integer>shopping=new TreeMap<>();
       shopping.putAll(grocery);
       shopping.putAll(household);
       System.out.println(shopping);
      
       
       System.out.println("---------------Getting all keys----------------");
       //get all keys using loop
       for(String key:shopping.keySet()) {
    	   System.out.println("Key :"+key);
       }
       System.out.println("---------------Using iterator----------------");
       Iterator<String> it=shopping.keySet().iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
       
       System.out.println("---------------Getting all values----------------");
       for(int v:shopping.values()) {
    	   System.out.println(v);
       }
       System.out.println("---------------Using iterator----------------");
       Iterator<Integer> iterator=shopping.values().iterator();
       while(iterator.hasNext()) {
    	   System.out.println(iterator.next());
    	   
    	   
    		ArrayList<String> aList = new ArrayList<>();
    		
    		aList.add("John");
    		aList.add("Jane");
    		aList.add("James");
    		aList.add("Jasmine");
    		aList.add("Jane");
    		aList.add("James");
    		
    		LinkedHashSet<String>llist=new LinkedHashSet<String>();
    		llist.addAll(aList);
    		System.out.println(llist);
    		
    		

       }
	}

}
