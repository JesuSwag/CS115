package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {
	Candy myCandy = new Candy();
	
	@Test
	void testConstructor() {
		myCandy = new Candy();
		assertEquals("", myCandy.getName());
		assertEquals(0.0, myCandy.getCandyWeight());
		assertEquals(0.0, myCandy.getPricePerPound());
	}	
	
	@Test
	void testFullConstructor() {
		myCandy = new Candy("Candy", 1.0, 1.0);
		assertEquals("Candy", myCandy.getName());
		assertEquals(1.0, myCandy.getCandyWeight());
		assertEquals(1.0, myCandy.getPricePerPound());
	}
	
	@Test
	void testSetCandyWeight() {
		myCandy = new Candy();
		myCandy.setCandyWeight(2.0);
		assertEquals(2.0, myCandy.getCandyWeight());
	}
	
	@Test
	void testSetPricePerPound() {
		myCandy = new Candy();
		myCandy.setPricePerPound(2.0);
		assertEquals(2.0, myCandy.getPricePerPound());
	}
	
	@Test
	void testCalculateCost() {
		myCandy = new Candy("Candy", 2.0, 2.0);
		assertEquals(4.0, myCandy.calculateCost());
	}
	
	@Test
	void testCalculateTax() {
		myCandy = new Candy("Candy", 1.0, 1.0);
		assertEquals(0.0725, myCandy.calculateTax());
	}
	
	//-- These last two tests are with the default constructor
	//-- for calculateCost() and calculateTax()
	@Test
	void testCalculateCostD() {
		myCandy = new Candy();
		assertEquals(0.0, myCandy.calculateCost());
	}
	
	@Test
	void testCalculateTaxD() {
		myCandy = new Candy();
		assertEquals(0.0, myCandy.calculateTax());
		
	}

	@Test
	void testIsSameAsTrue() {
		Candy myCandy1 = new Candy("candy", 1.0, 1.0);
		Candy myCandy2 = new Candy("candy", 2.0, 1.0);
		assertEquals(true, myCandy1.isSameAs(myCandy2));
	}

	@Test
	void testIsSameAsFalse() {
		Candy myCandy1 = new Candy("candy", 1.0, 1.0);
		Candy myCandy2 = new Candy("candy", 1.0, 2.0);
		assertEquals(false, myCandy1.isSameAs(myCandy2));
	}

}
