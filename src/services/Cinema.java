/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
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
   