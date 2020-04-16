package classesObjects;

import java.text.NumberFormat;

public class Phone {

	// define data fields
	private String name;
	private String color;
	private double salePrice;
	private int serialNum;
	private double discountRate;

	// no-args constructors
	public Phone() {

	}

	// over loaded constructors
	public Phone(String name, String color, double salePrice, int serialNum, double discountRate) {
		this.name = name;
		this.color = color;
		this.salePrice = salePrice;
		this.serialNum = serialNum;
		this.setDiscountRate(discountRate);

	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSalePrice() {
		return salePrice;
	}

	// Validate. If price is entered less than 0, display message and set price to 0;
	public void setSalePrice(double salePrice) {
		if (salePrice > 0) {
			this.salePrice = salePrice;
		} else {
			System.out.println("Error message: Enter a Positive number");
			this.salePrice = 0;
		}

	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	// instance method for calculate total prices
	public double calcDiscount() {
		double discount = (salePrice * discountRate) / 100;
		String.format("0.3f", discount);
		return discount;
	}
     
	// instance method for calculate total
	public double calcTotal() {
		double total = salePrice - calcDiscount();
		return total;
	}

	// display results

	@Override // use at override annotation
	public String toString() {
         String.format("%.3f", calcDiscount());
		// create an object for currency formatting
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		//currency.setMinimumFractionDigits(3); // set three digits

		String str = "\nPhoneName: " + this.name;
		str += "\n   Color: " + this.color;
		str += "\n   SerialNumber: " + this.serialNum;
		str += "\n   SalePrice: " +  currency.format(this.salePrice);
		str += "\n   Discount: " + currency.format(this.calcDiscount());
		str += "\n   FinalPrice: " + currency.format(this.calcTotal());

		return str;
	}

} // end class
