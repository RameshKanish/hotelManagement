package controller;

import model.Hotel;
import model.HotelLocations;
import model.RoomType;
import model.Rooms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelController {

    public Hotel hotel ;
    public HotelLocations hotelLocations;
    public Map<Integer , HotelLocations> locationMap = new HashMap<>();

    public void createLocation(String locationName){
        hotelLocations = new HotelLocations(locationMap.size() + 1, locationName);
        locationMap.put(locationMap.size() + 1 , hotelLocations);
    }

    public void createHotel(int id , String name , int rooms){
        if(!locationMap.containsKey(id)){
            System.out.println("In valid Hotel");
            return;
        }
        HotelLocations hotelLocations1 = locationMap.get(id);
        hotel = new Hotel(hotelLocations.getHotels().size() + 1, name);
        HotelLocations location = locationMap.get(id);
        location.getHotels().add(hotel);

        for(int i = 0 ; i < rooms ; i++){
            hotel.addRoom(new Rooms(i + 1 , RoomType.FAMILY));
        }
    }

    public void displayAllHotels(){
        System.out.println("Hotels is all locations");

        for (Map.Entry<Integer, HotelLocations> hotels : locationMap.entrySet()){
            int locationId = hotels.getKey();
            HotelLocations hotelLocations1 = hotels.getValue();

            System.out.println("Location Id" + locationId + "Location Name " + hotelLocations1.getLocationName());

            for(Hotel hotellist : hotelLocations1.getHotels()){

                System.out.print("Hotel Name " + hotellist.getName());

                for(Rooms roomsList : hotellist.getRooms()){

                    System.out.println("Room Id" + roomsList.getId() + "Room Type" + roomsList.getRoomType());
                }
            }
            System.out.println();
        }
    }
}