/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day3Task1;

import java.util.Scanner;

/**
 *
 * @author kanav
 */
 public class CityManager {
        private City city;
        private Scanner scanner;

        public CityManager(City city, Scanner scanner) {
            this.city = city;
            this.scanner = scanner;
        }

        public void start() {
            // Adding functionality for interacting with users
            while (true) {
                System.out.println("Welcome to " + city.getName());
                System.out.println("1. Dedicate a brick");
                System.out.println("2. Find the hottest user");
                System.out.println("3. Find user with no dedication");
                System.out.println("4. View bricks in wall");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        // Dedicate a brick
                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();
                        User user = city.getUserByName(name);
                        if (user != null) {
                            System.out.print("Enter caption for your brick: ");
                            String caption = scanner.nextLine();
                            System.out.print("Enter message for your brick: ");
                            String message = scanner.nextLine();
                            Brick brick = city.dedicateBrick(user, caption, message);
                            user.addDedicatedBrick(brick);
                            System.out.println("Brick dedicated successfully!");
                        } else {
                            System.out.println("User not found!");
                        }
                        break;
                    case 2:
                        // Find hottest user
                        User hottestUser = city.findHottestUser();
                        if (hottestUser != null) {
                            System.out.println("The hottest user is: " + hottestUser.getName());
                        } else {
                            System.out.println("No users found!");
                        }
                        break;
                    case 3:
                        // Find user with no dedication
                        User userWithNoDedication = city.findUserWithNoDedication();
                        if (userWithNoDedication != null) {
                            System.out.println(userWithNoDedication.getName() + " has not received any dedication.");
                        } else {
                            System.out.println("All users have received dedications.");
                        }
                        break;
                    case 4:
                        // View bricks in wall
                        System.out.print("Enter wall ID to view: ");
                        int wallId = scanner.nextInt();
                        Wall wall = city.getWallById(wallId);
                        if (wall != null) {
                            System.out.println("Bricks in Wall " + wallId + ":");
                            for (Brick brick : wall.getBricks()) {
                                System.out.println("Brick ID: " + brick.getId() + ", Owner: " + brick.getOwner().getName() +
                                        ", Caption: " + brick.getCaption() + ", Message: " + brick.getMessage());
                            }
                        } else {
                            System.out.println("Wall not found!");
                        }
                        break;
                    case 5:
                        // Exit
                        System.out.println("Thank you");
                        return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
        }
    }
