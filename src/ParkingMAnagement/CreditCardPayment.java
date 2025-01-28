/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkingMAnagement;

 class CreditCardPayment extends Payment {
    public CreditCardPayment(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void processPayment() {
        System.out.println("Paid for ticket " + ticket.getTicketId() + " using Credit Card.");
    }
}