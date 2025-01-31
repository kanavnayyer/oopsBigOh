/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoliticsAssign1;

/**
 *
 * @author kanav
 */
public class Commisioner {
    // commisioner got permission or not
    public String canIArrest(MP mp){
        return mp.canCommisionerArrest()?"yes":"no";
    }
}
