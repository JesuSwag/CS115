import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PropertyTest {
    //-- Creating object to use throughout the tests.
    Property test = new Property();

    //-- tests basic constructor
    @Test
    void testProperty() {
        test = new Property();
        assertEquals("", test.getStreetAddress());
        assertEquals(0, test.getZip());
    }

    //-- test constructor with arguments
    @Test
    void testFullProperty() {
        test = new Property("123 Street", 12345);
        assertEquals("123 Street", test.getStreetAddress());
        assertEquals(12345, test.getZip());
    }

    //-- tests teh getStreetAddress() getter method
    @Test
    void getStreetAddress() {
        test = new Property();
        assertEquals("", test.getStreetAddress());
    }

    //-- tests the getZip() getter method
    @Test
    void getZip() {
        test = new Property();
        assertEquals(0, test.getZip());
    }

    //-- tests the setStreetAddress() setter method
    @Test
    void setStreetAddress() {
        test = new Property();
        test.setStreetAddress("1234 Street");
        assertEquals("1234 Street", test.getStreetAddress());
    }

    //-- tests the setZip() setter method
    @Test
    void setZip() {
        test = new Property();
        test.setZip(12345);
        assertEquals(12345, test.getZip());
    }
}