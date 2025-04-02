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
 * Class representing a Morning Function with a 50% discount.
 */
class MorningFunction extends Function {
    @Override
    public int applyDiscount(int price) {
        return price / 2;
    }
}
