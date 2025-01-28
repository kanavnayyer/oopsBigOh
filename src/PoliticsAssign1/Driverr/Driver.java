/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoliticsAssign1;

/**
 *
 * @author kanav
 */
public class Driver {

    private String Name;
    private String vehicleAssigned;

    // constructor
    public Driver(String Name, String vehicleAssigned) {
        this.Name = Name;
        this.vehicleAssigned = vehicleAssigned;
    }
// getter
    public String getName() {
        return Name;
    }

    // getter
    public String getVehicleAssigned() {

        return vehicleAssigned;
    }

}
