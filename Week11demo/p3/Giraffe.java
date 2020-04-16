package p3;

// This is the SUBCLASS of the Mammal class

public class Giraffe extends Mammal {
	
	// data field
	private boolean hasDistinctSpots;
	private String type;  // types = Angolan, Reticulated, Masai, etc.
	
	// no-arg
	public Giraffe() {
		super(); 
	}
	
	// overloaded
	public Giraffe(boolean fur, String law, String cho,			// from superclass Animal
			  int legs, boolean dom, String hair, 				// from superclass Mammal
			  boolean spots, String type) {						// from THIS class Giraffe
		super(fur, law, cho, legs, dom, hair); 
		this.hasDistinctSpots = spots;
		this.type = type; 
	}

	// getters & setters
	public boolean isHasDistinctSpots() {
		return hasDistinctSpots;
	}

	public void setHasDistinctSpots(boolean hasDistinctSpots) {
		this.hasDistinctSpots = hasDistinctSpots;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	// display results
	@Override
	public String toString() {
		String str = super.toString();
			  str += "\n  Distinct Spots: " + this.hasDistinctSpots;
			  str += "\n  Type: " + this.type;
		return str;		
	}

} // end class