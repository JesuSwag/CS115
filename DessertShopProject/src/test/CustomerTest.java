package week3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class CustomerTest {
    Customer myCustomer = new Customer("custname");

    @Test
    void testConstuctor() {
        myCustomer = new Customer("custName");
        ArrayList<Order> myList = new ArrayList<Order>();
        assertEquals("custName", myCustomer.getName());
        assertEquals(myList, myCustomer.getOrderHistory());
        assertEquals(1000, myCustomer.getID());
        assertEquals("Jesus", myCustomer.setName("Jesus"));
    }

    @Test
    void getName() {
        myCustomer = new Customer("custName");
        assertEquals("custName", myCustomer.getName());
    }

    @Test
    void getID() {
        myCustomer = new Customer("custName");
        assertEquals(1000, myCustomer.getID());
    }

    @Test
    void getOrderHistory() {
        myCustomer = new Customer("custName");
        ArrayList<Order> myList = new ArrayList<Order>();
        assertEquals(myList, myCustomer.getOrderHistory());
    }

    @Test
    void setName() {
        myCustomer = new Customer("custName");
        assertEquals("Jesus", myCustomer.setName("Jesus"));
    }
}