package RealEstate;

import java.text.NumberFormat;

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

    public int getFloorLvl() {
        return floorLvl;
    }

    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl;
    }

    public double calculateAppraisalPrice() {
        return ((88.00 * getSqFootage()) + (8000.00 * getBedCount()) + (10000.00 * getBathCount()) + (5000.00 * floorLvl));
    }

    @Override
    public String toString() {
        String output;
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        output = String.format("----------------------------------------------------------------------------------------" +
                                "\nResidence Type: Condo        Address: %-10s Zip Code: %d" +
                                "\n----------------------------------------------------------------------------------------" +
                                "\nSq Footage: %d" +
                                "\nBedrooms: %d" +
                                "\nBathrooms: %f" +
                                "\nFloor Level: %d" +
                                "\n-------------------------------------" +
                                "\nAppraisal Price: %s" +
                                "\nList Price: %s" +
                                "\n-------------------------------------",
                getStreetAddress(), getZip(),
                getSqFootage(), getBedCount(), getBathCount(), getFloorLvl(),
                currency.format(calculateAppraisalPrice()), currency.format(calculateAppraisalPrice()));

        return output;
    }
}
