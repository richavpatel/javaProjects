package loops1;

public class Demo3ForLoop {

	public static void main(String[] args) {
		
/*		// structure of for loop
		for( counter initialized;   condition;  increment/change ) {
			statements to be executed while condition is true
		}
*/	
		// for loop is PRE-TEST because it tests the condition BEFORE executing statements
		
		// call the methods
		increment();
		numsSquared();
		expTable();

	} // end main
	
	
	// create a method to increment
	public static void increment() {
		
		// increment with a for loop
		for(int index = 0; index <= 10; index++) {
			
			System.out.println("  index: " + index);
		} // end for loop
		
	} // end increment
	
	
	// create method to display numbers squared
	public static void numsSquared() {
		
		System.out.println("\nNumber \t  Num Squared"); // headers
		System.out.println("---------------------");  // like an underline
		
		// list numbers & numbers squared 1 - 10 
		for(int num = 1; num <= 10; num++) {
			System.out.println( "  " + num + "\t\t" + (num*num) );
		} // end for loop
		
	} // end numsSquared
	
	
	// nested loops form a table
	public static void expTable() {
		
		System.out.println("\n\n\t\tTable of Exponents");
		
		// display header ROW at top
		for(int i = 1; i <= 5; i++) {
			System.out.print("\t  " + i);
		}
		
		System.out.print("\n-----------------");  // divider
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("\n" + i + " |"); // prints the values in the first column
			
		//	double extraNum = 5.111111; // example for code on line 70
			
			for(int j = 1; j <= 5; j++) {
				System.out.printf("%8.0f", Math.pow(i, j));
				
				// example: FIRST formula formats the FIRST value,  SECOND formula formats the SECOND value, etc.
//				System.out.printf("%10.0f, %2.1f", Math.pow(i, j), extraNum); 
			} // end inner for loop
			
		} // end outer for loop
				
	} // end expTable method
	
} // end class
