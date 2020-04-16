package loops1;

import javax.swing.JOptionPane;
	
public class Demo2DoWhileLoop {
	

	public static void main(String[] args) {
		
/*		// structure of do-while loop
		do {
			statements to be executed while condition is true
			
		} while( condition );
*/		
		// call the method
		getUserInput();

	} // end main
		
		
	// create method to get user input in dialog boxes
	public static void getUserInput() {
		
		double score1, score2, average;
		String input;
		int userChoice;
		
		// do-while loop is POST-TEST because it tests the condition AFTER executing statements (even if condition is false)
		do {
			// get user input in dialog boxes
			input = JOptionPane.showInputDialog(null, "Enter Score #1", "Get User Input for Score #1" ,JOptionPane.QUESTION_MESSAGE);
			score1 = Double.parseDouble(input);
			
			input = JOptionPane.showInputDialog(null, "Enter Score #2", "Get User Input for Score #2" ,JOptionPane.QUESTION_MESSAGE);
			score2 = Double.parseDouble(input);
			
			// call the calcAvg method to get the average for the scores
			average =  Math.round(calcAvg(score1, score2));
			
			// display results in dialog box
			JOptionPane.showMessageDialog(null, "Average of \n " + score1 + " and " + score2 + " equals " + average, "Results", JOptionPane.INFORMATION_MESSAGE);
				// ask user if he wants to continue (change the condition of do-while loop??)
			userChoice = JOptionPane.showConfirmDialog(null, "Would you like to average more scores?", "Continue?", JOptionPane.YES_NO_OPTION);
		}
		while(userChoice == JOptionPane.YES_OPTION);    // be sure to add semicolon after condition!!!
		
		System.out.println("still in getUserInput method, but out of do-while loop");
		
	} // end getUserInput
	
	
	// create method to average the scores
	public static double calcAvg(double sc1, double sc2) {
		
		return (sc1 + sc2)  /  2;
	} // end calcAvg method
	
} // end class
