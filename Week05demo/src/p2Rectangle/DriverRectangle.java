package p2Rectangle;

public class DriverRectangle {

	public static void main(String[] args) {
		
		// instantiate objects of the Rectangle class
		Rectangle rec1 = new Rectangle();	// no-arg constructor
		Rectangle rec2 = new Rectangle(299999.2289, 488.447); 
		
		// display results using overridden toString
		System.out.println("rec1: " + rec1);    // explicit toString
		System.out.println("\nrec2: " + rec2);             // implicit toString

	} // end main

} // end class