package com.fundacionjala.movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new NewReleasePrice(new Movie("The Revenant", 1), 2));
        customer.addRental(new RegularPrice(new Movie("Terminator", 0), 2));
        System.out.println(customer.statement());
    }
}
