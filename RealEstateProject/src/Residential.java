public class Residential extends Property {
    //-- data members set here
    private int bedCount;
    private double bathCount;
    private int sqFootage;

    //-- basic constructor
    public Residential() {
        super();
        bedCount = 0;
        bathCount = 0.0;
        sqFootage = 0;
    }

    //-- constuctor with arguments for data members
    public Residential(String streetAddress, int zip, int bedCount, double bathCount, int sqFootage) {
        super(streetAddress, zip);
        this.bedCount = bedCount;
        this.bathCount = bathCount;
        this.sqFootage = sqFootage;
    }

    //-- getter method for bedCount;
    public int getBedCount() {
        return bedCount;
    }

    //-- getter method for bathCount;
    public double getBathCount() {
        return bathCount;
    }

    //-- getter method for sqFootage;
    public int getSqFootage() {
        return sqFootage;
    }

    //-- setter method for bedCount;
    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    //-- setter method for bathCount;
    public void setBathCount(double bathCount) {
        this.bathCount = bathCount;
    }

    //-- setter method for sqFootage;
    public void setSqFootage(int sqFootage) {
        this.sqFootage = sqFootage;
    }
}
