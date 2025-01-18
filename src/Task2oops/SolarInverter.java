/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2oops;

/**
 *
 * @author kanav
 */
public class SolarInverter extends Inverter {

    boolean solarPanel;
    boolean grid;
    boolean batteryType;
// constructor
    
    public SolarInverter(String name, float current, float operatingVoltage,
            boolean solarPanel, boolean grid, boolean batteryType, String type) {
        super(name, current, operatingVoltage, type);
        this.batteryType = batteryType;
        this.grid = grid;
        this.solarPanel = solarPanel;
    }

    @Override// overridden method for display abstract
    void displayDetails() {
        System.out.println("Inverter Name :" + getName() + " Type:" + getType());
        System.out.println("Power rating:" + getPowerRating());
        System.out.println("Has Solar Panel " + (solarPanel ? "Yes" : "No"));
        System.out.println("Has grid " + (grid ? "Yes" : "No"));
        System.out.println("work on Battery" + (batteryType ? "Yes" : "No"));
        System.out.println("");
    }
}
