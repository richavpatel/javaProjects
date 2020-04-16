/* Richa Patel



 *  CIS 2212 Tuesdays Fall 2018
 *  Lab 09 - Inheritance - Employee Shift Work
 *  Due November 6, 2018 
 */
package chap11InheritanceArrayList;

// this is SUPER class
public class Employee {

	// data fields
	private String firstName;
	private String lastName;
	private String phoneNumber;

	// no-args constructor
	public Employee() {

	}
	// overloaded constructor

	public Employee(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;

	}
	// getter and setter

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// display results

	@Override
	public String toString() {
		String str = "\n" + firstName + " " + lastName;
		str += "\n\tPhone: " + phoneNumber;
		return str;
	}

}// end class
