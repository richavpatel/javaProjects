package population;

public class Population {
	
	private String nameCountry;
	private int male ,   female;
	private double  noSquareMiles;
	private int states;
	
	public Population(){
		
	}
	public Population (String nameCountry, int male , int female , double noSqureMiles , int states) {
		this.nameCountry = nameCountry;
		this.male = male;
		this.female = female;
		this.noSquareMiles = noSqureMiles;
		this.states = states;
		
	}
	public String getNameCountry() {
		return nameCountry;
	}
	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
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
	public double getNoSquareMiles() {
		return noSquareMiles;
	}
	public void setNoSquareMiles(double noSquareMiles) {
		this.noSquareMiles = noSquareMiles;
	}
	public int getStates() {
		return states;
	}
	public void setStates(int states) {
		this.states = states;
	}
	
	public double totalPopulation() {
		double totalPopulation = male + female;
		return  totalPopulation ;
	}
	public double popPerSq() {
		double popPer = totalPopulation() / noSquareMiles ;
		return popPer;
		
	}
	public double popPerSt() {
		double popPerSt = totalPopulation() / states ;
		return popPerSt;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "\nCountry Name " +this.nameCountry;
		str += "\nTotal Population: " +String.format("%.2f", this.totalPopulation());
		str += "\nPopulation per Squre Mile : " + this.popPerSq();
		str += "\nPopulation per state: " + this.popPerSt();
		
		return str;
	}
	
	

}
