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
    public void customerCanBeAddMovieinList() {
//        Customer customer = new Customer("Juan");
//        rent.addRental(new Rental(new Movie("Roky",5), 30));
//        rent.addRental(new Rental(new Movie("Roky II",5), 30));
//        assertEquals(2,rent.getRentals().size());
    }
}
