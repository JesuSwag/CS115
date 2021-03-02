import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResidentialTest extends Property {
    //-- Object to use throughout tests
    Residential test = new Residential();

    //-- test basic constructor
    @Test
    void testConstructor() {
        test = new Residential();
        assertEquals("", test.getStreetAddress());
        assertEquals(0, test.getZip());
        assertEquals(0, test.getBedCount());
        assertEquals(0.0, test.getBathCount());
        assertEquals(0, test.getSqFootage());
    }

    //-- test constructor with arguments
    @Test
    void testFullConstructor() {
        test = new Residential("1234 Street", 12345, 1, 1.5, 1);
        assertEquals("1234 Street", test.getStreetAddress());
        assertEquals(12345, test.getZip());
        assertEquals(1, test.getBedCount());
        assertEquals(1.5, test.getBathCount());
        assertEquals(1, test.getSqFootage());
    }

    //-- The names of each method below describe what the test is doing --//
    @Test
    void testGetStreetAddress() {
        test = new Residential();
        assertEquals("", test.getStreetAddress());
    }

    @Test
    void testGetZip() {
        test = new Residential();
        assertEquals(0, test.getZip());
    }

    @Test
    void testGetBedCount() {
        test = new Residential();
        assertEquals(0, test.getBedCount());
    }

    @Test
    void testGetBathCount() {
        test = new Residential();
        assertEquals(0.0, test.getBathCount());
    }

    @Test
    void testGetSqFootage() {
        test = new Residential();
        assertEquals(0, test.getSqFootage());
    }

    @Test
    void testSetStreetAddress() {
        test = new Residential();
        test.setStreetAddress("1234 Street");
        assertEquals("1234 Street", test.getStreetAddress());
    }

    @Test
    void testSetZip() {
        test = new Residential();
        test.setZip(12345);
        assertEquals(12345, test.getZip());
    }

    @Test
    void testSetBedCount() {
        test = new Residential();
        test.setBedCount(1);
        assertEquals(1, test.getBedCount());
    }

    @Test
    void testSetBathCount() {
        test = new Residential();
        test.setBathCount(1.5);
        assertEquals(1.5, test.getBathCount());
    }

    @Test
    void testSetSqFootage() {
        test = new Residential();
        test.setSqFootage(1);
        assertEquals(1, test.getSqFootage());
    }
}