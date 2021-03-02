public class Property {
    //-- data members defined here
    private String streetAddress;
    private int zip;

    //-- basic constructor to set data members to default values
    public Property() {
        streetAddress = "";
        zip = 0;
    }

    //-- argumentative constructor to set data member values
    public Property(String streetAddress, int zip) {
        this.streetAddress = streetAddress;
        this.zip = zip;
    }

    //-- getter method for streetAddress;
    public String getStreetAddress() {
        return streetAddress;
    }

    //-- getter method for zip;
    public int getZip() {
        return zip;
    }

    //-- setter method for streetAddress;
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    //-- setter method for zip;
    public void setZip(int zip) {
        this.zip = zip;
    }
}
