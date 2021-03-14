package week3;

public abstract class DessertItem implements Comparable<DessertItem> {
	private String m_Name;
	private double taxPercent = 7.25;
	private String m_Packaging;
	
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

	public String getPackaging() {
		return m_Packaging;
	}

	public void setPackaging(String packaging) {
		m_Packaging = packaging;
	}
	
	public double calculateTax() {
		return calculateCost() * (0.01 * getTaxPercent());
	}

	public int compareTo(DessertItem itemCost) {
		return Double.compare(this.calculateCost(), itemCost.calculateCost());
	}
	
	public abstract double calculateCost();
}
