/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2oops;

/**
 *
 * @author kanav
 */
//ask 2: 
//suppose you are making a program for a very famous IoT Inverter company,
//company have multiple inverters with multiple business logic,
//use cases:
//company have PCU, GTI, Zelio, Regalia, iCruze Inverters,
//All Inverters have Power rating which is determined by ( Current * Operating Voltage )
//Only PCU, GTI and Regalia are solar Inverters other are not
//(solar inverters get charge by solar panels and solar energy),
//Solar Inverters have Solar Panels also
//Solar Inverters further have two option one Battery version that whatever energy 
//is produced will be stored in battery other will not store any energy,
//so PCU comes with battery but GTI have no battery,
//Solar Inverter also have GRID On , system where you can sell your extra energy back, GTI is GRID On where as this feature is not available in PCU,
//Non Solar Inverters are Simple Home Inverters Which have a Battery," 
public class Assign2 {

    public static void main(String[] args) {

        // Array of Solar inverters
        SolarInverter[] solarInverter = new SolarInverter[3];
        solarInverter[0] = new SolarInverter("PCU", 220,
                10, false, true, true, "solar");

        solarInverter[1] = new SolarInverter("GTI", 120, 30,
                true, true, true, "solar");

        solarInverter[2] = new SolarInverter("Zelio", 120, 20,
                true, true, true, "solar");

        // loop of solar inverters
        for (SolarInverter solInverterInd : solarInverter) {
            solInverterInd.displayDetails();
        }

        // array of npn solar inverters
        NonSolarInverter[] nonSolarInverter = new NonSolarInverter[2];
        
        nonSolarInverter[0] = new NonSolarInverter("Rengalia", 220, 123,
                true, "Non Solar");

        nonSolarInverter[1] = new NonSolarInverter("iCruze", 220, 123,
                true, "Non Solar");

        // loop of non lsolar inverter
        for (NonSolarInverter nonSolarInverterInd : nonSolarInverter) {
            nonSolarInverterInd.displayDetails();
        }
    }

}
