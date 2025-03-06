package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public int id;
    public String name;
    List<Rooms> rooms;

    public List<Rooms> getRooms() {
        return rooms;
    }

    public void setRooms(List<Rooms> rooms) {
        this.rooms = rooms;
    }

    public Hotel(int id , String name){
        this.name = name;
        this.id = id;
        this.rooms = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addRoom(Rooms room){
        rooms.add(room);
    }

    public int getTotalRooms(){
        return rooms.size();
    }
}