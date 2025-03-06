package model;

import java.util.Date;

public class Booking {

    public int  id;
    public Date startDate;
    public Date checkIn;
    public Date checkOut;
    public int totalDays;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public int getTotalDays() {
        return totalDays;
    }


    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }
}