package chap11InheritanceArrayList;

import java.text.NumberFormat;

// this is SUBclass of Employee

public class ShiftWorker extends Employee {

	// create an object for currency formatting
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	// data fields
	private int shiftNum;
	private double payRate;
	private double hoursWorked;

	// no args
	public ShiftWorker() {
		super();

	}

	// overloaded constructor
	public ShiftWorker(String firstName, String lastName, String phoneNumber, // from super class
			int shiftNum, double payRate, double hoursWorked // from this class
	) {
		super(firstName, lastName, phoneNumber);
		this.shiftNum = shiftNum;
		this.payRate = payRate;
		this.hoursWorked = hoursWorked;
	}

	// getter and setter
	public int getShiftNum() {
		return shiftNum;
	}

	public void setShiftNum(int shiftNum) {
		this.shiftNum = shiftNum;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	// create instance method

	public double totalPay() {
		double totalPay = 0;
		if (shiftNum == 2) { // check if shift 2 than multiply 1.5
			totalPay = (payRate * 1.5 * hoursWorked);
		} else {
			totalPay = (payRate * hoursWorked);
		}
		return totalPay;

	}

	// overridden method
	@Override
	public String toString() {
		String str = super.toString();
		str += "\n\tShift: " + this.shiftNum;
		str += "\n\tPay Rate: " + currency.format(this.payRate);
		str += "\n\tHours Worked: " +  String.format("%.2f",this.hoursWorked);
		str += "\n\tTotal Pay for Period: " + currency.format(this.totalPay());

		return str;

	}

}// end main
