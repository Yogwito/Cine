/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package services;

import java.util.ArrayList;
import java.util.List;
import functions.Function;
import models.User;
import models.Invoice;
import models.Movie;
import models.Ticket;
import exceptions.TicketInvalidException;

/**
 * Class representing a Cinema.
 */

/**
 * Class representing a Cinema.
 */
public class Cinema {
    private List<Movie> movieList;
    private List<User> users;
    
    public Cinema() {
        this.movieList = new ArrayList<>();
        this.users = new ArrayList<>();
    }
    
    /**
     * Sells a ticket for a movie and adds it to the invoice.
     * @param movie the movie.
     * @param function the function.
     * @param user the user buying the ticket.
     * @param invoice the invoice to add the ticket to.
     * @return the created ticket.
     */
    public Ticket sellTicket(Movie movie, Function function, User user, Invoice invoice) {
        if (movie == null || function == null || user == null || invoice == null) {
            throw new TicketInvalidException("Cannot pass null parameters");
        }
        
        Ticket ticket = new Ticket(movie, function, user);
        invoice.addTicket(ticket);
        return ticket;
    }
    
    /**
     * Generates a new invoice.
     * @return a new invoice instance.
     */
    public Invoice generateInvoice() {
        return new Invoice();
    }
    
    /**
     * Manages the cinema's movies.
     */
    public void manageMovies() {
        // Implementation for movie management
    }
    
    /**
     * Manages the cinema's users.
     */
    public void manageUsers() {
        // Implementation for user management
    }
    
    // Nuevos métodos para agregar películas y usuarios
    public void addMovie(Movie movie) {
        this.movieList.add(movie);
    }
    
    public void addUser(User user) {
        this.users.add(user);
    }
}
