/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author juans
 *
 *
 * Custom exception for when a ticket is invalid.
 */
public class TicketInvalidException extends RuntimeException {
    public TicketInvalidException(String message) {
        super(message);
    }
}
