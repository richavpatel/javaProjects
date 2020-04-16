/* Richa Patel


*  CIS 2212 Tuesdays Fall 2018
*  Lab 12 - JavaFX – Course Score Functionality
*  Due November 29, 2018 
*/
package chap15EventDriven;

import java.text.NumberFormat;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.geometry.HPos;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.stage.Stage;
import javafx.scene.control.Button;

@SuppressWarnings("restriction")

public class CourseScoreLambda extends Application {

	// create text fields for earned
	private TextField earned1 = new TextField();
	private TextField earned2 = new TextField();
	private TextField earned3 = new TextField();
	private TextField earned4 = new TextField();
	private TextField earned5 = new TextField();
	private TextField earned6 = new TextField();

	// create text fields for max
	private TextField max1 = new TextField();
	private TextField max2 = new TextField();
	private TextField max3 = new TextField();
	private TextField max4 = new TextField();
	private TextField max5 = new TextField();
	private TextField max6 = new TextField();
	private Label label7 = new Label("TOTAL: "); // label7 for Total
	private Label label8 = new Label("FINAL SCORE: "); // label8 for FinalSore
	private Label label9 = new Label("FINAL GRADE: "); // label9 for FinalGrade
	private Label perfectScore = new Label("Perfect Score! ");
	private TextField erTotal = new TextField();
	private TextField maxTotal = new TextField();

	NumberFormat percentageFormat = NumberFormat.getPercentInstance(); // object for percentage Formatting

	// create text fields for final score and grade
	private TextField finalScore = new TextField();
	private TextField finalGrade = new TextField();

	// create button and set properties
	private Button button1 = new Button("Calculate");
	private Button startOver = new Button("Start Over");

