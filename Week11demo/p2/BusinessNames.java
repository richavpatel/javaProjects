package p2;

import java.util.ArrayList;
import java.util.Arrays;

public class BusinessNames {

	public static void main(String[] args) {
		
		// create ArrayList to store names of businesses
		ArrayList<String> busName = new ArrayList<String>(); 
		ArrayList<String> busName2 = new ArrayList<String>();
		
		// add 10 names to the ArrayList
		busName.add("Samsung");
		busName.add("Apple");
		busName.add("HP");
		busName.add("Microsoft");
		busName.add("IBM");
		busName.add("Amazon");
		busName.add("Fujitsu");
		busName.add("Google");
		busName.add("Intel");
		busName.add("Hitachi");
		System.out.println("added 10 business names: " + busName);
		
		// some properties of busName ArrayList
		System.out.println("list size: " + busName.size());
		System.out.println("Is IBM on list: " + busName.contains("IBM"));
		System.out.println("Is Yahoo on list: " + busName.contains("Yahoo"));
		System.out.println("Index number of Apple: " + busName.indexOf("Apple"));
		System.out.println("Is list empty: " + busName.isEmpty());
//		busName.clear();    // clears ALL elements from ArrayList.  Be 120% sure you want to do this!!!! 
//		System.out.println("ArrayList: " + busName);
		
		// insert a business at a specific index number
		busName.add(1, "Dell");  // pushes Apple to index 2
		System.out.println("ArrayList: " + busName);
		
		// remove a business at a specific index number
		busName.remove(8);  // removes Google
		System.out.println("ArrayList: " + busName);
		
		
		// convert ARRAY to ArrayList using asList method.
		Integer[] numArray = {12, 16, 5, 3, 84, 9, 115};   // create array
		ArrayList<Integer> numList = new ArrayList<Integer>(   Arrays.asList(numArray)    );  // create ArrayList & convert array as elements
		System.out.println("\nnumList: " + numList);
		
		// sort the ArrayList
		java.util.Collections.sort(numList);
		System.out.println("\nnumList (sorted): " + numList);

	} // end main

} // end class