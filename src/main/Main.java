/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

import services.Cinema;
import models.Invoice;
import models.Movie;
import functions.Function;
import functions.FirstFunction;  // Cambio de nombre
import functions.AfternoonFunction;
import models.User;
import models.Child;
import models.Adult;
import models.Senior;
import exceptions.TicketInvalidException;

/**
 * Main class to run the cinema simulation.
 */
// CLASE MODIFICADA: Main - Actualizado para manejar excepciones y usar nuevas clases

/**
 * Main class to run the cinema simulation.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Cinema cinema = new Cinema();
            Invoice invoice = cinema.generateInvoice();
           
            Movie movie1 = new Movie(10000);
            Movie movie2 = new Movie(15000);
           
            Function function1 = new FirstFunction();  // Cambio de MorningFunction a FirstFunction
            Function function2 = new AfternoonFunction();
           
            User user1 = new Child();
            User user2 = new Adult();
            User user3 = new Senior();
           
            cinema.sellTicket(movie1, function1, user1, invoice);
            cinema.sellTicket(movie2, function2, user2, invoice);
            cinema.sellTicket(movie2, function2, user3, invoice);  // Añadido un Senior
           
            System.out.println("Total Invoice: " + invoice.calculateTotal());
        } catch (TicketInvalidException e) {
            System.err.println("Error processing tickets: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}