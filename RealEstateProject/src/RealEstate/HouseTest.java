package RealEstate;

import RealEstate.House;
import RealEstate.Residential;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {
    //-- Object to use for testing
    House test = new House();

    //-- tests basic constructor
    @Test
    void testHouse() {
        test = new House();
        assertEquals("", test.getStreetAddress());
        assertEquals(0, test.getZip());
        assertEquals(0, test.getBedCount());
        assertEquals(0.0, test.getBathCount());
        assertEquals(0, test.getSqFootage());
        assertEquals(0.0, test.getYardAcres());
    }

    //-- tests constructor with arguments
    @Test
    void testFullHouse() {
        test = new House("1234 Street", 12345, 1, 1.5, 1, 0.5);
        assertEquals("1234 Street", test.getStreetAddress());
        assertEquals(12345, test.getZip());
        assertEquals(1, test.getBedCount());
        assertEquals(1.5, test.getBathCount());
        assertEquals(1, test.getSqFootage());
        assertEquals(0.5, test.getYardAcres());
    }

    //-- The names of each method below describe what the test is doing --//
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
    void testSetStreetAddress() {
        test = new House();
        test.setStreetAddress("1234 Street");
        assertEquals("1234 Street", test.getStreetAddress());
    }

    @Test
    void testSetZip() {
        test = new House();
        test.setZip(1);
        assertEquals(1, test.getZip());
    }

    @Test
    void getYardAcres() {
        test = new House();
        assertEquals(0.0, test.getYardAcres());
    }

    @Test
    void setYardAcres() {
        test = new House();
        test.setYardAcres(0.5);
        assertEquals(0.5, test.getYardAcres());
    }

    @Test
    void calculateAppraisalPrice() {
        test = new House();
        assertEquals(0.0, test.calculateAppraisalPrice());
    }
}