/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

/**
 * Class representing a Night Function with no discount.
 */
public class NightFunction extends Function {
    private final int discount = 0; // 0%
    
    @Override
    public int applyDiscount(int price) {
        return price;
    }
}