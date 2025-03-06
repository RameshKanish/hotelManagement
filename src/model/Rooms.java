package model;

public class Rooms {

    public int id;
    public RoomType roomType;
    public RoomStatus roomStatus;

    public Rooms(int id , RoomType roomType){
        this.roomStatus = RoomStatus.AVAILALBLE;
        this.roomType = roomType;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }
}