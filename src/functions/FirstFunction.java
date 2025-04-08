/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

/**
 *
 * @author User
 *
 * Class representing a Morning Function with a 50% discount.
 *
 * Class representing a Morning Function with a 50% discount.
 */
public class FirstFunction extends Function {
    private final int discount = 50; // 50%
    
    @Override
    public int applyDiscount(int price) {
        return price * (100 - discount) / 100;
    }
}