package activities;

import java.util.ArrayList;


public class Activity9 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrL = new ArrayList<String>();
		
		arrL.add("Bhargavi");
		arrL.add("Manoj");
		arrL.add("Ishaan");
		arrL.add("Tanvika");
		
		System.out.println("Print All the Objects:");
		for(String name: arrL) {
			System.out.println(name);
		}
		
		System.out.println("3rd element in the list is: " + arrL.get(2));
        System.out.println("Is Ishaan is in list: " + arrL.contains("Ishaan"));
        System.out.println("Size of ArrayList: " + arrL.size());
        
        arrL.remove("Tanvika");
        
        System.out.println("New Size of ArrayList: " + arrL.size());
		
	}

}
