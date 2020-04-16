
/* Richa Patel
 
 *  CIS 2212 Tuesdays Fall 2018
 *  Lab 06 - Objects, Classes, UML Diagram
 *  Due October 2, 2018   
 */
package classesObjects;


public class DriverPhone {

	public static void main(String[] args) {

		// create Array of phones
		Phone[] phones = new Phone[8];

		// create  object of phone

		Phone phone1 = new Phone();
		// use setters to populate the phone1 object
		phone1.setName("Nokia");
		phone1.setColor("Red");
		phone1.setSalePrice(100);
		phone1.setSerialNum(3456);
		phone1.setDiscountRate(5.5);
		
        // create object of phone 
		Phone phone2 = new Phone();
		// use setters to populate the phone2 object
		phone2.setName("Samsunge Galaxy");
		phone2.setColor("White");
		phone2.setSalePrice(456);
		phone2.setSerialNum(8456);
		phone2.setDiscountRate(3.5);
		
		// populate the array using index
		phones[0] = phone1;
		phones[1] = phone2;
		
        phones[2] = new Phone("iPhonex", "Pink", 700, 5679, 2.5); //// created 3rd object of the phone class
		phones[3] = new Phone("iPhone8", "Yellow", 680, 2679, 2.4);
		phones[4] = new Phone("Samsunge edge 7", "Black", 400, 1679, 6.5);
		phones[5] = new Phone("iPhone 7", "Silver", 780, 3579, 2.9);
		phones[6] = new Phone("Motorola", "Red", 500, 5829, 4.5);
		phones[7] = new Phone("iPhone 5", "Pink", 600, 6319, 1.5);

		displayArray(phones);  //call method displayArray 

	} //end main method

	// create method displayArray with passing array phones
	public static void displayArray(Phone[] phones) {

		for (int i = 0; i < phones.length; i++) {
			System.out.print("\nPhone #" + (i + 1) + ": ");
			System.out.println(phones[i]);
		}
	} // end displayArray method

} //end class
