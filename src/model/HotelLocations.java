package model;

import java.util.ArrayList;
import java.util.List;

public class HotelLocations {

    public int id;
    public String locationName;
    public List<Hotel> hotels;

    public HotelLocations(int id , String locationName){
        this.id = id;
        this.locationName = locationName;
        this.hotels = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }
}