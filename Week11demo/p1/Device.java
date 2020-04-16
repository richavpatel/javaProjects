package p1;

// This is the SUPER class   aka  PARENT class    aka   BASE class

public class Device {
	
	private String manufacturer;
	private String state;
	private String country;
	
	public Device() {
		
	}
	
	public Device(String man, String st, String cy) {
		manufacturer = man;
		state = st;
		country = cy;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		String str = "\nDevice: ";
			  str += "\n  Manufacturer: " + this.manufacturer;
			  str += "\n  Made in " + this.state + ", " + this.country;
		return str; 	  
	}
	
} // end class