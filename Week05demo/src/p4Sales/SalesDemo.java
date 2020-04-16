package p4Sales;

import javax.swing.JOptionPane;  // import library to use dialog boxes
import java.text.NumberFormat;	 // import library to use decimal formatting

public class SalesDemo {

	public static void main(String[] args) {
		
		// create object of NumberFormat class
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		// instantiate 3 objects of Sales class
		Sales midwest = new Sales();
		Sales eastCoast = new Sales();
		Sales westCoast = new Sales(30, 333000); // use overloaded constructor to hard code the westCoast
		
		// declare local variables
		String input; 
		int numDays;
		double amtSales, totalSales;
		
		// get user input for midwest division
		input = JOptionPane.showInputDialog("midwest days: ");   // I suggest entering 30
		numDays = Integer.parseInt(input);
		midwest.setDays(numDays);
		
		input = JOptionPane.showInputDialog("midwest sales: ");   // I suggest entering 111000
		amtSales = Double.parseDouble(input);
		midwest.setAvgSales(amtSales);
		
		// get user input for eastCoast division
		input = JOptionPane.showInputDialog("eastCoast days: ");   // I suggest entering 30
		numDays = Integer.parseInt(input);
		eastCoast.setDays(numDays);
		
		input = JOptionPane.showInputDialog("eastCoast sales: ");   // I suggest entering 222000
		amtSales = Double.parseDouble(input);
		eastCoast.setAvgSales(amtSales);
		
		
		// get total sales of all 3 divisions
		totalSales = midwest.calcDivisionSales() +
					 eastCoast.calcDivisionSales() +
					 westCoast.calcDivisionSales();

		// call the method to calculate each divisions sales, format the value, & assign to new variable

		//String currDivSalesM = currency.format(midwest.calcDivisionSales());
		//String currDivSalesE = currency.format(eastCoast.calcDivisionSales());
		//String currDivSalesW = currency.format(westCoast.calcDivisionSales());
		
		// display results		
		JOptionPane.showMessageDialog(null, "\nTotal sales for midwest: " + currency.format(midwest.calcDivisionSales()) +
											"\nTotal sales for eastCoast: " + currency.format(eastCoast.calcDivisionSales()) + 
											"\nTotal sales for westCoast: " + currency.format(westCoast.calcDivisionSales()) + 
											"\n\nTotal US sales: " + currency.format(totalSales));
		
	} // end main

} // end class
