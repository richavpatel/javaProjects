package p3Stock;

public class DriverStock {

	public static void main(String[] args) {
		
		// create stock object & initialize
		Stock stock1 = new Stock("ORCL", "Oracle Corporation");
		
		// use setter to set the previous closing price
		stock1.setPreviousClosingPrice(34.5);
		
		// use setter to set the current price
		stock1.setCurrentPrice(34.35);
		
		// display results
		System.out.println(stock1.getSymbol() + "\n" + stock1.getName());
		System.out.println("Previous: " + stock1.getPreviousClosingPrice());
		System.out.println("Current: " + stock1.getCurrentPrice());
		System.out.println("Price change: " + stock1.calcChangePercent() * 100 + "%");
		
	} // end main

} // end class