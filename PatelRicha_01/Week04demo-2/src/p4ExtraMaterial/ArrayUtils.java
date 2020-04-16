package p4ExtraMaterial;

import java.util.Arrays;
import java.util.Scanner;

// this class contains a slew of very useful methods related to arrays that are
// discussed in your textbook.  the main method at the bottom of this file 
// shows how to call these utility methods.

public class ArrayUtils {
	
	// in this method I decided to pass in the array to the method.  the method
	// then prompts the user for enough values to fill the array, reads them in
	// and puts them in the array.  arrays work differently in methods than 
	// primitive variables -- changes we make to an array parameter "stick"
	// after the method terminates.  i will talk about this more in the video
	// for this topic.
	public static void initializeArray(double[] array) {
		System.out.print("\nType in " + array.length + 
				" double values separated by spaces and hit enter please: ");
		Scanner input = new Scanner(System.in);
		for (int i=0; i<array.length; i++) {
			array[i] = input.nextDouble();
		}
	}

	
	// this method shows an example of returning an array from a method.  the
	// caller passes in the length they want the array to be and the limit for
	// the random numbers placed inside the array.  the method creates the 
	// appropriate array and returns it.
	public static int[] createRandomArray(int length, int limit) {
		int[] theArray = new int[length];
		
		for (int i=0; i<theArray.length; i++) {
			theArray[i] = (int) (Math.random() * limit);
		}
		
		return theArray;
	}
	
	// there are several ways to print the contents of an array.  this example
	// displays one value per line.
	public static void multilinePrintArray(char[] theArray) {
		for (char c: theArray) {
			System.out.println(c);
		}
	}
	
	// here is an example of printing an array's contents on a single line, 
	// with the values separated by commas.
	public static void singlelinePrintArray(int[] theArray) {
		for (int i=0; i < theArray.length; i++) {
			System.out.print(theArray[i]);
			if (i < theArray.length-1) { // don't print a comma after the last item
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	// this method sums all of the values in an array.  it uses the for-each
	// version of the for loop syntax.  the variable "sum" in this case is
	// called an "accumulator" variable, because we are using it to accumulate
	// the sum.  it is important to declare the accumulator and initialize it
	// to zero before the for loop.
	public static double sum(double[] theArray) {
		double sum = 0;
		for (double d: theArray) {
			sum += d;
		}
		return sum;
	}
	
	// finds the largest value stored in an array and returns it.
	public static int findLargestValue(int[] theArray) {
		
		// this variable will hold the largest value we've found so far.  in 
		// the beginning, that is just the first value in the array.
		int largest = theArray[0];
		
		// then we start at the second item in the array and check to see if it
		// is bigger than the largest item we have seen so far.  if it is, we 
		// make it the new largest value.  this is repeated until the end of 
		// the array is reached.
		for (int i=1; i<theArray.length; i++) {
			if (theArray[i] > largest) {
				largest = theArray[i];
			}
		}
		
		return largest;
	}
	
	// sometimes rather than finding a particular value in an array, it is more
	// useful to know *where* that value is within the array (i.e. its index).
	// this method finds the index of the smallest element in the array.  for 
	// instance, if the array is {d, t, s, r, l, a, f, q} then the method will
	// return 5 because 'a' is the smallest item, and it is at location 5 
	// (remember that the numbering starts with 0 rather than 1).
	public static int findIndexOfMinimum(char[] charArray) {
		
		// this variable will hold the index of the smallest value we've seen 
		// so far.  in the beginning, this is just 0 (the first value is the 
		// smallest seen so far).
		int indexOfSmallest = 0;
		
		// now we check the rest of the values in the array.  if the value at
		// the current index is smaller than the value at "indexOfSmallest", we
		// need to update indexOfSmallest.
		for (int i=1; i<charArray.length; i++) {
			if (charArray[i] < charArray[indexOfSmallest]) {
				indexOfSmallest = i;
			}
		}
		
		return indexOfSmallest;
	}
	
	// this mixes up the values in an array by exchanging each value with the 
	// one at a random index
	public static void randomShuffle(int[] array) {
		
		for (int i=0; i<array.length; i++) {
			
			// generate the random index to swap this one with
			int randomIndex = (int) (Math.random() * array.length);
			
			// swap the values and indexes i and randomIndex
			int temp = array[randomIndex];
			array[randomIndex] = array[i];
			array[i] = temp;
		}
	}
	
	// shifts all values in the array one place to the left
	public static void shiftLeft(int[] array) {
		
		// save the first value in a variable
		int temp = array[0];
		
		// move all the other values (after the first) left one
		for (int i=1; i<array.length; i++) {
			array[i-1] = array[i];
		}
		
		// the first value gets placed at the end.  the end is length-1 rather
		// than just length because the numbering starts at zero.
		array[array.length-1] = temp;
	}
	
	// the next two methods show how much simpler arrays can make your programs.
	// assume you need a method to convert the numeric representation of the 
	// month to the name of the month.
	public static String getMonth(int month) {
		switch(month) {
		case 1: return "January";
		case 2: return "February";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		default: return "Invalid input " + month;
		}
	}
	
	public static String getMonthBetterVersion(int month) {
		String[] months = {"January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November", 
				"Decemer"};
		
		return months[month-1];
	}
	
	// to copy an array, you can't do something like this:
	// int[] myOtherArray = myArray;
	// this doesn't work because the array variables are actually pointer to 
	// the starting point of the array in memory.  if you do it this way, both
	// myOtherArray and myArray will point to the same actual array in memory,
	// and so changes made to one will affect the other.  instead, you need to
	// copy the array element one at a time into a new array.
	public static int[] copyArray(int[] orig) {
		int[] newArray = new int[orig.length];
		for (int i=0; i<newArray.length; i++) {
			newArray[i] = orig[i];
		}
		return newArray;
	}
	
	// the same is true for testing to see if two arrays are equal.  you can't
	// use array1 == array2.  instead, you have to compare the values within
	// the array one pair at a time:
	public static boolean arrayEquals(int[] array1, int[] array2) {
		for (int i=0; i<array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		
		// if we get here, all of the pairs were equal
		return true;
	}
	
	// in main we have examples of calling some of the methods above
	public static void main(String[] args) {
		
		int[] intArray1 = {1, 5, 6, 2, 9, 10, 2};
		int[] intArray2 = {1, 5, 6, 2, 9, 10, 2};
		
		if (arrayEquals(intArray1, intArray2)) {
			System.out.println("These two arrays are equal");
		} else {
			System.out.println("These two arrays are not equal");
		}
		
		// Java's Arrays class also has a built-in equals method for arrays
		// the method is overloaded to work with all data types (int[], 
		// double[], char[], float[], etc).
		// if (Arrays.equals(intArray1, intArray2)) ...
		
		singlelinePrintArray(intArray1);
		singlelinePrintArray(intArray2);
		
		System.out.println("\nNow we will randomly shuffle the elements in the " +
				"first array and shift all of the items in the second array " +
				"one to the left.");
		randomShuffle(intArray1);
		shiftLeft(intArray2);
		
		singlelinePrintArray(intArray1);
		singlelinePrintArray(intArray2);

		double[] doubleArray = new double[4];
		initializeArray(doubleArray);
		System.out.println(Arrays.toString(doubleArray)); // another way to print an array
		
		System.out.println("\nCreating an array with 5 random values between 0 and 100...");
		int[] randomIntArray = createRandomArray(5, 100);
		System.out.println(Arrays.toString(randomIntArray));
	}
}
