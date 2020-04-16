package p3;

//this is the SUPER CLASS

public class Animal {
	
	// data fields
	private boolean hasFur;
	private String livesLandAirWater;
	private String eatsCarnHerbOmni;
	
	// no-arg
	public Animal() {
		
	}

	// overloaded
	public Animal(boolean fur, String law, String cho) {
		this.hasFur = fur;
		this.livesLandAirWater = law;
		this.eatsCarnHerbOmni = cho;
	}

	// getters & setters
	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	public String getLivesLandAirWater() {
		return livesLandAirWater;
	}

	public void setLivesLandAirWater(String livesLandAirWater) {
		this.livesLandAirWater = livesLandAirWater;
	}

	public String getEatsCarnHerbOmni() {
		return eatsCarnHerbOmni;
	}

	public void setEatsCarnHerbOmni(String eatsCarnHerbOmni) {
		this.eatsCarnHerbOmni = eatsCarnHerbOmni;
	}
	
	// method - action for all animals
	public boolean isEndangered(int population) {
		System.out.print("  Endangered: ");
		if(population < 10000) {
			return true;
		}
		else 
			return false;
	} // end method
	
	// display results
	@Override
	public String toString() {
		String str = "\n\n  Fur: " + this.hasFur;
			  str += "\n  Lives: " + this.livesLandAirWater;
			  str += "\n  Eats: " + this.eatsCarnHerbOmni;
		return str;			  
	}
		
} // end class