package RealEstate;

import RealEstate.House;
import RealEstate.Property;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PropertyTest {
    //-- Creating object to use throughout the tests.
    House test = new House();

    //-- tests basic constructor
    @Test
    void testProperty() {
        test = new House();
        assertEquals("", test.getStreetAddress());
        assertEquals(0, test.getZip());
    }

    //-- test constructor with arguments
    @Test
    void testFullProperty() {
        test = new House("123 Street", 12345, 1, 1.0, 1, 1.0);
        assertEquals("123 Street", test.getStreetAddress());
        assertEquals(12345, test.getZip());
    }

    //-- tests teh getStreetAddress() getter method
    @Test
    void getStreetAddress() {
        test = new House();
        assertEquals("", test.getStreetAddress());
    }

    //-- tests the getZip() getter method
    @Test
    void getZip() {
        test = new House();
        assertEquals(0, test.getZip());
    }

    //-- tests the setStreetAddress() setter method
    @Test
    void setStreetAddress() {
        test = new House();
        test.setStreetAddress("1234 Street");
        assertEquals("1234 Street", test.getStreetAddress());
    }

    //-- tests the setZip() setter method
    @Test
    void setZip() {
        test = new House();
        test.setZip(12345);
        assertEquals(12345, test.getZip());
    }

    @Test
    void getListPrice() {
        test = new House();
        assertEquals(0.0, test.getListPrice());
    }

    @Test
    void getAppraisalPrice() {
        test = new House();
        assertEquals(0.0, test.getAppraisalPrice());
    }

    @Test
    void setListPrice() {
        test = new House();
        test.setListPrice(1.0);
        assertEquals(1.0, test.getListPrice());
    }

    @Test
    void setAppraisalPrice() {
        test = new House();
        test.setAppraisalPrice(1.0);
        assertEquals(1.0, test.getAppraisalPrice());
    }
}