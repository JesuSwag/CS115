package week3;

import javax.swing.text.Style;
import java.util.*;

public class DessertShop {
	//-- Insert Hash Map Here --//
	static HashMap<String, Customer> customerDB = new HashMap<>();

	// These return DessertItem objects of the appropriate class
	private static DessertItem userPromptCandy() {
		Scanner input = new Scanner(System.in);
		double candyWeight;
		double candyPrice;
		
		System.out.println("Enter the type of candy: ");
		String candyName = input.nextLine();
		
		while(true) {
			System.out.println("Enter the number of pounds: ");
			String s_candyWeight = input.nextLine();
			
			System.out.println("Enter the price per pound: ");
			String s_candyPrice = input.nextLine();
			
			try {
				candyWeight = Double.parseDouble(s_candyWeight);
				candyPrice = Double.parseDouble(s_candyPrice);
				break;
			} catch (Exception e) {
				System.out.println("\nPlease enter a double for Quantity(weight) and price(per pound)");
			}
		}
		
		return new Candy(candyName, candyWeight, candyPrice);
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
		
		return new Cookie(cookieName, cookieCount, cookiePrice);
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
		
		return new IceCream(iceCreamName, scoopCount, scoopPrice);
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
			System.out.println("Price (for toppings)?: ");
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
		
		return new Sundae(iceCreamName, scoopCount, scoopPrice, toppingName, toppingPrice);
	}

	private static ArrayList<String> customerList() {
		ArrayList<String> customerList = new ArrayList<>();

		for (Map.Entry<String, Customer> customerEntry : customerDB.entrySet()) {
			String Key = customerEntry.getKey();
			Customer Value = customerEntry.getValue();
			int customerID = Value.getID() - 1;
			customerList.add("Customer Name: " + Key + "          " + "Customer ID: " + customerID);
		}

		return customerList;
	}

	private static ArrayList<Order> customerHistory() {
		Scanner sIn = new Scanner(System.in);
		String custName;
		Customer custNameObject;

		while(true) {
			System.out.println("Enter the name of the customer: ");
			custName = sIn.nextLine();

			if (customerDB.containsKey(custName)) {
				custNameObject = customerDB.get(custName);
				break;
			} else {
				System.out.println("That customer does not exist. Please try again.");
			}
		}
		return custNameObject.getOrderHistory();
	}

	private static String bestCustomer() {
		String currentCustomer = "";
		int orderSize = 0;
		for (Map.Entry<String, Customer> customerEntry : customerDB.entrySet()) {
			String Key = customerEntry.getKey();
			Customer Value = customerEntry.getValue();

			if (Value.getOrderHistory().size() > orderSize) {
				orderSize = Value.getOrderHistory().size();
				currentCustomer = Key;
			}
		}
		return currentCustomer;
	}

	private static void adminModule() {
		Scanner sIn = new Scanner(System.in);
		String choice;

		boolean done = false;
		while(!done) {
			System.out.println("\n1: Shop Customer List"); // DONE!
			System.out.println("2: Customer Order History"); // DONE!
			System.out.println("3: Best Customer"); // DONE!
			System.out.println("4: Exit Admin Module"); // DONE!

			System.out.print("\nWhat would you like to do? (1-4): ");
			choice = sIn.nextLine();

			if (choice.equals("")) {
				done = true;
			} else {
				switch (choice) {
					case "1":
						for(String customer : customerList()) {
							System.out.println(customer);
						}
						break;
					case "2":
						int counter = 0;
						for (Order item : customerHistory()) {
							counter++;
							System.out.println("---------------------------------------------------------------------------------");
							System.out.println("Order #: " + counter);
							System.out.println("---------------------------------Receipt-----------------------------------------");
							System.out.println(item);
						}
						break;
					case "3":
						System.out.println("----------------------------------------------------------------");
						System.out.println("The Dessert Shop's most valued customer is: " + bestCustomer());
						System.out.println("----------------------------------------------------------------");
						break;
					case "4":
						done = true;
						break;

				}//end of switch (choice)
			}//end of if (choice.equals(""))
		}
	}

	public static void main(String[] args) {
		while (true) {
			Order order = new Order();
			Scanner sIn = new Scanner(System.in);
			String choice;
			DessertItem orderItem;


			//-- Switch Statement --//
			boolean done = false;
			while (!done) {
				System.out.println("\n1: Candy");
				System.out.println("2: Cookie");
				System.out.println("3: Ice Cream");
				System.out.println("4: Sunday");
				System.out.println("5: Admin Module");

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
						case "5":
							adminModule();
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

			//-- We are going to grab the customers name --//
			System.out.print("Enter the customer name: ");
			String custName = sIn.nextLine();

			//-- Checks for customer in customerDB and adds them if they are not there --//
			if (!customerDB.containsKey(custName)) {
				Customer newCustomer = new Customer(custName);
				customerDB.put(custName, newCustomer);
				newCustomer.addToHistory(order);
			}
			if (customerDB.containsKey(custName)) {
				Customer existingObject = customerDB.get(custName);
				existingObject.addToHistory(order);
			}

			//-- Payment method --//
			while (true) {
				System.out.print("What form of payment will be used? (CASH, CARD, PHONE): ");
				String paymentMethod = sIn.nextLine();
				paymentMethod = paymentMethod.toUpperCase();

				Payable.PayType enumPaymentMethod; //Represents paymentMethod as enum
				try {
					enumPaymentMethod = Payable.PayType.valueOf(paymentMethod);
				} catch (Exception e) {
					System.out.println("That's not a valid form of payment.");
					continue;
				}

				switch (enumPaymentMethod) {
					case CASH:
						order.setPayType(Payable.PayType.CASH);
						break;
					case CARD:
						order.setPayType(Payable.PayType.CARD);
						break;
					case PHONE:
						order.setPayType(Payable.PayType.PHONE);
						break;
				}
				break;
			}


			// Assignment has hints to write code in this fashion
			// I prefer the method with the Try catch above
				/*
					boolean exists = false;
					for(Payable.PayType type : Payable.PayType.values()) {
						String typeString = type.name();
						if (typeString.equals(paymentMethod)) {
							exists = true;
							break;
						}
					}

					if (!exists) {
						System.out.println("That's not a valid form of payment.");
						continue;
					}
				*/

			Collections.sort(order.getOrderList());

			System.out.println("---------------------------------Receipt-----------------------------------------");
			System.out.println(order.toString());
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Total number of items in order: " + order.itemCount());
			System.out.printf("Order subtotals %28.2f     [Tax: $%.2f] \n\n", order.orderCost(), order.orderTax());
			System.out.printf("Order Total: %30.2f \n", (order.orderCost() + order.orderTax()));
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("paid for with " + order.getPayType());
			System.out.println("---------------------------------------------------------------------------------");
			System.out.printf("Customer Name: %-15s CustomerID: %-15d Total Orders:%-15d \n",
					custName,
					customerDB.get(custName).getID() - 1,
					customerDB.get(custName).getOrderHistory().size() - 1);

			System.out.print("\nHit enter to start a new order:\n\n\n");
			String response = sIn.nextLine();
			if (response.equals("")) {
				continue;
			}



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
}