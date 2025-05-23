/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;
import exceptions.TicketInvalidException;


/**
 *
 * @author juans
 *
 *
 * Class representing an Invoice.
 *
 */
public class Invoice {
    private int total;
    private final List<Ticket> tickets;
    
    public Invoice() {
        this.tickets = new ArrayList<>();
    }
    
    /**
     * Adds a ticket to the invoice.
     * @param ticket the ticket to add.
     */
    public void addTicket(Ticket ticket) {
        if (ticket == null) {
            throw new TicketInvalidException("Cannot add a null ticket");
        }
        this.tickets.add(ticket);
    }
    
    /**
     * Calculates the total cost of the invoice.
     * @return the total amount.
     */
    public int calculateTotal() {
        this.total = 0;
        for (Ticket ticket : tickets) {
            this.total += ticket.getFinalPrice();
        }
        return total;
    }
}