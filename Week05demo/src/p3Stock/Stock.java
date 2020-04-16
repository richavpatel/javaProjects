package p3Stock;

public class Stock {
	
	// data fields
	private String symbol; 
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	// no-arg constructor
	public Stock() {
		
	}
	
	// overloaded constructor
	public Stock(String newSymbol, String newName) {
		this.symbol = newSymbol;
		this.name = newName;
	}

	// getters & setters
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	// instance method to calculate the change
	public double calcChangePercent() {
		double change = (currentPrice - previousClosingPrice) /  previousClosingPrice;
		return change;
	}
	
} // end class