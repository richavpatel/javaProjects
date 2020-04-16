package p1;

// This is the SUBCLASS of Electronic class

public class Drone extends Electronic {
	
	private int numBlades;
	
	public Drone() {
		super(); 
	}
	
	public Drone(String man, String st, String cy,					// from superclass Device
			     boolean on, boolean remote,						// from superclass Electronic
			  	 int blades) {
		super(man, st, cy, on, remote); 
		this.numBlades = blades;
	}

	public int getNumBlades() {
		return numBlades;
	}

	public void setNumBlades(int numBlades) {
		this.numBlades = numBlades;
	}
	
	@Override
	public String toString() {
		String str = super.toString();
			  str += "\n  Number of blades: " + this.numBlades;
		return str;
	}
	
} // end class