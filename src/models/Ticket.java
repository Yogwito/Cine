/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import functions.Function;

/**
 *
 * @author juans
 *
 * Class representing a Ticket.
 */
public class Ticket {
    public Movie movie;
    public Function function;
    public int finalPrice;
    
    public Ticket(Movie movie, Function function, User user) {
        this.movie = movie;
        this.function = function;
        int basePrice = movie.calculatePrice();
        int discountedPrice = function.applyDiscount(basePrice);
        this.finalPrice = discountedPrice - user.calculateDiscount();
    }
    
    /**
     * Gets the final price of the ticket.
     * @return the final price.
     */
    public int getFinalPrice() {
        return finalPrice;
    }
}