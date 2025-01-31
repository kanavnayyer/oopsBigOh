/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingMAnagement;


public class Handicap extends Vehicle {
    public Handicap(String vehiclePlate) {
        super(vehiclePlate);
    }

    @Override
    public Ticket generateTicket(ParkingLot parkingLot) {
        // logic to find an empty spot and generate ticket
        return new Ticket("T" + System.nanoTime(), getVehiclePlate());
    }
}