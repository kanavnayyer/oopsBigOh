
package ParkingMAnagement;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final String name;
    private final List<ParkingFloor> parkingFloors;
    private final List<Ticket> tickets;

    public ParkingLot(String name) {
        this.name = name;
        this.parkingFloors = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

     List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void addParkingFloor(ParkingFloor floor) {
        parkingFloors.add(floor);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
}
