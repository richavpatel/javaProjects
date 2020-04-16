package p1;

// This is the SUBCLASS of Device class     aka   Child class   aka   Derived class   aka Extended class
// This is the SUPERCLASS of Drone class

public class Electronic extends Device {
	
	private boolean turnedOn;
	private boolean hasRemote;
	
	public Electronic() {
		super(); 
	}
	
	public Electronic(String man, String st, String cy,					// from superclass Device
					  boolean on, boolean remote) {
		super(man, st, cy);
		this.turnedOn = on;
		this.hasRemote = remote;
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}

	public void setTurnedOn(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}

	public boolean isHasRemote() {
		return hasRemote;
	}

	public void setHasRemote(boolean hasRemote) {
		this.hasRemote = hasRemote;
	}
	
	@Override
	public String toString() {
		String str = super.toString();
			  str += "\n  Power On: " + this.turnedOn;
			  str += "\n  Remote: " + this.hasRemote;
		return str;	  
	}

} // end class