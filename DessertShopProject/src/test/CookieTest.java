package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {
	Cookie myCookie = new Cookie();
	
	@Test
	void testConstructor() {
		myCookie = new Cookie();
		assertEquals("", myCookie.getName());
		assertEquals(0, myCookie.getCookieQty());
		assertEquals(0.0, myCookie.getPricePerDozen());
	}
	
	@Test
	void testFullConstructor() {
		myCookie = new Cookie("Cookie", 1, 1.0);
		assertEquals("Cookie", myCookie.getName());
		assertEquals(1, myCookie.getCookieQty());
		assertEquals(1.0, myCookie.getPricePerDozen());
	}
	
	@Test
	void testSetCookieQty() {
		myCookie = new Cookie();
		myCookie.setCookieQty(2);
		assertEquals(2, myCookie.getCookieQty());
	}
	
	@Test
	void testSetPricePerDozen() {
		myCookie = new Cookie();
		myCookie.setPricePerDozen(2.0);
		assertEquals(2.0, myCookie.getPricePerDozen());
	}
	
	@Test
	void testCalculateCost() {
		myCookie = new Cookie("Cookie", 2, 12.0);
		assertEquals(2.0, myCookie.calculateCost());
	}
	
	@Test
	void testCalculateTax() {
		myCookie = new Cookie("Cookie", 1, 12.0);
		assertEquals(0.0725, myCookie.calculateTax());
	}
	
	@Test
	void testCalculateCostD() {
		myCookie = new Cookie();
		assertEquals(0.0, myCookie.calculateCost());
	}
	
	@Test
	void testCalculateTaxD() {
		myCookie = new Cookie();
		assertEquals(0.0, myCookie.calculateTax());
		
	}

	@Test
	void testIsSameAsTrue() {
		Cookie myCookie1 = new Cookie("cookie", 1, 1.0);
		Cookie myCookie2 = new Cookie("cookie", 2, 1.0);
		assertEquals(true, myCookie1.isSameAs(myCookie2));
	}

	@Test
	void testIsSameAsFalse() {
		Cookie myCookie1 = new Cookie("cookie", 1, 1.0);
		Cookie myCookie2 = new Cookie("cookie", 1, 2.0);
		assertEquals(false, myCookie1.isSameAs(myCookie2));
	}

}
