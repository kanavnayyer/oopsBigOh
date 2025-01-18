/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2oops;

/**
 *
 * @author kanav
 */
 abstract class Inverter {
//     Power rating which is determined by ( Current * Operating Voltage
private float powerRating;
private float current;
private float operatingVoltage;
String name;
String type;

// constructor
public Inverter (String name,float current, float operatingVoltage, String type){

this.current=current;
this.operatingVoltage=operatingVoltage;
powerRating= current * operatingVoltage;
this.name=name;
this.type=type;
}

// abstract method
abstract void displayDetails();


// getters

    public String getType(){
        return type;}

    public float getPowerRating() {
        return powerRating;
    }

    public String getName() {
        return name;
    }

}
