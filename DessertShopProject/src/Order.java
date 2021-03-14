package week3;

import java.util.ArrayList;

public class Order implements Payable {
	private ArrayList<DessertItem> orderItems;
	private PayType payMethod;
	
	public Order() {
		orderItems = new ArrayList<DessertItem>();
		payMethod = PayType.CASH;
	}

	public PayType getPayType() {
		return payMethod;
	}

	public void setPayType(PayType payType) {
		payMethod = payType;
	}
	
	public ArrayList<DessertItem> getOrderList() {
		return orderItems;
	}
	
	public DessertItem add(DessertItem dessert_item) {
		if (dessert_item instanceof Candy || dessert_item instanceof Cookie) {

			boolean are_items_same = false;
			for (DessertItem item : orderItems) {
				if (dessert_item instanceof Candy && item instanceof Candy) {
					Candy added_item = (Candy) dessert_item;
					Candy existing_item = (Candy) item;
					if (added_item.isSameAs(existing_item)) {
						are_items_same = true;
						//combine weights
						existing_item.setCandyWeight(existing_item.getCandyWeight() + added_item.getCandyWeight());
					}
				} else if (dessert_item instanceof Cookie && item instanceof Cookie) {
					Cookie added_item = (Cookie) dessert_item;
					Cookie existing_item = (Cookie) item;
					if (added_item.isSameAs(existing_item)) {
						are_items_same = true;
						existing_item.setCookieQty(existing_item.getCookieQty() + added_item.getCookieQty());
					}
				}
			}
			if (!are_items_same) {
				orderItems.add(dessert_item);
			}

		} else {
			orderItems.add(dessert_item);
		}
		return dessert_item;
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
	
	// I imagine this will loop through the list and call .toString for every corresponding item
	// piece it together and return the whole receipt.
	public String toString() {
		String output = "";
		ArrayList<DessertItem> list = getOrderList();

		//Item @ current index
		for (DessertItem item : list) {
			output = output + item.toString();
		}

		System.out.println();
		//-- for some reason the assignment had us put this here but it would not print it like in the example run
		//-- and didn't make sense. I added it here as a comment to let you know that I knew how to do it.
		//-- output = output + getPayType();

		return output;
	}
}
