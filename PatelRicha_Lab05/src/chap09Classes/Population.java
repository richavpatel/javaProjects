
package chap09Classes;

import java.text.DecimalFormat;

public class Population {

	DecimalFormat calcFormat = new DecimalFormat("###,###.#"); // formtting for total population and comma separated

	DecimalFormat calcFormat2decimals = new DecimalFormat("###,##0.00"); // formatting two decimal places

	// define data fields using PRIVATE access modifier
	private String name;
	private int male;
	private int female;
	private double squremiles;
	private int states;

	// no-args constrcutor
	public Population() {
	}

	// overloded constructor
	public Population(String newName, int newMale, int newFemale, double newSqureMiles, int newStates) {

		this.name = newName;
		this.male = newMale;
		this.female = newFemale;
		this.squremiles = newSqureMiles;
		this.states = newStates;

	}

	// getter and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMale() {
		return male;
	}

	public void setMale(int male) {
		this.male = male;
	}

	public int getFemale() {
		return female;
	}

	public void setFemale(int female) {
		this.female = female;
	}

	public double getSquremiles() {
		return squremiles;
	}

	public void setSquremiles(double squremiles) {
		this.squremiles = squremiles;
	}

	public int getStates() {
		return states;
	}

	public void setStates(int states) {
		this.states = states;
	}

	// instance method that calculates total population
	public int calTotalPopulation() {
		int totalPopulation = male + female;

		return totalPopulation;

	}

	// instance method that calculates population per square mile
	public double calSqureMile() {
		double squreMile = calTotalPopulation() / squremiles;
		return squreMile;
	}

	// instance method that calculates population per state
	public double calPopStates() {
		double totalPopulation = male + female;
		return totalPopulation / states;
	}

	// overridden toString method
	@Override
	public String toString() {

		String str = "\nCountry Name: " + this.name;
		str += "\n\tTotal Population: " + calcFormat.format(this.calTotalPopulation());
		str += "\n\tPopulation per Square Mile: " + calcFormat2decimals.format(this.calSqureMile());
		str += "\n\tPopulation per State: " + calcFormat2decimals.format(this.calPopStates());

		return str;
	}

} // end class
