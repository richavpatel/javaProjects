package p3;

// this is the SUBCLASS of the Animal class
// this is also the SUPERCLASS of the Giraffe class

public class Mammal extends Animal {
	
	// data field
	private int numLegs;
	private boolean isDomestic;
	private String hairLongShort;
	
	// no-arg
	public Mammal() {
		super();   // no-arg constructor of the subclass access the no-arg constructor of the super class
	}
	
	// overloaded
	public Mammal(boolean fur, String law, String cho,			// from superclass Animal
				  int legs, boolean dom, String hair) {			// from THIS class Mammal
		super(fur, law, cho); 
		this.numLegs = legs;
		this.isDomestic = dom;
		this.hairLongShort = hair;
	}

	// getters & setters
	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

	public boolean isDomestic() {
		return isDomestic;
	}

	public void setDomestic(boolean isDomestic) {
		this.isDomestic = isDomestic;
	}

	public String getHairLongShort() {
		return hairLongShort;
	}

	public void setHairLongShort(String hairLongShort) {
		this.hairLongShort = hairLongShort;
	}

	// display results
	@Override
	public String toString() {
		String str = super.toString();
			  str += "\n  Legs: " + this.numLegs;
			  str += "\n  Domestic: " + this.isDomestic;
			  str += "\n  Hair: " + this.hairLongShort;
		return str; 	  
	}

} // end class