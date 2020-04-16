package finalTransportation;

public class DriverTransportation {

	public static void main(String[] args) {

		Transportation transportation1 = new Transportation("Kayak", "Water", 0); // create object of transportation

		LandVehicle landVehicle1 = new LandVehicle("Tandem Bicyle", "Land", 2, 1890, 2.50); // create object of
																							// landvehicle
		Automobile auto1 = new Automobile("Mustang", "Land", 4, 1964, 2368, 26740); // create object of automobile

		// display 3 objects 
		System.out.println(transportation1.toString());
		System.out.println(landVehicle1.toString());
		System.out.println(auto1.toString());

		// create other 2 objects and dynamic binding 

		Transportation landVehicle2 = new LandVehicle("Segway", "Land", 2, 2002, 5000);// declar type Transporatation and actual LAndVehicle
		LandVehicle auto2 = new Automobile("Tesla Model 3", "Land", 4, 2016, 46000, 35500);// declare type LandVehicle
																							// actual type Automobile
        //display 2 objects 
		System.out.println(landVehicle2.toString());
		System.out.println(auto2.toString());

	}// end main

} // end class
