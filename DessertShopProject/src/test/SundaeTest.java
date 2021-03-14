package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest {

	@Test
	void test() {
		Sundae mySundae = new Sundae();
		assertEquals("", mySundae.getToppingName());
		assertEquals(0.0, mySundae.getToppingPrice());
		assertEquals(0, mySundae.getScoopCount());
		assertEquals(0.0, mySundae.getPricePerScoop());
		assertEquals("", mySundae.getName());
		
		mySundae = new Sundae("Sundae", 1, 1.0, "Topping", 1.0);
		assertEquals("Sundae", mySundae.getName());
		assertEquals(1, mySundae.getScoopCount());
		assertEquals(1.0, mySundae.getPricePerScoop());
		assertEquals("Topping", mySundae.getToppingName());
		assertEquals(1.0, mySundae.getToppingPrice());
		
		mySundae = new Sundae();
		mySundae.setToppingName("Topping");
		assertEquals("Topping", mySundae.getToppingName());
		
		mySundae = new Sundae();
		mySundae.setToppingPrice(1.0);
		assertEquals(1.0, mySundae.getToppingPrice());
		
		mySundae = new Sundae("Sundae", 1, 1.0, "Topping", 1.0);
		mySundae.setToppingName("newTopping");
		assertEquals("newTopping", mySundae.getToppingName());
		
		mySundae = new Sundae("Sundae", 1, 1.0, "Topping", 1.0);
		mySundae.setToppingPrice(2.0);
		assertEquals(2.0, mySundae.getToppingPrice());
		
		mySundae = new Sundae();
		assertEquals(0.0, mySundae.calculateCost());
		
		mySundae = new Sundae();
		assertEquals(0.0, mySundae.calculateTax());
		
		mySundae = new Sundae("Sundae", 1, 1.0, "Topping", 1.0);
		assertEquals(2.0, mySundae.calculateCost());
		
		mySundae = new Sundae("Sundae", 1, 1.0, "Topping", 1.0);
		assertEquals(0.145, mySundae.calculateTax());
		
	}

}