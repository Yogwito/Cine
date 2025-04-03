/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import services.Cinema;
import models.Invoice;
import models.Movie;
import functions.Function;
import functions.AfternoonFunction;
import functions.MorningFunction;
import models.User;
import models.Child;
import models.Adult;

/**
 * Main class to run the cinema simulation.
 */
public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Invoice invoice = cinema.generateInvoice();
       
        Movie movie1 = new Movie(10000);
        Movie movie2 = new Movie(15000);
       
        Function function1 = new MorningFunction();
        Function function2 = new AfternoonFunction();
       
        User user1 = new Child();
        User user2 = new Adult();
       
        cinema.sellTicket(movie1, function1, user1, invoice);
        cinema.sellTicket(movie2, function2, user2, invoice);
       
        System.out.println("Total Invoice: " + invoice.calculateTotal());
    }
}