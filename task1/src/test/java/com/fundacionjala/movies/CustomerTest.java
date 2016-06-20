package com.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testCustomerCanBeAddMovieInList() {
        Customer customer = new Customer("Juan");
        customer.addRental(new Rental(new RegularMovie("Rocky"), 30));
        customer.addRental(new Rental(new RegularMovie("Rocky II"), 30));
        customer.addRental(new Rental(new NewReleaseMovie("Rocky III"), 30));
        final int expectedResult = 3;
        assertEquals(expectedResult, customer.getRentalList().size());
    }

    @Test
    public void testCalculateTotalCharge() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewReleaseMovie("The Revenant"), 2));
        customer.addRental(new Rental(new RegularMovie("Terminator"), 2));
        customer.addRental(new Rental(new ChildrenMovie("Terminator II"), 2));
        final double expectedResult = 9.5;
        assertEquals(expectedResult, customer.calculateTotalCharge(), 0);
    }

    @Test
    public void TestCalculateTotalFrequentRenterPointsForCustomer() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewReleaseMovie("The Revenant"), 2));
        customer.addRental(new Rental(new RegularMovie("Terminator"), 2));
        customer.addRental(new Rental(new ChildrenMovie("Terminator II"), 2));
        final double expectedResult = 4;
        assertEquals(expectedResult, customer.calculateTotalFrequentRenterPoints(), 0);
    }
}
