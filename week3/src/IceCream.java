package week3;

public class IceCream extends DessertItem{
	private int m_scoopCount;
	private double m_pricePerScoop;
	
	public IceCream() {
		super();
		m_scoopCount = 0;
		m_pricePerScoop = 0.0;
	}
	
	public IceCream(String name, int scoopCount, double pricePerScoop) {
		super(name);
		m_scoopCount = scoopCount;
		m_pricePerScoop = pricePerScoop;
	}
	
	public int getScoopCount() {
		return m_scoopCount;
	}
	
	public double getPricePerScoop() {
		return m_pricePerScoop;
	}
	
	public void setScoopCount(int num) {
		m_scoopCount = num;
	}
	
	public void setPricePerScoop(double num) {
		m_pricePerScoop = num;
	}
	
	public double calculateCost() {
		double cost = m_scoopCount * m_pricePerScoop;
		return cost;
	}
	
	public String toString() {
		//-- We are going to format to a string
		String output;
		
		output = String.format("%s Ice Cream \n%5d scoop(s) @ $%.2f/scoop:		$%.2f    [Tax: $%.2f]\n",
				getName(), getScoopCount(), getPricePerScoop(), calculateCost(), calculateTax());
		
		return output;
	}
	
}
