package RealEstate;

import java.util.*;

public interface Listable {

    public HashMap<String, Residential> getListings();
    public Residential getListing(String listing);
    public Set<String> getStreetAddresses();
    public Collection<Residential> getResidences();
    public int getListingCount();
    public void addListing(String key, Residential value);

}
