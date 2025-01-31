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
public class ValentineBricks {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a city
        City city = new City("MineCity");

        // Create 10 users 
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for User " + i);

            System.out.print("Enter Name for User " + i + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter Gender for User (Male/Female): ");
            String gender = scanner.nextLine();

            city.addUser(new User(name, gender));
        }

        // Create a city manager to interact with users
        CityManager cityManager = new CityManager(city, scanner);
        cityManager.start(); 
    }
}
