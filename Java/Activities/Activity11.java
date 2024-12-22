package activity;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
		hash_map.put(1, "Green");
		hash_map.put(2, "Black");
		hash_map.put(3, "Red");
		hash_map.put(4, "White");
		hash_map.put(5, "Yellow");
		
		System.out.println("Original HashMap "+ hash_map);
		hash_map.remove(3);
		
		//Check if green color exist
		
		if(hash_map.containsValue("Green")) {
			System.out.println("Green color exist");
		}
		else {
			System.out.println("Green color not exist");
		}
		
		//hash_map size
		System.out.println("Size of hash_map is "+hash_map.size());

	}

}
