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
 * Class representing a Movie.
 */
public class Movie {
    private int baseCost;
    
    public Movie(int baseCost) {
        this.baseCost = baseCost;
    }
    
    /**
     * Calculates the price of the movie.
     * @return the base cost of the movie.
     */
    public int calculatePrice() {
        return this.baseCost;
    }
}