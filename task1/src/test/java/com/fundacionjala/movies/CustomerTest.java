package com.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void aCustomerCanBeCreatedWith1ParametersCustomerName() {

        Customer customer = new Customer("Juan");
        assertTrue(customer instanceof Customer);
    }

    @Test
    public void customerCanBeCreatedWithParameters() {
        Customer customer = new Customer("Juan");
        assertNotNull(customer);
    }

    @Test
    public void movieCreateWithNameParamsShouldReturnThem() {
        Customer customer = new Customer("Juan");
        assertEquals("Juan", customer.getName());
    }

    @Test
    public void BorrowingCanBeCreatedWithParameters() {
        Customer customer = new Customer("Juan");
        assertNotNull(customer);
    }

    @Test
    public void customerCanBeAddMovieInList() {
        Customer customer = new Customer("Juan");
        customer.addRental(new Rental(new RegularMovie("Rocky"), 30));
        customer.addRental(new Rental(new RegularMovie("Rocky II"), 30));
        customer.addRental(new Rental(new NewReleaseMovie("Rocky III"), 30));
        int resultExpect = 3;
        assertEquals(resultExpect, customer.getSizeListe());
    }

    @Test
    public void calculateTotalCharge() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewReleaseMovie("The Revenant"), 2));
        customer.addRental(new Rental(new RegularMovie("Terminator"), 2));
        customer.addRental(new Rental(new ChildrenMovie("Terminator II"), 2));
        double resultExpect = 9.5;
        assertEquals(resultExpect, customer.calculateTotalCharge(), 0);
    }

    @Test
    public void calculateTotalFrequentRenterPointsForCustomer() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewReleaseMovie("The Revenant"), 2));
        customer.addRental(new Rental(new RegularMovie("Terminator"), 2));
        customer.addRental(new Rental(new ChildrenMovie("Terminator II"), 2));
        double resultExpect = 4;
        assertEquals(resultExpect, customer.calculateTotalFrequentRenterPoints(), 0);
    }
}
