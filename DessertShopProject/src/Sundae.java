package week3;

public class Sundae extends IceCream {
	private String m_toppingName;
	private double m_toppingPrice;
	
	public Sundae() {
		super();
		m_toppingName = "";
		m_toppingPrice = 0.0;
	}
	
	public Sundae(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice) {
		super(name, scoopCount, pricePerScoop);
		m_toppingName = toppingName;
		m_toppingPrice = toppingPrice;
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
		double cost = (super.getScoopCount() * super.getPricePerScoop()) + m_toppingPrice;
		return cost;
	}
	
	public String toString() {
		//-- We are going to format to a string
		String output;
		
		output = String.format("%s Sundae \n"
				+ "%5d scoop(s) of %s ice cream @ $%.2f/scoop \n"
				+ "    %5s topping             	$%.2f    [Tax: $%.2f] \n", 
				getToppingName(), 
				getScoopCount(), getName(), getPricePerScoop(),
				getToppingName(), calculateCost(), calculateTax());
		
		return output;
	}
	
}
