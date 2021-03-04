package RealEstate;

public abstract class Property {
    //-- data members defined here
    private String streetAddress;
    private int zip;
    private double listPrice;
    private double appraisalPrice;

    //-- basic constructor to set data members to default values
    public Property() {
        streetAddress = "";
        zip = 0;
        listPrice = 0.0;
        appraisalPrice = 0.0;
    }

    //-- argumentative constructor to set data member values
    public Property(String streetAddress, int zip) {
        this.streetAddress = streetAddress;
        this.zip = zip;
        listPrice = 0.0;
        appraisalPrice = 0.0;
    }

    //-- getter method for streetAddress;
    public String getStreetAddress() {
        return streetAddress;
    }

    //-- getter method for zip;
    public int getZip() {
        return zip;
    }

    public double getListPrice() {
        return listPrice;
    }

    public double getAppraisalPrice() {
        return appraisalPrice;
    }

    //-- setter method for streetAddress;
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    //-- setter method for zip;
    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    protected void setAppraisalPrice(double appraisalPrice) {
        this.appraisalPrice = appraisalPrice;
    }

    public abstract double calculateAppraisalPrice();

}