	@Override
	public void start(Stage primaryStage) throws Exception {

		// create GridPane & set properties
		GridPane gridP = new GridPane();
		gridP.setAlignment(Pos.CENTER);
		gridP.setPadding(new Insets(11, 13, 11, 13));
		gridP.setHgap(10);
		gridP.setVgap(15);
		gridP.setBackground(new Background(new BackgroundFill(Color.rgb(240, 255, 240), null, null)));

		// create Lable for earned & set properties
		Label earned = new Label("Earned Score ");
		earned.setFont(new Font(24));
		gridP.add(earned, 1, 0);
		GridPane.setHalignment(earned, HPos.CENTER);

		// create Label for max
		Label max = new Label("Max Possible ");
		max.setFont(new Font(24));
		gridP.add(max, 2, 0);
		GridPane.setHalignment(max, HPos.CENTER);

		// create labels for Score 1 to Score 6
		Label label1 = new Label("Score #1: ");
		Label label2 = new Label("Score #2: ");
		Label label3 = new Label("Score #3: ");
		Label label4 = new Label("Score #4: ");
		Label label5 = new Label("Score #5: ");
		Label label6 = new Label("Score #6: ");

		// set font for label
		label1.setFont(new Font(16));
		label2.setFont(new Font(16));
		label3.setFont(new Font(16));
		label4.setFont(new Font(16));
		label5.setFont(new Font(16));
		label6.setFont(new Font(16));

		// add label on grid pane
		gridP.add(label1, 0, 1); // columnIndex, rowIndex
		GridPane.setHalignment(label1, HPos.CENTER);
		gridP.add(earned1, 1, 1); // col 1 & row 1
		gridP.add(max1, 2, 1);

		gridP.add(label2, 0, 2); // columnIndex, rowIndex - opposite of arrays
		GridPane.setHalignment(label2, HPos.CENTER);
		gridP.add(earned2, 1, 2); // col 1 & row 2
		gridP.add(max2, 2, 2);

		gridP.add(label3, 0, 3); // columnIndex, rowIndex - opposite of arrays
		GridPane.setHalignment(label3, HPos.CENTER);
		gridP.add(earned3, 1, 3); // col 1 & row 3
		gridP.add(max3, 2, 3);

		gridP.add(label4, 0, 4); // columnIndex, rowIndex - opposite of arrays
		GridPane.setHalignment(label4, HPos.CENTER);
		gridP.add(earned4, 1, 4); // col 1 & row 4
		gridP.add(max4, 2, 4);

		gridP.add(label5, 0, 5); // columnIndex, rowIndex - opposite of arrays
		GridPane.setHalignment(label5, HPos.CENTER);
		gridP.add(earned5, 1, 5); // col 1 & row 5
		gridP.add(max5, 2, 5);

		gridP.add(label6, 0, 6); // columnIndex, rowIndex - opposite of arrays
		GridPane.setHalignment(label6, HPos.CENTER);
		gridP.add(earned6, 1, 6); // col 1 & row 6
		gridP.add(max6, 2, 6);

		gridP.add(label7, 0, 8);
		erTotal.setBackground(new Background(new BackgroundFill(Color.rgb(232, 232, 232), null, null)));
		erTotal.setDisable(true);
		gridP.add(erTotal, 1, 8);

		maxTotal.setBackground(new Background(new BackgroundFill(Color.rgb(232, 232, 232), null, null)));
		maxTotal.setDisable(true);
		gridP.add(maxTotal, 2, 8);

		finalScore.setBackground(new Background(new BackgroundFill(Color.rgb(232, 232, 232), null, null)));
		finalScore.setDisable(true);
		gridP.add(label8, 0, 9);
		gridP.add(finalScore, 1, 9);

		finalGrade.setBackground(new Background(new BackgroundFill(Color.rgb(232, 232, 232), null, null)));
		finalGrade.setDisable(true);
		gridP.add(label9, 0, 10);
		gridP.add(finalGrade, 1, 10);

		perfectScore.setTextFill(Color.FIREBRICK);
		perfectScore.setFont(new Font("Cambria", 24));
		gridP.add(perfectScore, 1, 11);

		button1.setBackground(new Background(new BackgroundFill(Color.rgb(178, 34, 34), null, null)));
		startOver.setBackground(new Background(new BackgroundFill(Color.rgb(47, 79, 79), null, null)));

		button1.setFont(new Font("Papyrus", 15.5));
		startOver.setFont(new Font("Papyrus", 13.5));

		button1.setTextFill(Color.WHITE);
		startOver.setTextFill(Color.YELLOW);

		// add button on grid pane
		gridP.add(button1, 2, 11);
		GridPane.setHalignment(button1, HPos.RIGHT);

		gridP.add(startOver, 2, 12);
		GridPane.setHalignment(startOver, HPos.RIGHT);

		

		// add event-driven programming with lambda
		button1.setOnAction(e -> calculateSum()); // call the method when user clicks the button
		earned1.setOnAction(e -> calculateSum()); // call the method when user hits ENTER key in earned1
		earned2.setOnAction(e -> calculateSum());
		earned3.setOnAction(e -> calculateSum());
		earned4.setOnAction(e -> calculateSum());
		earned5.setOnAction(e -> calculateSum());
		earned6.setOnAction(e -> calculateSum());
		erTotal.setOnAction(e -> calculateSum()); // call the method when user hits ENTER key in earnedTotal

		max1.setOnAction(e -> calculateSum()); // call the method when user hits ENTER key in max1
		max2.setOnAction(e -> calculateSum());
		max3.setOnAction(e -> calculateSum());
		max4.setOnAction(e -> calculateSum());
		max5.setOnAction(e -> calculateSum());
		max6.setOnAction(e -> calculateSum());
		maxTotal.setOnAction(e -> calculateSum()); // call the method when user hits ENTER key in maxTotal

		startOver.setOnAction(e -> clearAll()); //

		erTotal.setVisible(false); // not Visible to user earned Total
		maxTotal.setVisible(false);
		perfectScore.setVisible(false);
		label7.setVisible(false);
		label8.setVisible(false);
		label9.setVisible(false);
		finalScore.setVisible(false);
		finalGrade.setVisible(false);
		
		// create Scene & put pane on the scene
				Scene scene1 = new Scene(gridP);

				// set scene on stage & set properties of stage
				primaryStage.setScene(scene1);
				primaryStage.setTitle("Calculate Course Score");
				primaryStage.setResizable(false);
				primaryStage.show();

	}

