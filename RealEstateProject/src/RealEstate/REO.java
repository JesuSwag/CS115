package RealEstate;

import java.text.NumberFormat;
import java.util.*;

public class REO {
    //-- Listing DB for all listings --//
    static Listings listingsDB = new Listings();

    //------------------------ Bids Menu Methods ------------------------//
    public static Object bidsMenu() {
        while (true) {
            Scanner sIn = new Scanner(System.in);
            String choice;

            //-- Switch Statement --//
            System.out.println("\n");
            System.out.println("---------------------------");
            System.out.println("         Bids Menu         ");
            System.out.println("---------------------------");
            System.out.println("1: Add New Bid");
            System.out.println("2: Show Existing Bids");
            System.out.println("3: Auto Populate Bids (Dev tool)");
            System.out.println("ENTER: Exit back to previous menu");

            System.out.print("\nWhat would you like to do? (1-3): ");
            choice = sIn.nextLine();

            switch (choice) {
                case "1":
                    //-- COMING SOON --//
                    break;
                case "2":
                    //-- COMING SOON --//
                    break;
                case "3":
                    //-- COMING SOON --//
                    break;
                case "":
                    return null;
            }//end of switch
        }//end of while
    }

    //------------------------ Listings Menu Methods ------------------------//
    public static Object listingMenu() {
        while (true) {
            Scanner sIn = new Scanner(System.in);
            String choice;

            //-- Switch Statement --//
            System.out.println("\n");
            System.out.println("---------------------------");
            System.out.println("        Listing Menu       ");
            System.out.println("---------------------------");
            System.out.println("1: Add Listing");
            System.out.println("2: Show Listings");
            System.out.println("3: Auto Populate Listings (Dev tool)");
            System.out.println("ENTER: Exit back to previous menu");

            System.out.print("\nWhat would you like to do? (1-3): ");
            choice = sIn.nextLine();

            switch (choice) {
                case "1":
                    addListingMenu();
                    break;
                case "2":
                    showListings();
                    break;
                case "3":
                    autoPopulate();
                    break;
                case "":
                    return null;
            }//end of switch
        }//end of while
    }

    public static Object addListingMenu() {
        while (true) {
            Scanner sIn = new Scanner(System.in);
            String choice;

            //-- Switch Statement --//
            System.out.println("\n");
            System.out.println("---------------------------");
            System.out.println("      Add Listing Menu     ");
            System.out.println("---------------------------");
            System.out.println("1: Add House");
            System.out.println("2: Add Condo");
            System.out.println("ENTER: Exit back to previous menu");

            System.out.print("\nWhat would you like to do? (1-2): ");
            choice = sIn.nextLine();

            switch (choice) {
                case "1":
                    addHouse();
                    break;
                case "2":
                    addCondo();
                    break;
                case "":
                    return null;
            }//end of switch
        }//end of while
    }

    public static void addHouse() {
        Scanner sIn = new Scanner(System.in);
        String s_Zip;
        String s_Bedrooms;
        String s_Bathrooms;
        String s_SqFootage;
        String s_Acres;
        String s_ListPrice;
        int zip;
        int bedrooms;
        double bathrooms;
        int sqFootage;
        double acres;
        double listPrice;

        System.out.print("Please enter the street address for the residence: ");
        String address = sIn.nextLine();

        while(true) {
            System.out.print("Please enter the zip code for the residence: ");
            s_Zip = sIn.nextLine();

            System.out.print("Please enter the number of bedrooms: ");
            s_Bedrooms = sIn.nextLine();

            System.out.print("Please enter the number of bathrooms: ");
            s_Bathrooms = sIn.nextLine();

            System.out.print("Please enter the square footage of the residence: ");
            s_SqFootage = sIn.nextLine();

            System.out.print("Please enter the size of the yard in acres: ");
            s_Acres = sIn.nextLine();

            try {
                zip = Integer.parseInt(s_Zip);
                bedrooms = Integer.parseInt(s_Bedrooms);
                bathrooms = Double.parseDouble(s_Bathrooms);
                sqFootage = Integer.parseInt(s_SqFootage);
                acres = Double.parseDouble(s_Acres);
                break;
            } catch (Exception e) {
                System.out.println("Enter only whole numbers for zip, beds, sqFootage and decimal number for yard and bath");
            }
        }

        House newListing = new House(address, zip, bedrooms, bathrooms, sqFootage, acres);
        listingsDB.addListing(address, newListing);

        //-- Formats appraisal price like dollars --//
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double appraisalPrice = newListing.calculateAppraisalPrice();
        System.out.println("\nAppraisal Price for this property is: " + currency.format(appraisalPrice));

        while(true) {
            System.out.print("\nPlease enter the List Price for the property: $");
            s_ListPrice = sIn.nextLine();

            try {
                listPrice = Double.parseDouble(s_ListPrice);
                break;
            } catch (Exception e) {
                System.out.println("Please enter a dollar amount");
            }
        }

        System.out.println("\nYou have created a new listing!");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("Residence Type: House        Address: %-10s Zip Code: %d", address, zip);
        System.out.println("\n----------------------------------------------------------------------------------------");
        System.out.println("Sq Footage: " + sqFootage);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
        System.out.println("Yard Size (Acres): " + acres);
        System.out.println("-------------------------------------");
        System.out.println("Appraisal Price: " + currency.format(appraisalPrice));
        System.out.println("List Price: " + currency.format(listPrice));
        System.out.println("-------------------------------------");

    }

