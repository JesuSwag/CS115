package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	@Test
	void test() {
		Cookie myCookie = new Cookie();
		assertEquals("", myCookie.getName());
		assertEquals(0, myCookie.getCookieQty());
		assertEquals(0.0, myCookie.getPricePerDozen());
		
		myCookie = new Cookie("Cookie", 1, 1.0);
		assertEquals("Cookie", myCookie.getName());
		assertEquals(1, myCookie.getCookieQty());
		assertEquals(1.0, myCookie.getPricePerDozen());
		
		myCookie = new Cookie();
		myCookie.setCookieQty(2);
		assertEquals(2, myCookie.getCookieQty());
		
		myCookie = new Cookie();
		myCookie.setPricePerDozen(2.0);
		assertEquals(2.0, myCookie.getPricePerDozen());
		
		myCookie = new Cookie("Cookie", 2, 12.0);
		assertEquals(2.0, myCookie.calculateCost());
		
		myCookie = new Cookie("Cookie", 1, 12.0);
		assertEquals(0.0725, myCookie.calculateTax());
		
		myCookie = new Cookie();
		assertEquals(0.0, myCookie.calculateCost());
		
		myCookie = new Cookie();
		assertEquals(0.0, myCookie.calculateTax());
		
	}

}
