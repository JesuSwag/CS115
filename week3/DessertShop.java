package week3;

import java.util.*;

public class DessertShop {

	// These return DessertItem objects of the appropriate class
	private static DessertItem userPromptCandy() {
		Scanner input = new Scanner(System.in);
		double candyWeight;
		double candyPrice;
		
		System.out.println("Name of Candy: ");
		String candyName = input.nextLine();
		
		while(true) {
			System.out.println("Quantity (weight): ");
			String s_candyWeight = input.nextLine();
			
			System.out.println("Price (Per Pound): ");
			String s_candyPrice = input.nextLine();
			
			try {
				candyWeight = Double.parseDouble(s_candyWeight);
				candyPrice = Double.parseDouble(s_candyPrice);
				break;
			} catch (Exception e) {
				System.out.println("\nPlease enter a double for Quantity(weight) and price(per pound)");
			}
		}
		
		DessertItem candy = new Candy(candyName, candyWeight, candyPrice);
		return candy;
	}
	
	private static DessertItem userPromptCookie() {
		Scanner input = new Scanner(System.in);
		int cookieCount;
		double cookiePrice;
		
		System.out.println("Cookie Kind: ");
		String cookieName = input.nextLine();
		
		while(true) {
			System.out.println("Quantity: ");
			String s_cookieCount = input.nextLine();
			
			System.out.println("Price (Per Dozen): ");
			String s_cookiePrice = input.nextLine();
			
			try {
				cookieCount = Integer.parseInt(s_cookieCount);
				cookiePrice = Double.parseDouble(s_cookiePrice);
				break;
			} catch (Exception e) {
				System.out.println("\nPlease enter a whole number for Quantity and a double for price");
			}
		}
		
		DessertItem cookie = new Cookie(cookieName, cookieCount, cookiePrice);
		return cookie;
	}
	
	private static DessertItem userPromptIceCream() {
		Scanner input = new Scanner(System.in);
		int scoopCount;
		double scoopPrice;
		
		System.out.println("IceCream Kind: ");
		String iceCreamName = input.nextLine();
		
		while(true) {
			System.out.println("How many scoops?: ");
			String s_scoopCount = input.nextLine();
			
			System.out.println("Price (Per Scoop): ");
			String s_scoopPrice = input.nextLine();
			
			try {
				scoopCount = Integer.parseInt(s_scoopCount);
				scoopPrice = Double.parseDouble(s_scoopPrice);
				break;
			} catch (Exception e) {
				System.out.println("\nPlease enter a whole number for number of scoops and a double for price");
			}
		}
		
		DessertItem IceCream = new IceCream(iceCreamName, scoopCount, scoopPrice);
		return IceCream;	
	}
	
	private static DessertItem userPromptSundae() {
		Scanner input = new Scanner(System.in);
		int scoopCount;
		double scoopPrice;
		double toppingPrice;
		
		System.out.println("IceCream Kind: ");
		String iceCreamName = input.nextLine();
		
		System.out.println("Toppings: ");
		String toppingName = input.nextLine();
		
		while(true) {
			System.out.println("How many scoops?: ");
			String s_toppingPrice = input.nextLine();
			
			System.out.println("How many scoops?: ");
			String s_scoopCount = input.nextLine();
			
			System.out.println("Price (Per Scoop): ");
			String s_scoopPrice = input.nextLine();
			
			try {
				toppingPrice = Double.parseDouble(s_toppingPrice);
				scoopCount = Integer.parseInt(s_scoopCount);
				scoopPrice = Double.parseDouble(s_scoopPrice);
				break;
			} catch (Exception e) {
				System.out.println("\nPlease enter a whole number for number of scoops and a double for prices");
			}
		}
		
		DessertItem sundae = new Sundae(iceCreamName, scoopCount, scoopPrice, toppingName, toppingPrice);
		return sundae;
	}
	

	public static void main(String[] args) {
		Order order = new Order();
		
		Scanner sIn = new Scanner(System.in);
		String choice;
		DessertItem orderItem;

		boolean done = false;
		while (!done) {
		     System.out.println("\n1: Candy");
		     System.out.println("2: Cookie");
		     System.out.println("3: Ice Cream");
		     System.out.println("4: Sunday");

		     System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
		     choice = sIn.nextLine();

		     if (choice.equals("")) {
		          done = true;
		     } else {
		          switch (choice) {
		               case "1":
		                    orderItem = userPromptCandy();
		                    order.add(orderItem);
		                    break;
		               case "2":
		                    orderItem = userPromptCookie();
		                    order.add(orderItem);
		                    break;
		               case "3":
		                    orderItem = userPromptIceCream();
		                    order.add(orderItem);
		                    break;
		               case "4":
		                    orderItem = userPromptSundae();
		                    order.add(orderItem);
		                    break;
		               }//end of switch (choice)
		          }//end of if (choice.equals(""))
		     }//end of while (!done)
		System.out.println("\n");
		
		order.add(new Candy("Candy Corn", 1.5, .25));
		order.add(new Candy("Gummy Bears", .25, .35));
		order.add(new Cookie("Chocolate Chip", 6, 3.99));
		order.add(new IceCream("Pistachio", 2, .79));
		order.add(new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29));
		order.add(new Cookie("Oatmeal Raisin", 2, 3.45));
		
		System.out.println("-------------------------------------Receipt-----------------------------------------");
		System.out.println(order.toString());
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Total number of items in order: " + order.itemCount());
		System.out.printf("Ordrer subtotals %28.2f     [Tax: $%.2f] \n\n", order.orderCost(), order.orderTax());
		System.out.printf("Order Total: %30.2f \n", (order.orderCost() + order.orderTax()));
		System.out.println("-------------------------------------------------------------------------------------");
		/*
		ArrayList<DessertItem> dessertItems = order.getOrderList();
		
		 * include a loop in main() which prints out the name of the dessert,
		 * the cost of each item and the tax for each item as shown in the example run.
		 * print out the subtotal of all the items in the order and the total tax for the order
		 * print out the total cost for the order (subtotal + total tax)
		  
		 
		for (int i = 0; i < dessertItems.size(); i++) {
			//Loop through dessertItem ArrayList and get current element
			DessertItem item = dessertItems.get(i); //Item @ current index
			System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", item.getName(), item.calculateCost(), item.calculateTax());
		}
		
		System.out.println("----------------------------------------------");
		System.out.printf("Order Subtotals: %-8.2f[Tax: $%.2f]\n", order.orderCost(), order.orderTax());
		System.out.println("Order Total: " + Math.round((order.orderCost() + order.orderTax()) * 100.0)/100.0);
		System.out.println("Total items in the order: " + order.itemCount());
		*/
		
	}
}
