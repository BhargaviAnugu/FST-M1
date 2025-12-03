package activities;

import java.util.HashMap;

public class Activity11 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "White");
		hm.put(2, "Green");
		hm.put(3, "Red");
		hm.put(4, "Pink");
		hm.put(5, "Black");
		
		System.out.println("Hashmap values are " +hm);
		//removing color Pink
		System.out.println("Removing color " +hm.remove(4));
		
		if(hm.containsValue("Green")){
			System.out.println("Green color exists in the map");
		}else {
			System.out.println("Green color doesn't exists in the map");
		}
		
		//print the size of the HashMap
		System.out.println("Size of the HashMap is " + hm.size());
		System.out.println("Hashmap values are " +hm);
		
	}

}
