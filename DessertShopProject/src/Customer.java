package week3;

import java.util.*;

public class Customer {
    String custName;
    ArrayList<Order> orderHistory;
    int custID;
    static int nextCustID = 1000;

    public Customer(String custName) {
        this.custName = custName;
        orderHistory = new ArrayList<Order>();
        nextCustID++;
        custID = nextCustID;
    }

    public String getName() {
        return custName;
    }

    public int getID() {
        return custID;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public String setName(String name) {
        return custName = name;
    }

    public void addToHistory(Order order) {
        orderHistory.add(order);
    }

}
