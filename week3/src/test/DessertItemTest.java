package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertItemTest {

	@Test
	void testDessertItem() {
		Candy myDessertItem = new Candy();
		assertEquals("", myDessertItem.getName());
		
		myDessertItem = new Candy("Jesus", 1.0, 1.0);
		assertEquals("Jesus", myDessertItem.getName());
		
		myDessertItem = new Candy();
		assertEquals("", myDessertItem.setName(""));
		
		myDessertItem = new Candy();
		assertEquals(7.25, myDessertItem.getTaxPercent());
		
		myDessertItem = new Candy();
		myDessertItem.setTaxPercent(8.25);
		assertEquals(8.25, myDessertItem.getTaxPercent());
		

	}

}
