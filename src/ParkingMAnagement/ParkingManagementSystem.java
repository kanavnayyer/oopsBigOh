/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingMAnagement;
import java.util.Scanner;

public class ParkingManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot("Lot 1");
        FloorManagement floorManagement = new FloorManagement(parkingLot);
        TicketManagement ticketManagement = new TicketManagement(parkingLot);

        User adminUser = new User("Admin", Role.ADMIN);
        User attendantUser = new User("Attendant", Role.ATTENDANT);
        User regularUser = new User("Regular User", Role.USER);

        floorManagement.addParkingFloor(adminUser, "Floor 1", 5);
        floorManagement.addParkingFloor(adminUser, "Floor 2", 5);

        while (true) {
            System.out.println("\nParking System Menu:");
            System.out.println("1. Generate Ticket (Vehicle enters)");
            System.out.println("2. Make Payment (Vehicle exits)");
            System.out.println("3. Show All Transactions");
            System.out.println("4. Show Parking Spot Status (Attendant)");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle Type (Car, Motorcycle, Handicap): ");
                    String vehicleType = scanner.nextLine().toLowerCase();
                    System.out.print("Enter Vehicle Plate Number: ");
                    String vehiclePlate = scanner.nextLine();

                    Vehicle vehicle = createVehicle(vehicleType, vehiclePlate);
                    if (vehicle != null && regularUser.getRole() == Role.USER) {
                        ticketManagement.generateTicket(vehicle, regularUser);
                    } else {
                        System.out.println("Only users can park vehicles.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Ticket ID: ");
                    String ticketId = scanner.nextLine();
                    Ticket paymentTicket = ticketManagement.findTicket(ticketId);
                    if (paymentTicket != null) {
                        System.out.println("1. Cash Payment");
                        System.out.println("2. Credit Card Payment");
                        System.out.print("Select payment method: ");
                        int paymentMethod = scanner.nextInt();
                        scanner.nextLine();

                        Payment payment = null;
                        if (paymentMethod == 1) {
                            payment = new CashPayment(paymentTicket);
                        } else if (paymentMethod == 2) {
                            payment = new CreditCardPayment(paymentTicket);
                        }

                        if (payment != null) {
                            payment.processPayment();
                        }
                    } else {
                        System.out.println("Ticket not found.");
                    }
                    break;
                case 3:
                    ticketManagement.showAllTransactions();
                    break;
                case 4:
                    floorManagement.showParkingSpotStatus(attendantUser);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static Vehicle createVehicle(String vehicleType, String vehiclePlate) {
        if ("car".equals(vehicleType)) {
            return new Car(vehiclePlate);
        } else if ("motorcycle".equals(vehicleType)) {
            return new Motorcycle(vehiclePlate);
        } else if ("handicap".equals(vehicleType)) {
            return new Handicap(vehiclePlate);
        } else {
            System.out.println("Invalid vehicle type.");
            return null;
        }
    }
}
