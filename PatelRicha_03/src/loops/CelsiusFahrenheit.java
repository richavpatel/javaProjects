/* Richa Patel 
*  CIS 2212 Tuesdays Fall 2018
*  Lab 03 - Convert Celsius / Fahrenheit
*  Due September 11, 2018 
*/

package loops;

public class CelsiusFahrenheit {

	public static void main(String[] args) {

		//display celsius and Fahrenheit
		System.out.println("Celsius\tFahrenheit | Fahrenheit\tCelsius");
		System.out.println("----------------------------------------");

		int counter = 1;
		
		// i = celsius which is increment by 2.5 and x = fahrenheit which is increment by 5  
		for (double i = 0, x = 32; counter <= 20; i = i + 2.5, x = x + 5) {
			//System.out.print(i);
			System.out.println(i+ "\t " + String.format("%.2f", celsiusToFahrenheit(i)) + "\t   |\t" + x + "\t  "
					+ String.format("%.2f", fahrenheitToCelsius(x)));
			counter++;
		}

	} // end main

	// create method for celsiusToFahrenheit
	public static double celsiusToFahrenheit(double celsius) {
		return celsius * 9 / 5 + 32;
	}

   // create method for fahrenheitToCelsius
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

} //end class
