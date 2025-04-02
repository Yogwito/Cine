/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author juans
 */
public class Senior extends User {
    public Senior() {
        this.type = "Senior";
        this.discount = 1000;
    }
    
    @Override
    public int calculateDiscount() {
        return this.discount;
    }
}