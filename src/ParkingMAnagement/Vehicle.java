/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingMAnagement;

/**
 *
 * @author kanav
 */


public abstract class Vehicle {
    private final String vehiclePlate;

    public Vehicle(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }
 String getVehiclePlate() {
        return vehiclePlate;
    }

    public abstract Ticket generateTicket(ParkingLot parkingLot);
}
