/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingMAnagement;


public class FloorManagement {
    private final ParkingLot parkingLot;

    public FloorManagement(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void addParkingFloor(User user, String floorName, int spotCount) {
        if (user.getRole() == Role.ADMIN) {
            ParkingFloor floor = new ParkingFloor(floorName, spotCount);
            parkingLot.addParkingFloor(floor);
            System.out.println("Added " + floorName + " with " + spotCount + " spots.");
        } else {
            System.out.println("Only admins can add parking floors.");
        }
    }

    public void showParkingSpotStatus(User user) {
        if (user.getRole() == Role.ATTENDANT) {
            for (ParkingFloor floor : parkingLot.getParkingFloors()) {
                System.out.println("Parking Floor: " + floor.getName());
                for (ParkingSpot spot : floor.getSpots()) {
                    System.out.println("  " + spot.getSpotId() + " - " + (spot.isOccupied() ? "Occupied" : "Available"));
                }
            }
        } else {
            System.out.println("Only attendants can check parking spot status.");
        }
    }
}
