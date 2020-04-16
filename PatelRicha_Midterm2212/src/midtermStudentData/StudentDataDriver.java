package midtermStudentData;

import java.util.Scanner;

public class StudentDataDriver {

	public static void main(String[] args) {

		// create object of student data
		StudentData student1 = new StudentData();
        
		//create scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String name = input.nextLine();

		System.out.print("Enter last name: ");
		String lastName = input.nextLine();

		System.out.print("\nEnter 5-digit student id: ");
		int id = input.nextInt();

		System.out.print("\nEnter 4-digit birth year: ");
		int year = input.nextInt();

		while (year <= 2005) {
			System.out.print("Student must be born by 2005. Please try again: ");
			year = input.nextInt();
		}
        
		//using setter for student1 to set values 
		student1.setFirstName(name);
		student1.setLastName(lastName);
		student1.setStudentId(id);
		student1.setBirthYear(year);
        
		//create two  object of studentdata using overloaded constructor
		StudentData student2 = new StudentData("Samuel", "Ricci", 23123, 1987);
		StudentData student3 = new StudentData("Adan Luis", "Gutierrez", 24442, 1973);

		// display  3 object of studentdata
		System.out.println(student1.toString());
        System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		input.close();

	}// end main

}// end class
