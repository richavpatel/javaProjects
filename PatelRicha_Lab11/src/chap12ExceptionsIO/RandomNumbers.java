
/* Richa Patel


*  CIS 2212 Tuesdays Fall 2018
*  Lab 11 - Exception Handling – Random Numbers
*  Due November 20, 2018 
*/
package chap12ExceptionsIO;

import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) throws FileNotFoundException { // declare an exception

		Scanner input = new Scanner(System.in);

		// create a file
		java.io.File file1 = new java.io.File("file1.txt"); // virtually ALWAYS use relative path (NOT absolute path)
		// create the file & add the exception
		PrintWriter output = new PrintWriter(file1);

		try {

			int[] number = new int[30];

			// Generates 30 Random Numbers in the range
			for (int i = 0; i < number.length; i++) {
				number[i] = (int) (Math.random() * 250);
				System.out.println(number[i]);
				output.println(number[i]);
			}

			output.println();

			System.out.print("Enter an Index: "); // prints to console
			int index = input.nextInt();
			output.println("Enter an index: " + index); // writes to file

			System.out.println("The value of elements is " + number[index]);

			output.println("The value of the element is " + number[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds ");
			output.println("Index out of bounds ");

		} finally {
			System.out.println("(finally clause) Scanner object is closed");
			output.println("(finally clause) Scanner object is closed"); // writes to file
			input.close();
		}
		output.close(); // ALWAYS ALWAYS ALWAYS close the file so that it doesn't become corrupted.
	} // end main

	// create method
	public static int isCheck(int index) {

		if (index >= 30) {
			throw new ArithmeticException("throw an ArithmeticException");

		}
		return index;
	}

}
// end class
