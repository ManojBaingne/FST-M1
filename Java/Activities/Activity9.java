package activity;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		
		ArrayList <String> myList = new ArrayList();
		myList.add("Manoj");
		myList.add("Ankur");
		myList.add("Shital");
		myList.add("Shruti");
		myList.add("Amit");
		
		for(String e:myList) {
			System.out.println(e);
		}
		
		System.out.println("================");
		System.out.println("3rd name of the list is "+myList.get(2));
		
		if(myList.contains("Amit")) {
			System.out.println(true);
		}
		else {
			System.out.println("Search another name");
		}
		
		System.out.println("=================");
		System.out.println("Totle number of names in list is "+myList.size());
		
		myList.remove(2);
		System.out.println("Totle number of names in list is "+myList.size());

	}

}
