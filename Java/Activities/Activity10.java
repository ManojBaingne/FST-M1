package activity;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Jhon");
		hs.add("Tom");
		hs.add("Dev");
		hs.add("Shelly");
		hs.add("Devid");
		hs.add("Kelly");
		
		System.out.println("Original hashSet "+hs);
		System.out.println("Original HashSet size is "+hs.size());
		hs.remove("Shelly");
		if(hs.remove("Manoj")) {
			System.out.println("Manoj is removed from hashSet");
		}
		else {
			System.out.println("Manoj is not present in hashSet");
		}
		
		//Checking if Tom present in set or not
		System.out.println("Check if Tom is present in set "+hs.contains("Tom"));
		
		//updated Set size
		System.out.println("updated Set size is "+hs.size());
		
	}

}
