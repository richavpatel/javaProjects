package p3;

import java.util.ArrayList;

public class AnimalArrayListDemo {

	public static void main(String[] args) {
		
		// create ArrayList to store Mammal objects
		ArrayList<Mammal>  listMammals = new ArrayList<Mammal>();
		
		// check if the ArrayList is empty
		System.out.println("Is list empty: " + listMammals.isEmpty());
		if(!listMammals.isEmpty()) {
			System.out.println(listMammals);
		}
		else {
			System.out.println("listMammal ArrayList is empty");
		}
		
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		
		// instantiate 2 new objects
		Mammal whale1 = new Mammal(false, "water", "carnivore", 0, false, "none");  // first object
		Animal cat1 = new Mammal(true, "land", "carnivore", 4, true, "short"); 
		
		// add the objects to the ArrayList
		listMammals.add(whale1);
		listMammals.add((Mammal) cat1);
		
		Mammal cow = new Mammal(true, "land", "herbivore", 4, true, "short"); 
		Object tiger = new Mammal(true, "land", "carnivore", 4, false, "short"); 
		
		// add the objects to the ArrayList
		listMammals.add(cow);
		listMammals.add((Mammal) tiger);
		
		// check if ArrayList is empty. Display if it has elements
		if(!listMammals.isEmpty()) {
			System.out.println(listMammals);
		}
		else {
			System.out.println("listMammal ArrayList is empty");
		}

	} // end main

} // end class