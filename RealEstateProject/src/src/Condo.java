public class Condo extends Residential {
    private int floorLvl;

    //-- default constructor
    public Condo() {
        super();
        floorLvl = 0;
    }

    //-- full argument constructor. Will satisfy super() as well.
    public Condo(String streetAddress, int zip, int bedCount, double bathCount, int sqFootage, int floorLvl) {
        super(streetAddress, zip, bedCount, bathCount, sqFootage);
        this.floorLvl = floorLvl;
    }

    public double getFloorLvl() {
        return floorLvl;
    }

    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl;
    }
}
