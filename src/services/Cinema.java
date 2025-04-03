/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import functions.Function;
import models.User;
import models.Invoice;
import models.Movie;
import models.Ticket;
        
/**
 * Class representing a Cinema.
 */
public /**
 * Class representing a Cinema.
 */
class Cinema {
    /**
     * Sells a ticket for a movie and adds it to the invoice.
     * @param movie the movie.
     * @param function the function.
     * @param user the user buying the ticket.
     * @param invoice the invoice to add the ticket to.
     */
    public void sellTicket(Movie movie, Function function, User user, Invoice invoice) {
        Ticket ticket = new Ticket(movie, function, user);
        invoice.addTicket(ticket);
    }
   
    /**
     * Generates a new invoice.
     * @return a new invoice instance.
     */
    public Invoice generateInvoice() {
        return new Invoice();
    }
   
    public void manageMovies() {
        // Implementation for movie management
    }
   
    public void manageUsers() {
        // Implementation for user management
    }
}