 package loops1;

public class Demo1WhileLoop  {
	
	// global variables go here -- not a good idea to use global variables 

	public static void main(String[] args) {
	
		// display numbers from 0 to 5
		System.out.println("0");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		// that's fine, but what if you need to display 1400 numbers?
		
/*		// structure of while loop
		while( condition ) {
			statements to be executed while the condition is true
		}
*/
		// while loop is PRE-TEST because it tests the condition BEFORE executing statements

		// call the methods that demonstrate loops
		increment();
		decrement();
		randomNumbers();
		
	} // end main
	
	
	// create method to increment using a while loop
	public static void increment() {
		
		System.out.println("\nIncrement numbers 0 - 10: ");
		int num1 = 0;
		
		while(num1 <= 10) {
			System.out.print(num1 + "  ");
			num1++; 
		} // end while
		
		System.out.println("\n\nIncrement by 5: ");
		int num2 = 0;
		while(num2 <= 10) {
			System.out.print(num2 + "  ");
			num2 +=  5;  //
		} // end while
				
	} // end increment method
	
	
	// create method to decrement
	public static void decrement() {
		System.out.println("\n\nDecrement numbers 10 - 0: ");
		int num1 = 10;
		
		while(num1 >= 0) {
			System.out.print(num1 + "  ");
			num1--;  //
		}
	} // end decrement
	
	
	// create method to generate random numbers
	public static void randomNumbers() {
		
		System.out.println("\n\nDisplay 10 random numbers between 5 & 20 inclusive: ");
		
		int num3 = 0; 
		
		while(num3 < 10) {
			
			// generate random number with lower limit of 5 & upper limit of 20
			int randNum = 5 + (int)(Math.random() * (20 - 5 +1));  // pg 223
			
			if(randNum == 10) {	// if random number is 10, display ten
				System.out.print("ten   ");
			}
			else if (randNum == 13) { /* if random number is 13, leave iteration  */;
				continue;  // leaves this iteration, but not the loop
			}
			else if(randNum ==  7) {/* if random number is 7, break out of loop  */
				break;  // breaks out of the entire loop, no more iterations
			}
			else {
				System.out.print(randNum + "   ");
			}
			
			num3++; // increment the number
		} // end while
		
	} // end randomNumbers method

} // end class
