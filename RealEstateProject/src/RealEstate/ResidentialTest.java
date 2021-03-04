package RealEstate;

import RealEstate.Property;
import RealEstate.Residential;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResidentialTest {
    //-- Object to use throughout tests
    House test = new House();

    //-- test basic constructor
    @Test
    void testConstructor() {
        test = new House();
        assertEquals("", test.getStreetAddress());
        assertEquals(0, test.getZip());
        assertEquals(0, test.getBedCount());
        assertEquals(0.0, test.getBathCount());
        assertEquals(0, test.getSqFootage());
    }

    //-- test constructor with arguments
    @Test
    void testFullConstructor() {
        test = new House("1234 Street", 12345, 1, 1.5, 1, 1.0);
        assertEquals("1234 Street", test.getStreetAddress());
        assertEquals(12345, test.getZip());
        assertEquals(1, test.getBedCount());
        assertEquals(1.5, test.getBathCount());
        assertEquals(1, test.getSqFootage());
    }

    //-- The names of each method below describe what the test is doing --//
    @Test
    void testGetStreetAddress() {
        test = new House();
        assertEquals("", test.getStreetAddress());
    }

    @Test
    void testGetZip() {
        test = new House();
        assertEquals(0, test.getZip());
    }

    @Test
    void testGetBedCount() {
        test = new House();
        assertEquals(0, test.getBedCount());
    }

    @Test
    void testGetBathCount() {
        test = new House();
        assertEquals(0.0, test.getBathCount());
    }

    @Test
    void testGetSqFootage() {
        test = new House();
        assertEquals(0, test.getSqFootage());
    }

    @Test
    void testSetStreetAddress() {
        test = new House();
        test.setStreetAddress("1234 Street");
        assertEquals("1234 Street", test.getStreetAddress());
    }

    @Test
    void testSetZip() {
        test = new House();
        test.setZip(12345);
        assertEquals(12345, test.getZip());
    }

    @Test
    void testSetBedCount() {
        test = new House();
        test.setBedCount(1);
        assertEquals(1, test.getBedCount());
    }

    @Test
    void testSetBathCount() {
        test = new House();
        test.setBathCount(1.5);
        assertEquals(1.5, test.getBathCount());
    }

    @Test
    void testSetSqFootage() {
        test = new House();
        test.setSqFootage(1);
        assertEquals(1, test.getSqFootage());
    }
}