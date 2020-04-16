package loops1;

import java.util.Scanner;

public class Demo4Validate {  

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		// enter 2 or 3 negative numbers to see what happens using if/else statements
		System.out.print("Enter a positive integer: ");
		number = input.nextInt();
	
		// use if statement to validate
		/*if (number <= 0) {
			System.out.println(number + " is <= 0. Please try again: ");
			number = input.nextInt();
		} else {
			System.out.println(number + " is > 0");
		}
*/
		// Comment out the if/else statements above (lines 18 to 24. Then uncomment the code on the lines below 
		// & enter many negative numbers to see what happens.
		
	while(number <= 0) {
			System.out.print(number + " is <= 0. Please try again: ");
		number = input.nextInt();
		}

			
		
		System.out.println("This should be a positive number: " + number);
		
		// while loops will continue to loop until a valid number is entered. So do NOT use if/else statements to validate.
	

	} // end main

} // end class