package p1Circle;

public class DemoCircle {

	public static void main(String[] args) { 
		
		// create an instance of the Circle class
		Circle circ1 = new Circle();   // uses the no-arg constructor
		
		// display the object
		System.out.println("circ1: " + circ1.toString());
		
		
		// create another instance of Circle class
		Circle circ2 = new Circle(4.56);  // uses overloaded constructor
		
		// display the object
		System.out.println("\ncirc2: " + circ2);   // the .toString is implicit
		
		
		// get the value of the radius of circ1
		System.out.println( "\ncirc1 radius: " + circ1.getRadius()  );
		
		// use the setter to change the value of circ1
		circ1.setRadius(6.54321);
		System.out.println("\nchanged circ1: " + circ1);
		
		// accessing the data field directly from the main method   BAD... BAD... BAD.. 
/*		circ1.radius = 1010.10;
		System.out.println("\ncirc1: " + circ1.toString());
*/

	} // end main

} // end class