/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author juans
 */

public class Child extends User {
    public Child() {
        this.type = "Child";
        this.discount = 500;
    }
    
    @Override
    public int calculateDiscount() {
        return this.discount;
    }
}