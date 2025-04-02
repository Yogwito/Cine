/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author juans
 * 
 * Abstract class representing a User.
 * 
 */
/**
 * Class representing an Adult user.
 */
class Adult extends User {
    public Adult() {
        this.type = "Adult";
        this.discount = 0;
    }
    
    @Override
    public int calculateDiscount() {
        return this.discount;
    }
}