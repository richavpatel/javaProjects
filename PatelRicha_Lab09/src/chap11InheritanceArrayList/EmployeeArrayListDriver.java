package chap11InheritanceArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayListDriver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Employee's first name: ");
		String firstName = input.nextLine();
		System.out.print("Employee's last name: ");
		String lastName = input.nextLine();
		System.out.print("Employee's phone (937-555-1212): ");
		String phoneNum = input.nextLine();
		System.out.print("Shift (1=day or 2=night): ");
		int shift = input.nextInt();
		System.out.print("Pay earned per hour: ");
		double payEarned = input.nextDouble();
		System.out.print("Hours worked this period: ");
		double hoursWorked = input.nextDouble();

		// create ArrayList to store employeeList objects
		ArrayList<ShiftWorker> employeeList = new ArrayList<ShiftWorker>();

		

		// create object worker1
		ShiftWorker worker1 = new ShiftWorker();

		// display object using setter methods
		worker1.setFirstName(firstName);
		worker1.setLastName(lastName);
		worker1.setPhoneNumber(phoneNum);
		worker1.setShiftNum(shift);
		worker1.setHoursWorked(hoursWorked);
		worker1.setPayRate(payEarned);

		// create two object
		ShiftWorker worker2 = new ShiftWorker("Don", "Griffith", "937-222-1234", 2, 18.75, 40);
		Employee worker3 = new ShiftWorker("Chuck", "Banner", "937-898-4567", 1, 25, 41.75);// declare type = SuperClass
																							// & Actual Type =
																							// employeeList

		// display elements using An ArrayList method
		employeeList.add(worker1);

		employeeList.add(worker2);

		employeeList.add((ShiftWorker) worker3);
		
		System.out.println("\nEmployee List contains " + employeeList.size() + " elements:"); //list of the ArrayList

		System.out.println(employeeList);

		input.close();

	}// end main

}// end class
