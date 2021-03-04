package RealEstate;

public class House extends Residential {
    private double yardAcres;

    //-- default constructor
    public House() {
        super();
        yardAcres = 0.0;
    }

    //-- full argument constructor. Will satisfy super() as well.
    public House(String streetAddress, int zip, int bedCount, double bathCount, int sqFootage, double yardAcres) {
        super(streetAddress, zip, bedCount, bathCount, sqFootage);
        this.yardAcres = yardAcres;
    }

    public double getYardAcres() {
        return yardAcres;
    }

    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres;
    }

    public double calculateAppraisalPrice() {
        return (97.00 * getSqFootage()) + (10000.00 * getBedCount()) + (12000.00 * getBathCount()) + (460000.00 * yardAcres);
    }
}
