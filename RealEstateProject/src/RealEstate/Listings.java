package RealEstate;

import java.util.*;

public class Listings implements Listable {
    HashMap<String, Residential> listings;

    public Listings() {
        listings = new HashMap<>();
    }

    public HashMap<String, Residential> getListings() {
        return listings;
    }

    public Residential getListing(String listing) {
        return listings.get(listing);
    }

    public Set<String> getStreetAddresses() {
        //-- Loop through listings and use the element.getStreetAddress() to add to set. Return set --//
        Set<String> addresses = new HashSet<>();

        for (Map.Entry<String, Residential> item : listings.entrySet()) {
            addresses.add(item.getValue().getStreetAddress());
        }

        return addresses;
    }

    public Collection<Residential> getResidences() {
        //-- Create ArrayList, loop through hashmap, add each residence to ArrayList, return ArrayList --//
        ArrayList<Residential> residences = new ArrayList<>();

        for (Map.Entry<String, Residential> item : listings.entrySet()) {
            residences.add(item.getValue());
        }

        return residences;
    }

    public int getListingCount() {
        return listings.size();
    }

    public void addListing(String key, Residential value) {
        listings.put(key, value);
    }

}
