/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

/**
 *
 * @author User
 *
 *
 * Class representing an Afternoon Function with a 10% discount.
 */

public class AfternoonFunction extends Function {
    private final int discount = 10; // 10%
    
    @Override
    public int applyDiscount(int price) {
        return price * (100 - discount) / 100;
    }
}