    public static void addCondo() {
        Scanner sIn = new Scanner(System.in);
        String s_Zip;
        String s_Bedrooms;
        String s_Bathrooms;
        String s_SqFootage;
        String s_FloorLvl;
        String s_ListPrice;
        int zip;
        int bedrooms;
        double bathrooms;
        int sqFootage;
        int floorLvl;
        double listPrice;

        System.out.print("\nPlease enter the street address for the residence: ");
        String address = sIn.nextLine();

        while(true) {
            System.out.print("Please enter the zip code for the residence: ");
            s_Zip = sIn.nextLine();

            System.out.print("Please enter the number of bedrooms: ");
            s_Bedrooms = sIn.nextLine();

            System.out.print("Please enter the number of bathrooms: ");
            s_Bathrooms = sIn.nextLine();

            System.out.print("Please enter the square footage of the residence: ");
            s_SqFootage = sIn.nextLine();

            System.out.print("Please enter the floor level of the condo: ");
            s_FloorLvl = sIn.nextLine();

            try {
                zip = Integer.parseInt(s_Zip);
                bedrooms = Integer.parseInt(s_Bedrooms);
                bathrooms = Double.parseDouble(s_Bathrooms);
                sqFootage = Integer.parseInt(s_SqFootage);
                floorLvl = Integer.parseInt(s_FloorLvl);
                break;
            } catch (Exception e) {
                System.out.println("Enter only whole numbers for zip, beds, sqFootage and decimal number for yard and bath");
            }
        }

        Condo newListing = new Condo(address, zip, bedrooms, bathrooms, sqFootage, floorLvl);
        listingsDB.addListing(address, newListing);

        //-- Formats appraisal price like dollars --//
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double appraisalPrice = newListing.calculateAppraisalPrice();
        System.out.println("\nAppraisal Price for this property is: " + currency.format(appraisalPrice));

        while(true) {
            System.out.print("Please enter the List Price for the property: $");
            s_ListPrice = sIn.nextLine();

            try {
                listPrice = Double.parseDouble(s_ListPrice);
                break;
            } catch (Exception e) {
                System.out.println("Please enter a dollar amount");
            }
        }

        System.out.println("\nYou have created a new listing!");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("Residence Type: Condo        Address: %s Zip Code: %10d", address, zip);
        System.out.println("\n----------------------------------------------------------------------------------------");
        System.out.println("Sq Footage: " + sqFootage);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
        System.out.println("Floor: " + floorLvl);
        System.out.println("-------------------------------------");
        System.out.println("Appraisal Price: " + currency.format(appraisalPrice));
        System.out.println("List Price: " + currency.format(listPrice));
        System.out.println("-------------------------------------");
    }

    public static void autoPopulate() {
        Listings reoListings = new Listings();
        int currentSize = reoListings.getListings().size();

        House house1 = new House("34 Elm",95129, 3, 2, 2200, .2);
        house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("34 Elm", house1);

        House house2 = new House("42 Hitchhikers",95136, 4, 3, 2800, .3);
        house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("42 Hitchhikers", house2);

        Condo condo1 = new Condo("4876 Industrial", 95177, 3, 1, 1800, 3);
        condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("4876 Industrial", condo1);

        House house3 = new House("2654 Oak",84062, 5, 53, 4200, .5);
        house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("2654 Oak", house3);

        Condo condo2 = new Condo("9875 Lexington",84063, 2, 1, 1500, 1);
        condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("9875 Lexington", condo2);

        Condo condo3 = new Condo("3782 Market", 84066, 3, 1, 1800, 2);
        condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("3782 Market", condo3);

        House house4 = new House("7608 Glenwood", 84055, 6, 3, 3900, .4);
        house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("7608 Glenwood", house4);

        House house5 = new House("1220 Apple", 84057, 8, 7, 7900, 1);
        house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("1220 Apple", house5);

    }

    public static void showListings() {
        System.out.println("\nCurrent Listings for REO:");
        if (listingsDB.getListings().size() == 0) {
            System.out.println("\nNo Current Listings");
        } else {
            int counter = 0;
            for (Map.Entry<String, Residential> item : listingsDB.getListings().entrySet()) {
                counter++;
                System.out.println("\n\nListing No: " + counter);
                System.out.println(item.getValue().toString());
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner sIn = new Scanner(System.in);
            String choice;

            //-- Switch Statement --//
            System.out.println("---------------------------");
            System.out.println("         Main Menu         ");
            System.out.println("---------------------------");
            System.out.println("1: Listings");
            System.out.println("2: Bids");

            System.out.print("\nWhat would you like to do? (1-2): ");
            choice = sIn.nextLine();

            switch (choice) {
                case "1":
                    listingMenu();
                    break;
                case "2":
                    bidsMenu();
                    break;
            }//end of switch

            System.out.println("\n");
        }//end of while
    }
}
