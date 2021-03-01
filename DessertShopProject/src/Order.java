package week3;

import java.util.ArrayList;

public class Order {
	private ArrayList<DessertItem> orderItems;
	
	public Order() {
		orderItems = new ArrayList<DessertItem>();
	}
	
	public ArrayList<DessertItem> getOrderList() {
		return orderItems;
	}
	
	public DessertItem add(DessertItem dessert) {
		orderItems.add(dessert);
		return dessert;
	}
	
	public int itemCount() {
		return orderItems.size();
	}
	
	public double orderCost() {
		double orderCost = 0.0;
		
		for (int i = 0; i < orderItems.size(); i++) {
			DessertItem item = orderItems.get(i);
			orderCost += item.calculateCost();
		}
		return orderCost;
	}
	
	public double orderTax() {
		double orderTax = 0.0;
		
		for (int i = 0; i < orderItems.size(); i++) {
			DessertItem item = orderItems.get(i);
			orderTax += item.calculateTax();
		}
		return orderTax;
	}
	
	// I imagine this will loop through the list and call .toString for every cooresponding item
	// peice it together and return the whole receipt.
	public String toString() {
		String output = "";
		ArrayList<DessertItem> list = getOrderList();
		
		
		for (int i = 0; i < list.size(); i++) {
			//Loop through dessertItem ArrayList and get current element
			DessertItem item = list.get(i); //Item @ current index
			output = output + item.toString();
		}
		return output;
	}
	
}
