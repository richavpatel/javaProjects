package loops1;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		
		// loops are executed until their loop-continuation-condition
		// becomes false.  here the loop continuation condition is 
		// that the sum is less than 100.
		int sum = 0;
		while (sum < 100) {
			int randomNumber = (int) (Math.random() * 10 + 1);
			sum += randomNumber;
			System.out.println("adding " + randomNumber + ", the sum is " + sum);
		}
		System.out.println("exited the loop because sum is " + sum);
		
		// if you make a mistake with the loop continuation condition, 
		// your loop will not execute as you expect.  for instance, the
		// loop below does not execute at all because we are checking
		// sum > 100 rather than sum < 100.  initially sum is 0, which is 
		// not greater than 100, so the loop is skipped.
		sum = 0;
		while (sum > 100) {
			int randomNumber = (int) (Math.random() * 10 + 1);
			sum += randomNumber;
			System.out.println("adding " + randomNumber + ", the sum is " + sum);
		}
		System.out.println("exited the loop because sum is " + sum);
		
		// the loop below is called an infinite loop -- it never finishes
		// because we forgot to update the loop control variable (sum).
		// uncomment this example to see this run -- click on the red stop
		// button in the lower right of Eclipse to stop the program.
//		sum = 0;
//		while (sum < 100) {
//			int randomNumber = (int) (Math.random() * 10 + 1);
//			System.out.println("adding " + randomNumber + ", the sum is " + sum);
//		}
//		System.out.println("exited the loop because sum is " + sum);
		
		// there are three kinds of loops: while, do-while, and for.
		// the three types of loops are all equivalent, in the sense 
		// that you can always rewrite one in terms of either of the 
		// others.  however, some problems are easier solved with some 
		// types of loops than with others -- we'll discuss when you 
		// would normally use each type over the next three examples.
		
		// as with the above sum example, we generally use while loops 
		// when we don't know beforehand exactly how many times the loop
		// will need to execute.  here is another example.  in this case, 
		// we have a program that will compute the average grade for a 
		// class, but we don't know how many students are in the class
		// beforehand.  a sentinel value is used to indicate that there 
		// is no more input.  be sure to choose a sentinel value that is
		// not a valid data item (in this case, no one can get a -1 as 
		// a grade).
		int numberOfStudents = 0;
		double gradeSum = 0.0;
		double currentGrade = 0;
		final int SENTINEL = -1;
		Scanner input = new Scanner(System.in);
		
		while (currentGrade != SENTINEL) {
			System.out.print("Enter the next grade (-1 to quit): ");
			currentGrade = input.nextDouble();
			if (currentGrade != SENTINEL) {
				gradeSum += currentGrade;
				numberOfStudents++;
			}
		}
			
		System.out.println("The average grade is " + (gradeSum / numberOfStudents));
		
		// if you don't know how many times that a loop should execute, 
		// but you know that it should execute at least once, a do-while
		// loop may be the best choice.  these are often used when presenting 
		// a menu to the user.
		int choice = 0;
		
		do {
			System.out.println("Menu");
			System.out.println("1. Option 1");
			System.out.println("2. Option 2");
			System.out.println("3. Quit");
			System.out.print("What would you like to do? ");
			choice = input.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Doing option 1");
				break;
			case 2: System.out.println("Doing option 2");
				break;
			}
			
		} while (choice != 3); // don't forget the semicolon here
		
		System.out.println("You chose to quit -- goodbye!");
		
		// you can use a for loop when you know how many times the loop
		// needs to execute.  the first part initializes the loop control
		// variable (called 'i' in this example), the second part
		// determines when the loop will terminate, and the third part 
		// updates the loop control variable (this last part is done 
		// *after* each iteration of the loop).
		
		// this example counts from 0 to 9
		for (int i=0; i<10; i++)  {
			System.out.println(i+1);
		}
		
		// there are a couple of important things to notice about the 
		// above example.  the first is that programmers often like to 
		// start numbering things at 0 rather than at 1.  the second is 
		// that the condition i < 10 means that the last number displayed
		// is 9 rather than 10.  but this loop executes 10 times, because 
		// i starts at 0: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 is ten numbers, 
		// not 9 numbers.  you have to be careful to set your condition
		// correctly in order to avoid off-by-one errors (a personal 
		// specialty of mine).
		
		// the i++ at the end of the last for loop increments i by one 
		// each time through the loop.  we can also update the loop control
		// variable in other ways.  this example counts by 5's up to and 
		// including 100.
		for (int x=0; x <= 100; x+= 5) {
			System.out.print(x + ", ");
		}
		System.out.println();
		
		// because computers cannot store floating-point values precisely, 
		// it is best to use ints rather than doubles or floats as your 
		// loop control variables.  check out the results of the following 
		// two loops.
		
		for (double d = .1; d <= 1.0; d += .1) {
			System.out.print(d + ", ");
		}
		System.out.println();
		
		// this is a more accurate approach
		for (int i=1; i<= 10; i++) {
			System.out.print((i/10.0) + ", ");
		}
		System.out.println();
		
		// you can nest loops inside one another.  how many times does 
		// the inner loop execute in this example?
		for (int i=0; i<6; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// you can use a 'break' statement to break out of a loop before
		// the loop-continuation-condition becomes false.  here is a 
		// different way to write the grade-averaging example from 
		// earlier in this program.
		numberOfStudents = 0;
		gradeSum = 0.0;
		int intGrade = 0;
		
		while (true) {
			
			System.out.print("Enter the next grade (-1 to quit): ");
			intGrade = input.nextInt();
			
			if (intGrade == -1) {
				break;
			}
			
			gradeSum += intGrade;
			numberOfStudents++;
		}
		
		System.out.println("The averages of these grades was " + (gradeSum / (double) numberOfStudents));
		
		// the 'continue' statement begins the next iteration of the 
		// loop immediately, skipping over any remaining statements
		// say we want to add only the positive numbers in a list:
		int theSum = 0;
		while (true) {
			int value = input.nextInt();
			if (value < 0) {
				continue;
			}
			theSum += value;
		}
		
		// these examples for break and continue are somewhat simplistic
		// because we do not know much Java so far.  when we learn 
		// about arrays, we will discover more interesting uses for 
		// break and continue statements.
		
	} // end main
} // end class