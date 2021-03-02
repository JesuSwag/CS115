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
}
