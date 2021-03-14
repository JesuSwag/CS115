package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertItemTest {
	DessertItem myDessertItem = new Candy();
	
	@Test
	void testConstructor() {
		myDessertItem = new Candy();
		assertEquals("", myDessertItem.getName());
	}
		
	@Test
	void testSetName() {
		myDessertItem = new Candy();
		myDessertItem.setName("ItemName");
		assertEquals("ItemName", myDessertItem.getName());
	}
	
	@Test
	void testGetTaxPercent() {
		myDessertItem = new Candy();
		assertEquals(7.25, myDessertItem.getTaxPercent());	
	}
	
	@Test
	void testSetTaxPercent() {
		myDessertItem = new Candy();
		myDessertItem.setTaxPercent(8.25);
		assertEquals(8.25, myDessertItem.getTaxPercent());
	}
	
	@Test
	void testGetName() {
		myDessertItem = new Candy();
		myDessertItem = new Candy("Jesus", 1.0, 1.0);
		assertEquals("Jesus", myDessertItem.getName());
	}

	@Test
	void testCompareTo() {
		myDessertItem = new Candy();
		assertEquals(0, myDessertItem.compareTo(myDessertItem));

		DessertItem myDessertItem1 = new Candy("test", -1.0, -1.0);
		assertEquals(1, myDessertItem1.compareTo(myDessertItem));

		DessertItem myDessertItem2 = new Candy("test", 10.0, 10.0);
		assertEquals(-1, myDessertItem.compareTo(myDessertItem2));
	}

}
