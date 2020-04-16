
/* Richa Patel

 *  CIS 2212 Tuesdays Fall 2018
 *  Lab 07 - String class
 *  Due October 23, 2018 
 */

package chap10StringClass;

import javax.swing.JOptionPane;

public class PasswordValidation {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Enter a password");

		validatePassword(input); // call method

	} // end main method

	// create method of validatePassword
	public static void validatePassword(String str2) {

		int countDigits = 0;
		int countCharacters = 0;
		int countSpecials = 0;

		// use loop to increment through each string
		for (int i = 0; i < str2.length(); i++) {

			char letter = str2.charAt(i);

			if (Character.isDigit(letter)) {
				countDigits++;
			}

			if (!Character.isDigit(letter) && !Character.isLetter(letter)) {
				countSpecials++;
			}
			countCharacters++;

		} // end for loop

		// display results using if
		if (countCharacters <= 7)
			JOptionPane.showMessageDialog(null,
					"Your password " + str2 + " is not valid.\n It must be at least 8 characters");
		else if (countDigits < 2) // less than 2 digits
			JOptionPane.showMessageDialog(null,
					"Your password " + str2 + " is not valid.\n It must have at least 2 digits");
		else if (countSpecials > 0)
			JOptionPane.showMessageDialog(null,
					"Your password " + str2 + " is not valid.\n It must be ONLY characters & digits");
		else
			JOptionPane.showMessageDialog(null, "Password is valid");

	} // end validatePassword
} // end class
