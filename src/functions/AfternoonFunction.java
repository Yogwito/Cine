/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

/**
 *
 * @author User
 */
/**
 * Class representing an Afternoon Function with a 10% discount.
 */
public class AfternoonFunction extends Function {
    @Override
    public int applyDiscount(int price) {
        return (int) (price * 0.9);
    }
}