	// create method for totalEarned and totalMax
	public void calculateSum() {

		double totalEarned = Double.parseDouble(earned1.getText()) + Double.parseDouble(earned2.getText())
				+ Double.parseDouble(earned3.getText()) + Double.parseDouble(earned4.getText())
				+ Double.parseDouble(earned5.getText()) + Double.parseDouble(earned6.getText());

		double totalMax = Double.parseDouble(max1.getText()) + Double.parseDouble(max2.getText())
				+ Double.parseDouble(max3.getText()) + Double.parseDouble(max4.getText())
				+ Double.parseDouble(max5.getText()) + Double.parseDouble(max6.getText());

		erTotal.setText(String.format("%,.3f", totalEarned)); // formatting 3 decimal points
		maxTotal.setText(String.format("%,.3f", totalMax));

		// calculate course score using formula
		double courseScore = (totalEarned / totalMax);

		courseScore = courseScore * 100;
		finalScore.setText(String.format("%,.3f", courseScore) + "%");

		// using if - else set Grade
		if (courseScore >= 100) {
			finalGrade.setBackground(new Background(new BackgroundFill(Color.rgb(210, 105, 30), null, null)));
			finalGrade.setText("A");
			perfectScore.setVisible(true);
		} else if (courseScore >= 90) {
			finalGrade.setText("A");
			perfectScore.setVisible(false);
			finalGrade.setBackground(new Background(new BackgroundFill(Color.rgb(232, 232, 232), null, null)));
		} else if (courseScore >= 80) {
			finalGrade.setText("B");
			perfectScore.setVisible(false);
			finalGrade.setBackground(new Background(new BackgroundFill(Color.rgb(232, 232, 232), null, null)));
		} else if (courseScore >= 70) {
			finalGrade.setText("C");
			perfectScore.setVisible(false);
			finalGrade.setBackground(new Background(new BackgroundFill(Color.rgb(232, 232, 232), null, null)));
		} else if (courseScore >= 60) {
			finalGrade.setText("D");
			perfectScore.setVisible(false);
			finalGrade.setBackground(new Background(new BackgroundFill(Color.rgb(232, 232, 232), null, null)));
		} else {
			finalGrade.setText("F");
			perfectScore.setVisible(false);
			finalGrade.setBackground(new Background(new BackgroundFill(Color.rgb(232, 232, 232), null, null)));
		}
		// end if

		// set Visible for user
		erTotal.setVisible(true);
		maxTotal.setVisible(true);
		label7.setVisible(true);
		label8.setVisible(true);
		label9.setVisible(true);
		finalScore.setVisible(true);
		finalGrade.setVisible(true);

	}

	// create method for startOver button when click button startOver clear all data

	public void clearAll() {
		max1.clear(); // clear max1
		max2.clear(); // clear max2
		max3.clear();
		max4.clear();
		max5.clear();
		max6.clear();
		earned1.clear();
		earned2.clear();
		earned3.clear();
		earned4.clear();
		earned5.clear();
		earned6.clear();
		erTotal.clear();
		maxTotal.clear();
		finalScore.clear();
		finalGrade.clear();
		erTotal.setVisible(false);
		maxTotal.setVisible(false);
		perfectScore.setVisible(false);
		label7.setVisible(false);
		label8.setVisible(false);
		label9.setVisible(false);
		finalScore.setVisible(false);
		finalGrade.setVisible(false);

	}

	public static void main(String[] args) {
		Application.launch(args);
	} // end main

}
