package p2DeptFloorDemo;

import java.util.Scanner;

public class Departments {

	public static void main(String[] args) {
		
		// create object for user input
		Scanner input = new Scanner(System.in);
		
		// create constant to hold the number of elements
		final int NUM_ELEMENTS = 3;
		
		// declare & create arrays to fill with user input
		String[] dept = new String[NUM_ELEMENTS];
		int[] floor = new int[NUM_ELEMENTS];
		
		// user prompt
		System.out.println("Enter " + NUM_ELEMENTS + " departments and the floor: ");
		
		// for loop to populate
		for(int i = 0; i < dept.length; i++) {
			System.out.print("\n  Dept name: ");
			dept[i] = input.nextLine();
			
			System.out.print("  Floor: ");
			floor[i] = input.nextInt();
			input.nextLine();   // eats the line return in the buffer
		}
		
		// display results
		System.out.println();   // adds a line break for easy reader usability
		displayArrays(dept, floor);
		

	} // end main
	
	// method to display arrays
	public static void displayArrays(String[] dep, int[] fl) {
		
		for(int i = 0; i < dep.length; i++) {
			System.out.println(dep[i] + " is on floor " + fl[i]);
		}
	} // end method

} // end class