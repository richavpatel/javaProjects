
/* Richa Patel


 

 *  CIS 2212 Tuesdays Fall 2018
 *  Lab 05 - Country Population
 *  Due September 25, 2018   
 */
package chap09Classes;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class DemoPopulation {

	public static void main(String[] args) {

		//DecimalFormat calcFormat = new DecimalFormat("###,###.#"); // formmating total population  whole number and comma separated
		 
		//DecimalFormat calcFormat2decimals = new DecimalFormat("###,##0.00"); // formatting two decimal places

		// create Scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("USA Number of males: ");
		int male = input.nextInt();

		System.out.print("USA Number of females: ");
		int female = input.nextInt();

		System.out.print("USA Number of square miles: ");
		double squreMile = input.nextDouble();

		System.out.print("USA Number of states: ");
		int states = input.nextInt();

		System.out.println();
		
		// create object of usa and set the values
		Population usa = new Population();
		usa.setName("USA");
		usa.setMale(male);
		usa.setFemale(female);
		usa.setSquremiles(squreMile);
		usa.setStates(states);

		//create object of germany  and argentina using the overloaded constructor 
		Population germany = new Population("Germany", 40340771, 41961693, 137846.52, 16);
		Population argentina = new Population("Argentina", 19768407, 20643969, 1068301.76, 23);

		// display results using overridden toString
		System.out.println(usa.toString());
		System.out.println(germany.toString());
		System.out.println(argentina.toString());
		input.close();

	} //end main method

} //end  class
