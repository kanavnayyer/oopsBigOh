/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingMAnagement;


public abstract class Payment {
    protected final Ticket ticket;

     Payment(Ticket ticket) {
        this.ticket = ticket;
    }

    public abstract void processPayment();
}




