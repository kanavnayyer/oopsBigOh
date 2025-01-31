/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoliticsAssign1;

/**
 *
 * @author kanav
 */
public class PM extends MP {
    // limit
    private float pmSpendLimit=10000000;
    private AircraftDriver airCraftDriver;
    public PM(String name, String constituency){
    super(name,constituency);
    
    }
    @Override
    boolean doesExceedLimit(){
    
    return super.spending>pmSpendLimit;}
    
    @Override
    boolean canCommisionerArrest(){
    return false;}
    
    //setter
    void assignAirCraftDriver(AircraftDriver aircraftdriver){
        this.airCraftDriver=aircraftdriver;
    }

    //getter
    public AircraftDriver getAirCraftDriver() {
        return airCraftDriver;
    }

   
            
}
