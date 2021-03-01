package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IceCreamTest {

	@Test
	void test() {
		IceCream myIceCream = new IceCream();
		assertEquals("", myIceCream.getName());
		assertEquals(0, myIceCream.getScoopCount());
		assertEquals(0.0, myIceCream.getPricePerScoop());
		
		myIceCream = new IceCream("IceCream", 1, 1.0);
		assertEquals("IceCream", myIceCream.getName());
		assertEquals(1, myIceCream.getScoopCount());
		assertEquals(1.0, myIceCream.getPricePerScoop());
		
		myIceCream = new IceCream();
		myIceCream.setScoopCount(2);
		assertEquals(2, myIceCream.getScoopCount());
		
		myIceCream = new IceCream();
		myIceCream.setPricePerScoop(2.0);
		assertEquals(2.0, myIceCream.getPricePerScoop());
		
		myIceCream = new IceCream("IceCream", 1, 1.0);
		myIceCream.setScoopCount(2);
		assertEquals(2, myIceCream.getScoopCount());
		
		myIceCream = new IceCream("IceCream", 1, 1.0);
		myIceCream.setPricePerScoop(2.0);
		assertEquals(2.0, myIceCream.getPricePerScoop());
		
		myIceCream = new IceCream();
		assertEquals(0.0, myIceCream.calculateCost());
		
		myIceCream = new IceCream();
		assertEquals(0.0, myIceCream.calculateTax());
		
		myIceCream = new IceCream("IceCream", 1, 1.0);
		assertEquals(1.0, myIceCream.calculateCost());
		
		myIceCream = new IceCream("IceCream", 1, 1.0);
		assertEquals(0.0725, myIceCream.calculateTax());
		
	}

}
