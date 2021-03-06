package week3;

public class Cookie extends DessertItem implements SameItem<Cookie> {
	private int m_cookieQty;
	private double m_pricePerDozen;
	
	public Cookie() {
		super();
		m_cookieQty = 0;
		m_pricePerDozen = 0.0;
		setPackaging("");
	}
	
	public Cookie(String name, int cookieQty, double pricePerDozen) {
		super(name);
		m_cookieQty = cookieQty;
		m_pricePerDozen = pricePerDozen;
		setPackaging("Box");
	}
	
	public int getCookieQty() {
		return m_cookieQty;
	}
	
	public double getPricePerDozen() {
		return m_pricePerDozen;
	}
	
	public void setCookieQty(int num) {
		m_cookieQty = num;
	}
	
	public void setPricePerDozen(double num) {
		m_pricePerDozen = num;
	}
	
	public double calculateCost() {
		return (m_pricePerDozen / 12 * m_cookieQty);
	}
	
	public String toString() {
		//-- We are going to create a string
		String output;
		
		output = String.format("%s Cookie(s) (%s)\n%5d cookie(s) @ $%.2f/dozen:		$%.2f    [Tax: $%.2f]\n",
				getName(), getPackaging(), getCookieQty(), getPricePerDozen(), calculateCost(), calculateTax());
		
		return output;
	}

	public boolean isSameAs(Cookie object) {
		return object.getName().equals(getName()) && object.getPricePerDozen() == getPricePerDozen();
	}
	 
}
