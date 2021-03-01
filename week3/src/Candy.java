package week3;

public class Candy extends DessertItem {
	private double m_candyWeight;
	private double m_pricePerPound;
	
	public Candy() {
		super();
		m_candyWeight = 0.0;
		m_pricePerPound = 0.0;
	}
	
	public Candy(String name, double candyWeight, double pricePerPound) {
		super(name);
		m_candyWeight = candyWeight;
		m_pricePerPound = pricePerPound;
	}
	
	public double getCandyWeight() {
		return m_candyWeight;
	}
	
	public double getPricePerPound() {
		return m_pricePerPound;
	}
	
	public void setCandyWeight(double num) {
		m_candyWeight = num;
	}
	
	public void setPricePerPound(double num) {
		m_pricePerPound = num;
	}
	
	public double calculateCost() {
		// This is where we define the method to calculate the
		// cost of candy in order();
		double cost = m_candyWeight * m_pricePerPound;
		return cost;
	}
	
	public String toString() {
		String output;
		
		output = String.format("%s \n    %.2f lbs. @ $%.2f/lbs.:		$%.2f    [Tax: $%.2f]\n",
				getName(), getCandyWeight(), getPricePerPound(), calculateCost(), calculateTax());
		
		return output;
	}

}
