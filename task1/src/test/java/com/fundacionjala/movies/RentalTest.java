package com.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    @Test
    public void aRentalCanBeCreatedWith2ParametersMovieAndRentalDay() {

        Movie movie = new Movie("Rocky", 65);
        Rental rental = new RegularPrice(movie, 0);
        assertTrue(rental instanceof Rental);
    }

    @Test
    public void rentalCanBeCreatedWithParameters() {
        Movie newMovie = new Movie("Rocky", 65);
        Rental rental = new RegularPrice(newMovie, 0);
        assertNotNull(rental);
    }

    @Test
    public void rentalCreateWithMovieandRentalDayShouldReturnThem() {
        Movie movie = new Movie("Rocky", 30);
        Rental rental = new RegularPrice(movie, 0);
        assertEquals(5, rental.getDaysRented());
        assertTrue(rental.getMovie() instanceof Movie);
    }

    @Test
    public void rentalReturnWithTitleandPriceParamsShouldReturnThem() {
        Movie movie = new Movie("Rocky", 30);
        Rental rental = new RegularPrice(movie, 0);
        assertEquals(5, rental.getDaysRented());
        assertEquals(movie, rental.getMovie());
    }

}
