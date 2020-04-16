package p1Circle;

public class Circle {
	
	// define data fields using PRIVATE access modifier aka visibility modifier
	private double radius = 12345.6; 
	
	// no-arg constructor
	public Circle() {
//		this.radius = 1.1;
	}
	
	// overloaded constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// getters & setters   aka    accessors & mutators
	public double getRadius() {			// getter sends the value of the data field back to where it's called
		return this.radius;
	}
	
	public void setRadius(double radius) {   // setter mutates/changes the value of the data field
		this.radius = radius;
	}
	
	
	// instance method to calculate area of the object
	public double calcArea() {
//		double area = this.radius * this.radius * Math.PI;
		return this.radius * this.radius * Math.PI;
	}
	
	// instance method to calculate the perimeter
	public double calcPerimeter() {
		double perim = 2 * this.radius * Math.PI;
		return perim;
	}
	
	// display results using overrridden toString = Object.toString displays the memory address of the object.
	@Override
	public String toString() {
		String area = String.format("before the pattern %,2.3f after the pattern", this.calcArea());
		String perim = String.format("%,2.2f", this.calcPerimeter());
		
		String str = "\n  radius is " + this.radius;
			  str += "\n  area is " + area;
			  str += "\n  perimeter is " + perim;
			  
		return str;	  
	}
	
} // end class