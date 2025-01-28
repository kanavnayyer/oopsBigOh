/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoliticsAssign1;

/**
 *
 * @author kanav
 */
public class MP {

    private String name;
    private String constituency;
    float spending;
    private Driver driver;
    private float spendingLimit = 100000;

    public MP(String name, String constituency) {
        this.name = name;
        this.constituency = constituency;
        this.spending = 0;// initial it will be zero when mp will spend we will round off fro limit

    }

    public void assignDriver(Driver driver) {// setter
        this.driver = driver;
    }

    public Driver getDriver() {// driver getter
        return driver;
    }

    public void hasSpend(float inr) {// total spennd

        spending += inr;

    }

    public String getName() {// getter
        return name;
    }
// area where rule getter

    public String getConstituency() {
        return constituency;
    }
// limit check limit

    boolean doesExceedLimit() {
        return spending > spendingLimit;
    }

    // check for arrest
    boolean canCommisionerArrest() {
        return doesExceedLimit();
    }

    // getter
    public float getSpending() {
        return spending;
    }

}
