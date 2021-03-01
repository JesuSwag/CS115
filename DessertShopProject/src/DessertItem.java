package week3;

public abstract class DessertItem {
	private String m_Name;
	private double taxPercent = 7.25;
	
	public DessertItem() {
		m_Name = "";
	}
	
	public DessertItem(String name) {
		m_Name = name;
	}
	
	public String getName() {
		return m_Name;
	}
	
	public String setName(String name) {
		m_Name = name;
		return m_Name;
	}
	
	public double getTaxPercent() {
		return taxPercent;
	}
	
	public void setTaxPercent(double num) {
		taxPercent = num;
	}
	
	public double calculateTax() {
		double tax = calculateCost() * (0.01 * getTaxPercent());
		return tax;
	}
	
	public abstract double calculateCost();
}
