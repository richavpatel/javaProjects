package p1;

// import class for currency formatting with NumberFormat
//import java.text.NumberFormat;

public class File1Methods {

	public static void main(String[] args) {
		
		// create an object for currency formatting
		//NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		// call the method
		helloWorld();
		
		// declare the variable & initialize, then call the method
		int number1 = 20;
		int number2 = 15;
		multiplyMethod(number1);
		
		System.out.println();
		// call the overloaded method
		multiplyMethod(number1, number2);
		
		// call the divide method
		double answerDivide = divideMethod(number1, number2);
		
		// display the result of divideMethod
		System.out.println(divideMethod(number2, number1));
		System.out.println("\nResult of divideMethod: " + answerDivide);  // not formatted
		System.out.printf("Result of divideMethod (formatted): %,10.3f\n", answerDivide);  // format to 3 decimal places
		//System.out.println("formatted for currency using NumberFormat: " + currency.format(  answerDivide  ));
		
		// call the overloaded divideMethod with no parameters
		 System.out.println("\ndivideMethod no formatting: " + divideMethod() );
		 
		 // call the method & assign return to a variable
		 double currFormat = divideMethod();
		// System.out.println("divideMethod formatted for currency: " + currency.format(currFormat));
	
	} // end main
	
	// methods go after the main method & before the class ends
	// this method has no return value & has no parameters/arguments
	public static void helloWorld() {
		// use escape character for quotation marks, for tabs, for new lines
		System.out.println("\tHello World \n\t\"in a method\"");
		
		// call the divideMethod inside the helloWorld method
		System.out.println("\ndivideMethod with no parameters passed: " + divideMethod() );
	}
	
	// this method returns a double & is passed an argument & multiplied by 5.5
	public static void multiplyMethod(int num1) {
		System.out.println("\n" + num1 + " x 5.5 equals " + (num1 * 5.5) );
	}
	
	// this is an overloaded method that takes 2 arguments & multiplies them together
	// in overloaded methods, method signatures must be different (same name)
	public static void multiplyMethod(int num1, int num2) {
		System.out.println(num1 + " times " + num2 + " equals " + (num1 * num2));
	}
	
	// this method returns a double & also has arguments
	public static double divideMethod(double n1, double n2) {
		
		double result = n1 / n2;
		
		return result;   // return the value of result to the caller
	}
	
	// this method has a return, but has arguments - overloaded & must have a different signature (parameters)
	public static double divideMethod() {
		double n1 = 4 /*14494594.55555*/;
		double n2 = 2  /*2.54321*/;
		
		return (n1 / n2);
	}
	
} // end class