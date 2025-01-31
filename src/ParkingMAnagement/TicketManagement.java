/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingMAnagement;


import java.util.List;

public class TicketManagement {
    private final ParkingLot parkingLot;

    public TicketManagement(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void generateTicket(Vehicle vehicle, User user) {
        ParkingFloor availableFloor = findAvailableParkingFloor();
        if (availableFloor != null) {
            ParkingSpot availableSpot = findAvailableSpot(availableFloor);
            if (availableSpot != null) {
                availableSpot.occupy();
                Ticket ticket = new Ticket("T" + System.nanoTime(), vehicle.getVehiclePlate());
                parkingLot.addTicket(ticket);
                System.out.println("Ticket generated for " + vehicle.getVehiclePlate() + ": " + ticket.getTicketId());
            } else {
                System.out.println("No available parking spots.");
            }
        } else {
            System.out.println("No available floors.");
        }
    }

    public Ticket findTicket(String ticketId) {
        for (Ticket ticket : parkingLot.getTickets()) {
            if (ticket.getTicketId().equals(ticketId)) {
                return ticket;
            }
        }
        return null;
    }

    public void showAllTransactions() {
        for (Ticket ticket : parkingLot.getTickets()) {
            System.out.println("Ticket ID: " + ticket.getTicketId() + ", Vehicle Plate: " + ticket.getVehiclePlate() + ", Entry Time: " + ticket.getEntryTime());
        }
    }

    private ParkingFloor findAvailableParkingFloor() {
        for (ParkingFloor floor : parkingLot.getParkingFloors()) {
            if (floor.getSpots().stream().anyMatch(spot -> !spot.isOccupied())) {
                return floor;
            }
        }
        return null;
    }

    private ParkingSpot findAvailableSpot(ParkingFloor floor) {
        for (ParkingSpot spot : floor.getSpots()) {
            if (!spot.isOccupied()) {
                return spot;
            }
        }
        return null;
    }
}
