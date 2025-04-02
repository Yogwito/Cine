/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author juans
 *
 *
 * Class representing an Invoice.
 */
class Invoice {
    private int total;
    private List<Ticket> tickets;
    
    public Invoice() {
        this.tickets = new ArrayList<>();
    }
    
    /**
     * Adds a ticket to the invoice.
     * @param ticket the ticket to add.
     */
    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }
    
    /**
     * Calculates the total cost of the invoice.
     * @return the total amount.
     */
    public int calculateTotal() {
        this.total = tickets.stream().mapToInt(Ticket::getFinalPrice).sum();
        return total;
    }
}