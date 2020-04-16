/* Richa Patel

*  CIS 2212 
*  Transportation
*  December 4, 2018 
*/

package finalTransportation;

// this is super class 
public class Transportation {

	// create data fields
	private String name;
	private String moveOn;
	private int noOfWheels;

	// no-args Constructor
	public Transportation() {

	}

	// overloded constructor
	public Transportation(String name, String moveOn, int noOfWheels) {
		this.name = name;
		this.moveOn = moveOn;
		this.noOfWheels = noOfWheels;
	}
	
	
	// getter and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoveOn() {
		return moveOn;
	}

	public void setMoveOn(String moveOn) {
		this.moveOn = moveOn;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	// display results
	@Override
	public String toString() {

		String str = "\n" + this.name;
		str += "\n\tMoves on: " + this.moveOn;
		str += "\n\tPassengers/Wheels: " + this.noOfWheels;
		return str;

	}

}
