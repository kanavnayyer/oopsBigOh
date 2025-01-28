/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingMAnagement;


import java.time.LocalDateTime;


public class Ticket {
    private final String ticketId;
    private final String vehiclePlate;
    private final LocalDateTime entryTime;

    public Ticket(String ticketId, String vehiclePlate) {
        this.ticketId = ticketId;
        this.vehiclePlate = vehiclePlate;
        this.entryTime = LocalDateTime.now();
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
