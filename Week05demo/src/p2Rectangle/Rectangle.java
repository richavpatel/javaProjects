package p2Rectangle;

import java.text.DecimalFormat;

public class Rectangle {
	
	DecimalFormat calcFormat2decimals = new DecimalFormat("###,##0.0#"); // more control with DecimalFormat class
	DecimalFormat calcFormat4decimals = new DecimalFormat("###,##0.0000");
	
	// data fields -- properties/attributes -  use PRIVATE access modifer
	private double width, length;
	
	// no-arg constructor
	public Rectangle() {
		// no default values here
	}
	
	// overloaded constructor
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	// getters & setters   aka   accessors & mutators
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	// instance methods
	public double calcArea() {
		return this.width * this.length;
	}
	
	public double calcPerimeter() {
		double perim = (this.width * 2) + (this.length * 2);
		return perim;
	}
	
	// display the object - Object.toString use override annotation
	@Override
	public String toString() {
		String area = calcFormat2decimals.format(this.calcArea());
		String perim = calcFormat4decimals.format(this.calcPerimeter());
		
		String str = "\n  width: " + this.width;
			  str += "\n  length: " + this.length;
			  str += "\n  area: " + area;
			  str += "\n  perimeter: " + perim;
			  str += "\n  area: " + calcArea();
			  str += "\n  perimeter: " + calcPerimeter(); 
		return str;
	}

} // end class