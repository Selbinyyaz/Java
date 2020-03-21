package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		// 
      
		int hour= 22;
		String timeOfDay;
		
		if(hour>=1 && hour<=11) {
			timeOfDay="Morning";
		}else if(hour>=12 && hour<=15) {
			timeOfDay="Afternoon";
		}else if(hour>=16 && hour<=20) {
		timeOfDay="Evening";
		}else if(hour>=21 && hour<=24) {
			timeOfDay="Night";
		}else {
			timeOfDay="Unknown";
		}
		// if time of the day is not unknown ---> only then I want see the message
	  if(! timeOfDay.equals("Unknown")) {
		  System.out.println("Right now is "+timeOfDay);
	  }
	
	
	}
	
		

}
