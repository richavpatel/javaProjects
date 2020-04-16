package p4ExtraMaterial;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {

	public static void main(String[] args) {
		
		// variables that hold a single value are called "primitive variables"
		// variables that can hold multiple values are called "arrays"
		
		// primitiveInt holds a single value
		// intArray holds several values (in this case, six of them)
		int primitiveInt = 5;
		int[] intArray = {1, 6, 3, 8, -2, 0};

		// all of the values in an array must be the same data type.  so, an 
		// array can hold all ints, or all doubles, or all chars, etc, but it
		// cannot hold some ints, doubles, chars, etc all in the same array
		
		// int[] invalidArray = {1, 6.2, 4.7, 2, 7, 'c'};
		
		// as you have seen in the previous examples, you use square brackets
		// after the data type to indicate that a variable is an array.  (the
		// square bracket keys [ and ] are to the right of the letter 'p' on 
		// a standard keyboard).
		
		// unlike primitive variables, declaring an array is not enough.  you 
		// must also reserve enough space in memory to hold all of the values 
		// in the array.  this is done with the "new" function.  when you call
		// new, you must tell the array how many items it will need to store.
		// the size of the array CANNOT be changed later.
		
		// this array can hold five characters:
		char[] word = new char[5];
		
		// unlike in C/C++, you can use a variable or function result to 
		// specify the size of the array:
		
		System.out.print("How many students are in the class? (minimum 10) ");
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();
		
		int[] grades = new int[numberOfStudents];
		
		// arrays in Java know how long they are.  you can access this 
		// information through the .length field of the array. 
		System.out.println("Ok, created an array to hold " + grades.length + " grades");
		
		// also unlike in C/C++, when you declare an array in Java, it is 
		// filled with default values.  int arrays are filled with 0s, 
		// double arrays are filled with 0.0, char arrays are filled with 
		// the Unicode value \u0000, and boolean arrays are filled with
		// false.
		
		// so if we print out the grades array right now, this is what we see:
		System.out.println("Grades: " + Arrays.toString(grades));
		
		// note the the Arrays class is a built-in Java class with a lot of 
		// nice methods for working with arrays.
		
		// to assign a value to a location in the array, you use a number 
		// called an 'index' inside square brackets.  the first value in an 
		// array is at index 0 (programmers like to number things starting at
		// 0)
		
		// here we set the fourth value in the grades array to 90 and the 10th
		// value to 84:
		grades[3] = 90;
		grades[9] = 84;
		System.out.println("Grades: " + Arrays.toString(grades));
		
		// if you try to access an array index before the beginning or after 
		// the end of the array, you will get an exception.  uncomment these
		// lines to see this.
//		System.out.println(grades[-1]);
//		
//		int length = grades.length;
//		System.out.println(grades[length]);
		
		// there is an exception to the need to initialize your array by 
		// calling the "new" method.  If you already know all of the values 
		// that need to be stored in the array, you can just list them out
		// inside curly braces.  in that case, the compiler can determine the
		// size of the array by simply counting the values, so calling new is 
		// not necessary.  
		
		char[] greeting = {'h', 'e', 'l', 'l', 'o'};
		
		// you can use an array element anywhere you would normally use a
		// single value of that data type.  for instance, here the
		// getLetterGrade method (below) takes a single integer value, so we 
		// can send it one of the values from the grades array.
		char letterGrade = getLetterGrade(grades[3]);
		System.out.println("The fourth student has a score of " + grades[3] + 
				" which is a/an " + letterGrade);
		
		letterGrade = getLetterGrade(grades[9]);
		System.out.println("The tenth student has a score of " + grades[9] + 
				" which is a/an " + letterGrade);
		
		// let's say we want to give everyone in the class a 5 point curve, we
		// can do that with a for loop.  for loops are often used when working
		// with arrays because we often need to loop through each value in the 
		// array, and we know how many items the array contains (using the .length
		// field of the array)		
		for (int i=0; i<grades.length; i++) {
			grades[i] += 5;
		}
		
		// beginning in Java 5, you can also use alternative syntax in a for 
		// loop if you just want to start at the beginning of an array and do 
		// something to each value, one after the other.  this alternate 
		// syntax does not work if you want to do anything fancy, like only 
		// do something to every-other item in the array or start at the end
		// of the array and work backwards.
		
		// in this case, the value of each successive item is stored in the 
		// temporary variable "grade".  the grade variable must be the same 
		// data type as the values stored in the grades array.
		for (int grade: grades) {
			System.out.println(grade);
		}
	}

	
	public static char getLetterGrade(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
}
