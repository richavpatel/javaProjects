/* Richa Patel
*  CIS 2212 Tuesdays Fall 2018
*  Lab 02 - Weekly Payroll
*  Due September 5, 2018 
*/

package methods;

import java.text.NumberFormat;
import java.util.Scanner;

public class WeeklyPayroll {

	public static void main(String[] args) {


		// create Scanner object for user input
		Scanner input = new Scanner(System.in);

		// create an object for currency formatting
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		// create an object for percentage formatting
		NumberFormat percentageFormat = NumberFormat.getPercentInstance();
	

		// get name 
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();

		// get number of hours 
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		// get pay rate 
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();

		// get fedTaxWHrate 
		System.out.print("Enter federal tax withholding rate: ");
		double fedTaxWHrate = input.nextDouble();
		

		// get stateTaxWHrate
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxWHrate = input.nextDouble();

		System.out.println("\nWeekly Payroll");
		System.out.println("---------------------");

		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " +  String.format("%.2f", hours)); // format to 2 decimal places
		System.out.printf("Pay Rate: " + currency.format(  payRate  ) + "\n");

		// call grossPay method
		double grossPay = calcGross(hours , payRate);
		System.out.println("Gross Pay: " + currency.format( grossPay ));

		
		System.out.println("Deductions:");
		
		// call fedWH method
		double fedTaxWH = calcFedWH(grossPay, fedTaxWHrate);
		String.format("%.3f", fedTaxWHrate);
        System.out.println("\tFederal Withholding at "+ percentageFormat.format(fedTaxWHrate)+": " + currency.format(fedTaxWH));

        // call stateWH method
		double stateTaxWH = calcStateWH(grossPay, stateTaxWHrate);
		System.out.println("\tState Withholding at "+ percentageFormat.format(stateTaxWHrate)+": " + currency.format(stateTaxWH));

		// call totalDeduct method
		double totalDeduction = calcTotalDeduct(fedTaxWH,stateTaxWH);
		System.out.println("\tTotal Deductions: " + currency.format(totalDeduction));

		// call net method 
		double netPay = calcNet(grossPay, totalDeduction);
		System.out.println("Net Pay: " + currency.format(netPay));
		
		input.close();

	} // end main
	
	// methods go after the main method & before the class ends
	// this method returns grossPay
	public static double calcGross(double hrs, double pyRate) {
		return hrs * pyRate;
	}
	
	// this method returns FedWH 
	public static double calcFedWH (double gross, double fedWHrate) {
		return gross * fedWHrate;
	}
	
	// this method returns StateWH
	public static double calcStateWH(double gross, double stateWHrate) {
		return gross * stateWHrate;
	}
	
	// this method returns TotalDeduct
	public static double calcTotalDeduct(double fedWH, double stateWH) {
		return fedWH + stateWH;
	}
	
	// this method returns net 
	public static double calcNet(double gross, double totalDed) {
		return gross - totalDed;
	} 
	
} // end class
