import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondoTest extends Residential {

    //-- Object to use for testing
    Condo test = new Condo();

    //-- tests basic constructor
    @Test
    void testCondo() {
        test = new Condo();
        assertEquals("", test.getStreetAddress());
        assertEquals(0, test.getZip());
        assertEquals(0, test.getBedCount());
        assertEquals(0.0, test.getBathCount());
        assertEquals(0, test.getSqFootage());
        assertEquals(0, test.getFloorLvl());
    }

    //-- tests constructor with arguments
    @Test
    void testFullCondo() {
        test = new Condo("1234 Street", 12345, 1, 1.5, 1, 5);
        assertEquals("1234 Street", test.getStreetAddress());
        assertEquals(12345, test.getZip());
        assertEquals(1, test.getBedCount());
        assertEquals(1.5, test.getBathCount());
        assertEquals(1, test.getSqFootage());
        assertEquals(5, test.getFloorLvl());
    }

    //-- The names of each method below describe what the test is doing --//
    @Test
    void testGetBedCount() {
        test = new Condo();
        assertEquals(0, test.getBedCount());
    }

    @Test
    void testGetBathCount() {
        test = new Condo();
        assertEquals(0.0, test.getBathCount());
    }

    @Test
    void testGetSqFootage() {
        test = new Condo();
        assertEquals(0, test.getSqFootage());
    }

    @Test
    void testSetBedCount() {
        test = new Condo();
        test.setBedCount(1);
        assertEquals(1, test.getBedCount());
    }

    @Test
    void testSetBathCount() {
        test = new Condo();
        test.setBathCount(1.5);
        assertEquals(1.5, test.getBathCount());
    }

    @Test
    void testSetSqFootage() {
        test = new Condo();
        test.setSqFootage(1);
        assertEquals(1, test.getSqFootage());
    }

    @Test
    void testGetStreetAddress() {
        test = new Condo();
        assertEquals("", test.getStreetAddress());
    }

    @Test
    void testGetZip() {
        test = new Condo();
        assertEquals(0, test.getZip());
    }

    @Test
    void testSetStreetAddress() {
        test = new Condo();
        test.setStreetAddress("1234 Street");
        assertEquals("1234 Street", test.getStreetAddress());
    }

    @Test
    void testSetZip() {
        test = new Condo();
        test.setZip(1);
        assertEquals(1, test.getZip());
    }

    @Test
    void testGetfloorLvl() {
        test = new Condo();
        assertEquals(0, test.getFloorLvl());
    }

    @Test
    void testSetfloorLvl() {
        test = new Condo();
        test.setFloorLvl(5);
        assertEquals(5, test.getFloorLvl());
    }
}