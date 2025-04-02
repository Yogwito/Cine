/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

/**
 * Class representing a Night Function with no discount.
 */
class NightFunction extends Function {
    @Override
    public int applyDiscount(int price) {
        return price;
    }
}