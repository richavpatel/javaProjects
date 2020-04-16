
/* Richa Patel


*  CIS 2212 
*  Tuesdays 2018
*  Lab 01 - Course Score
*  August 28, 2018 
*/

package selections;

import java.util.Scanner;

public class CourseScore {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Course One
		System.out.print("Max Score 1: ");
		double courseOneTotalPoints = in.nextDouble();
		System.out.print("Earned Score 1: ");
		double courseOneTotalEarned = in.nextDouble();

		// Course Two
		System.out.print("Max Score 2: ");
		double courseTwoTotalPoints = in.nextDouble();
		System.out.print("Earned Score 2: ");
		double courseTwoTotalEarned = in.nextDouble();

		// Course Three
		System.out.print("Max Score 3: ");
		double courseThreeTotalPoints = in.nextDouble();
		System.out.print("Earned Score 3: ");
		double courseThreeTotalEarned = in.nextDouble();

		// Course Four
		System.out.print("Max Score 4: ");
		double courseFourTotalPoints = in.nextDouble();
		System.out.print("Earned Score 4: ");
		double courseFourTotalEarned = in.nextDouble();

		double sumOfMaxScore = courseOneTotalPoints + courseTwoTotalPoints + courseThreeTotalPoints
				+ courseFourTotalPoints;
		double sumOfEarned = courseOneTotalEarned + courseTwoTotalEarned + courseThreeTotalEarned
				+ courseFourTotalEarned;

		System.out.println("Points Earned: " + sumOfEarned);
		System.out.println("Total Possible: " + sumOfMaxScore);

		double courseScore = (sumOfEarned / sumOfMaxScore) * 100;
		System.out.println("Course Score: " + courseScore + "%");
		
		if (courseScore >= 90) {
			System.out.println("Letter Grade: A");
		} else if (courseScore >= 80 && courseScore < 90) {
			System.out.println("Letter Grade: B");
		} else if (courseScore >= 70 && courseScore < 80) {
			System.out.println("Letter Grade: C");
		} else if (courseScore >= 60 && courseScore < 70) {
			System.out.println("Letter Grade: D");
		} else {
			System.out.println("Letter Grade: F");
		} // end if

		in.close();
	} // end main

}
