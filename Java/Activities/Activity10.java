package activities;

import java.util.HashSet;

public class Activity10 {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Java");
		hs.add("Selenium");
		hs.add("Appium");
		hs.add("Cucumber");
		hs.add("RestAPI");
		hs.add("JMeter");
		
	   //Initial HashSet 
		System.out.println("Initial hashset " +hs);
		System.out.println("Size of HashSet: " + hs.size());
		//Remove element
        System.out.println("Removing Appium from HashSet: " + hs.remove("Appium"));
        //Remove element that is not present
        if(hs.remove("Testim")) {
        	System.out.println("Testim removed from the Set");
        } else {
        	System.out.println("Testim is not present in the Set");
        }

        //Search for element
        System.out.println("Checking if RestAPI is present: " + hs.contains("RestAPI"));
        //updated HashSet
        System.out.println("Updated HashSet: " + hs);
		
	}

}
