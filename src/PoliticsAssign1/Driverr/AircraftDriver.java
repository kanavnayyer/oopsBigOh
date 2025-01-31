/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoliticsAssign1;

/**
 *
 * @author kanav
 */
// extends driver 
public class AircraftDriver extends Driver {

    private boolean hasSpecialPermission = true;

    // constructor called
    public AircraftDriver(String Name, String VehicleAssigned, boolean hasSpecialPermission) {
        super(Name, VehicleAssigned);
        this.hasSpecialPermission = hasSpecialPermission;
    }

    // return is special or not
    public boolean isHasSpecialPermission() {
        return hasSpecialPermission;
    }

}
