package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {

	@Test
	void test() {
		Candy myCandy = new Candy();
		assertEquals("", myCandy.getName());
		assertEquals(0.0, myCandy.getCandyWeight());
		assertEquals(0.0, myCandy.getPricePerPound());
		
		myCandy = new Candy("Candy", 1.0, 1.0);
		assertEquals("Candy", myCandy.getName());
		assertEquals(1.0, myCandy.getCandyWeight());
		assertEquals(1.0, myCandy.getPricePerPound());
		
		myCandy = new Candy();
		myCandy.setCandyWeight(2.0);
		assertEquals(2.0, myCandy.getCandyWeight());
		
		myCandy = new Candy();
		myCandy.setPricePerPound(2.0);
		assertEquals(2.0, myCandy.getPricePerPound());
		
		myCandy = new Candy("Candy", 2.0, 2.0);
		assertEquals(4.0, myCandy.calculateCost());
		
		myCandy = new Candy("Candy", 1.0, 1.0);
		assertEquals(0.0725, myCandy.calculateTax());
		
		myCandy = new Candy();
		assertEquals(0.0, myCandy.calculateCost());
		
		myCandy = new Candy();
		assertEquals(0.0, myCandy.calculateTax());
		
	}

}
