
package ParkingMAnagement;

public class ParkingSpot {
    private final String spotId;
    private boolean occupied;

    public ParkingSpot(String spotId) {
        this.spotId = spotId;
        this.occupied = false;
    }

    public String getSpotId() {
        return spotId;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupy() {
        this.occupied = true;
    }

    public void free() {
        this.occupied = false;
    }
}
