package p1;

public class DriverDevice {

	public static void main(String[] args) {
	
		// create 2 objects of the super class (most general)
		// demonstrate polymorphism/dynamic binding in 1 object
		Object dev1 = new Device("Sony", "Tokyo", "Japan"); // object is actual type of Device. object is declared as Object object. demonstrates polymorphism/dynamic binding
		Device dev2	= new Device("Beltran", "Puerto Rico", "USA"); // declared & actual are both Device
		
		// create 2 objects of the subclass/superclass (middle)
		// demonstrate polymorphism/dynamic binding
		Device el1 = new Electronic("Samsung", "Seoul", "South Korea", false, true); // declared type = Device.  actual type = Electronic. supertype = Device & subtype = Electronic. 
		Object el2 = new Electronic("Daijiang", "Shenzen", "China", false, true);  // declared type = Object.  actual type = Electronic.  supertype = Object & subtype = Electronic. 
		
		// create 2 objects of the subclass (most specific)
		// demonstrate polymorphism/dynamic binding
		Electronic dr1 = new Drone("Daijing", "Shenzen", "China", false, true, 4);   // declared type = Electronic. actual type = Drone.
		Device dr2 = new Drone("MJX", "Hong Kong", "China", false, true, 6);  // declared type = Device. actual type = Drone.
		
		if(dev1 instanceof Drone) 
			System.out.println("dev1 is an instance of Drone");	// line 9
		if(dev2 instanceof Electronic)
			System.out.println("dev2 is an instance of Electronic"); // line 10
		if(el1 instanceof Device)					
			System.out.println("el1 is an instance of Device");   // line 14
		if(dr1 instanceof Object) 
			System.out.println("dr1 is an instance of Object");	  // line 19
		
		
		// display results
		System.out.println(dev1);
		System.out.println(dev2);
		System.out.println(el1);
		System.out.println(el2);
		System.out.println(dr1);
		System.out.println(dr2);
		
	} // end main

} // end class