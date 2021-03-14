package week3;

public class Sundae extends IceCream {
	private String m_toppingName;
	private double m_toppingPrice;
	
	public Sundae() {
		super();
		m_toppingName = "";
		m_toppingPrice = 0.0;
		setPackaging("");
	}
	
	public Sundae(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice) {
		super(name, scoopCount, pricePerScoop);
		m_toppingName = toppingName;
		m_toppingPrice = toppingPrice;
		setPackaging("Boat");
	}
	
	public String getToppingName() {
		return m_toppingName;
	}
	
	public double getToppingPrice() {
		return m_toppingPrice;
	}
	
	public void setToppingName(String name) {
		m_toppingName = name;
	}
	
	public void setToppingPrice(double num) {
		m_toppingPrice = num;
	}
	
	//-- The cost of a Sundae is the cost of the ice cream used plus the cost of the topping
	public double calculateCost() {
		return (super.getScoopCount() * super.getPricePerScoop()) + m_toppingPrice;
	}
	
	public String toString() {
		//-- We are going to format to a string
		String output;
		
		output = String.format("%s Sundae (%s)\n"
				+ "%5d scoop(s) of %s ice cream @ $%.2f/scoop \n"
				+ "    %5s topping             	$%.2f    [Tax: $%.2f] \n", 
				getToppingName(), getPackaging(),
				getScoopCount(), getName(), getPricePerScoop(),
				getToppingName(), calculateCost(), calculateTax());
		
		return output;
	}
	
}
