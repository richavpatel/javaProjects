package p4Sales;

public class Sales {
	
	// datafields
	private int days;
	private double avgSales;
	
	// no-arg constructor
	public Sales() {
		
	}

	// overloaded constructor
	public Sales(int d, double avgS) {
		days = d;
		avgSales = avgS;
	}

	// getters & setters
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getAvgSales() {
		return avgSales;
	}

	public void setAvgSales(double avgSales) {
		this.avgSales = avgSales;
	}
	
	// create method to calculate each division's sales
	public double calcDivisionSales() {
		return days * avgSales;
	}
	
	// create overridden toString to display results
	@Override
	public String toString() {
		String str = "  days: " + days;
		      str += "\n  avgSales: " + avgSales;
		      str += "\n  division sales: " + calcDivisionSales(); 
		      
		return str;      
	}
}
