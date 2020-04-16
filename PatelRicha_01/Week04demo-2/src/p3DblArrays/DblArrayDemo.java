package p3DblArrays;

public class DblArrayDemo {
	
		public static void main(String[] args) {
		
		// declare double array
		int[][] anArray;
		
		// declare & create double array 
		int[][] values = {}; 
		
		// declare & create array of 3 rows & 5 columns
		int[][] nums = new int[3][5];
		
		// to assign a value to a specific element
		nums[2][2] = 115;
		
		final int ROWS = 3;
		final int COLS = 4;
		int[][] digits = new int[ROWS][COLS];
		
		// declare, create & initialize a double array
		int[][] numbers = { {90, 92, 846, 83},    	// row[0]
							{764, 85, 93, 82},		// row[1]
							{72, 85,  0, 8888},		// row[2]
						  };
		
		// determine length of the rows
		System.out.println("row length: " + numbers.length);   // s/b 3
		
		// determine length of the columns
		System.out.println("column length: " + numbers[0].length);  // s/b 4
		
		// call the method to display the 2D array
		display2dArray(numbers);
		
	} // end main
	
	
	// create method to display a double array
	public static void display2dArray(int[][] array) {
		System.out.println("\nDisplay 2D array: ");
		
		for(int rows = 0; rows < array.length; rows++ ) {  // outer loop for rows
			System.out.print("\n Row #" + (rows + 1) + ":"   );
			
			for(int cols = 0; cols < array[0].length; cols++) {  // inner loop for columns
				System.out.printf("%8d", array[rows][cols]);  // format the field to line up columns
			} // end inner loop for columns
			
		} // end outer for loop for rows
	} // end method
	
} // end class