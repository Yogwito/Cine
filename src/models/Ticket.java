/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import exceptions.TicketInvalidException;
import functions.Function;

/**
 *
 * @author juans
 *
 *
 */
public class Ticket {
    private Movie movie;
    private Function function;
    private int finalPrice;
    
    public Ticket(Movie movie, Function function, User user) {
        if (movie == null || function == null || user == null) {
            throw new TicketInvalidException("Cannot create a ticket with null data");
        }
        
        this.movie = movie;
        this.function = function;
        int basePrice = movie.calculatePrice();
        int functionDiscountedPrice = function.applyDiscount(basePrice);
        this.finalPrice = functionDiscountedPrice - user.calculateDiscount();
        
        // Ensure price is never negative
        if (this.finalPrice < 0) {
            this.finalPrice = 0;
        }
    }
    
    /**
     * Gets the final price of the ticket.
     * @return the final price.
     */
    public int getFinalPrice() {
        return finalPrice;
    }
}
