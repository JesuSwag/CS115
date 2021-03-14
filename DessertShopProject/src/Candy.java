package week3;

public class Candy extends DessertItem implements SameItem<Candy> {
	private double m_candyWeight;
	private double m_pricePerPound;
	
	public Candy() {
		super();
		m_candyWeight = 0.0;
		m_pricePerPound = 0.0;
		setPackaging("");
	}
	
	public Candy(String name, double candyWeight, double pricePerPound) {
		super(name);
		m_candyWeight = candyWeight;
		m_pricePerPound = pricePerPound;
		setPackaging("Bag");
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
		return m_candyWeight * m_pricePerPound;
	}
	
	public String toString() {
		String output;
		
		output = String.format("%s (%s)\n    %.2f lbs. @ $%.2f/lbs.:		$%.2f    [Tax: $%.2f]\n",
				getName(), getPackaging(), getCandyWeight(), getPricePerPound(), calculateCost(), calculateTax());
		
		return output;
	}

	public boolean isSameAs(Candy object) {
		return object.getName().equals(getName()) && object.getPricePerPound() == getPricePerPound();
	}

}