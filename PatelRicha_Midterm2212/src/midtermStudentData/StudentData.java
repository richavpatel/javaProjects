
/* Richa Patel 

*  CIS 2212 Tuesdays Fall 2018
*  College Student Data Tracking
*  October 9, 2018 
*/
package midtermStudentData;

public class StudentData {

	// define data fields
	private String firstName;
	private String lastName;
	private int studentId;
	private int birthYear;
	private final static int CURRENT_YEAR = 2018; // constant variable for current year

	// no-args constructor
	public StudentData() {

	}

    //overloaded constructor
	public StudentData(String firstName, String lastName, int studentId, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.birthYear = birthYear;

	}
    // getter and setter method
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

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
			this.birthYear = birthYear;
	}

	// no setter for CURRENT YEAR because it's a constant and define method 
	public static int getCurrentYear() {
		return CURRENT_YEAR;
	}
	
	//create a instance method

	public int calcAge() {
		int ageStudent = CURRENT_YEAR - birthYear;
		return ageStudent;
	}
    // create override method 
	@Override
	public String toString() {

		String str = "\n" + this.firstName + " " + this.lastName;
		str += "\n\tStudent ID: " + this.studentId;
		str += "\n\tAge in "+ CURRENT_YEAR+": " + this.calcAge() + " years old";
		return str;

	}

}
