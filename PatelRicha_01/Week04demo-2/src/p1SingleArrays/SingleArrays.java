package p1SingleArrays;

public class SingleArrays {

	public static void main(String[] args) {
		
		double sales1 = 11;
		double sales2 = 22;
		double sales3 = 33; 
		
		// declare a variable to reference the array
		double[] arrSales;
		
		// declare a variable to reference the array & create array
		double[] arrValues = {};
		
		// declare a variable to reference the array & create array of 6 String elements
		String[] strArray = new String[6];
		
		// common to use the number of elements as a constant
		final int NUM_ELEMENTS = 4;
		double[] salesArray = new double[NUM_ELEMENTS];
		
		// initialize specific values in an array
		salesArray[0] = 111;
		salesArray[1] =	222;
		
		// declare, create, & initialize in one line - PREFERRED
		double[] scores = {89.5, 92.0, 96.25, 78.2, 98.5};
		
		System.out.println("scores[3]: " + scores[3]);
//		System.out.println("scores[5]: " + scores[5]);  // crashes the program because there is NO index 5
		
		// print using a loop. first get length of array
		System.out.println("\nscores.length: " + scores.length);
		
		// call the array to display the values
		displayArray(scores);
		System.out.println();
		
		// declare, create, & initialize a String array, then pass array to method to display
		String[] students = {"Jason", "Jeremy", "Deanna", "Michele", "Brian"};
		displayArray(students);  // method call
		
		// call the method to average the scores
		System.out.println("\nAverage: " + avgScore(scores));
		

	} // end main
	
	// method to display elements in an array
	public static void displayArray(double[] methodArray) {
		
		for(int index = 0; index < methodArray.length; index++) {
			System.out.println("methodArray[" + index + "]: " + methodArray[index]);
		}
	} // end method
	
	// overloaded method to display String elements
	public static void displayArray(String[] stringArray) {
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println("stringArray[" + i + "]: " + stringArray[i]);
		}
	}
	
	// method to average numbers in an array
	public static double avgScore(double[] scoreArray) {
		double sum = 0, avg;
		
		for(int i = 0; i < scoreArray.length; i++) {
			sum += scoreArray[i];
		}
		
		// calculate the average
		avg = sum / scoreArray.length;
		
		return avg;
	}
	
} // end class