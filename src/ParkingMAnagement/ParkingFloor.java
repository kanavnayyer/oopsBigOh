
package ParkingMAnagement;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private final String name;
    private final List<ParkingSpot> spots;

    public ParkingFloor(String name, int spotCount) {
        this.name = name;
        this.spots = new ArrayList<>();
        for (int i = 1; i <= spotCount; i++) {
            this.spots.add(new ParkingSpot("Spot" + i));
        }
    }

    public String getName() {
        return name;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }
}
