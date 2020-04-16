package finalTransportation;

import java.text.NumberFormat;

// this is subclass Automobile  of super class LandVehicle

public class Automobile extends LandVehicle {

	// create data fields
	private double currentPrice;

	// no-args Constructor
	public Automobile() {
		super();

	}

	// overloded constructor
	public Automobile(String name, String moveOn, int noOfWheels, int firstProduced, double originalPrice,
			int currentPrice) {
		super(name, moveOn, noOfWheels, firstProduced, originalPrice);
		this.currentPrice = currentPrice;
	}

	// getter and setter
	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(int currentPrice) {
		this.currentPrice = currentPrice;
	}

	// instance method
	public double priceChange() {
		double change = currentPrice - getOriginalPrice();
		return change;
	}

	// display results

	@Override
	public String toString() {

		// create an object for currency formatting
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		String str = super.toString();
		str += "\n\tCurrent Cost: " + currency.format(this.currentPrice);
		str += "\n\tCost Change: " + currency.format(this.priceChange());
		return str;
	}

}
