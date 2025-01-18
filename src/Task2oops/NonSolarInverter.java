/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2oops;

/**
 *
 * @author kanav
 */
public class NonSolarInverter extends Inverter {

    boolean hasBattery;
// comnstructor
    public NonSolarInverter(String name, float current,
            float operatingVoltage, boolean hasbattery, String type) {

        super(name, current, operatingVoltage, type);
        this.hasBattery = hasBattery;
    }

    @Override
    void displayDetails() {
        System.out.println("Inverter Name :" + getName() + " Type:" + getType());
        System.out.println("Power rating:" + getPowerRating());

        System.out.println("work on Battery" + (hasBattery ? "Yes" : "No"));
        System.out.println("");
    }
}
