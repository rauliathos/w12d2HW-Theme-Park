package Stalls;

import Interfaces.IReviewed;

public abstract class Stall implements IReviewed{
    private String name;
    private String ownerName;
    private int parkingSpot;




    private int rating;



    public Stall(String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;

    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getRating() {
        return rating;
    }


}
