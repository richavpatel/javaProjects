package finalTransportation;

import java.text.NumberFormat;

//this is sub class LandVehicle of super class Transportation

public class LandVehicle extends Transportation {

	// create data fields
	private int firstProduced;
	private double originalPrice;
	private final static int CURRENT_YEAR = 2018; // constant variable for current year

	// no-args Constructor
	public LandVehicle() {
		super();
	}

	// overloded constructor
	public LandVehicle(String name, String moveOn, int noOfWheels,// from super class
			int firstProduced, double originalPrice     //from this class
			) {
		super(name, moveOn, noOfWheels);
		this.firstProduced = firstProduced;
		this.originalPrice = originalPrice;

	}

	// getter and setter
	public int getFirstProduced() {
		return firstProduced;
	}

	public void setFirstProduced(int firstProduced) {
		this.firstProduced = firstProduced;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	// no setter for CURRENT YEAR because it's a constant and define method
	public static int getCurrentYear() {
		return CURRENT_YEAR;
	}

	// instance methods
	public int yearsProduction() {
		int years = CURRENT_YEAR - firstProduced;
		return years;

	}

	// display results
	@Override
	public String toString() {

		// create an object for currency formatting

		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String str = super.toString();
		str += "\n\tFirst Produced: " + this.firstProduced;
		str += "\n\tYears of Production: " + this.yearsProduction();
		str += "\n\tOriginal Price: " + currency.format(this.originalPrice);
		return str;
	}

}
