package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

public class RentalTest {

    @Test
    public void aRentalCanBeCreatedWith2ParametersMovieAndRentalDay() {

        Movie movie = new Movie("Rocky");
        Rental rental = new RegularPrice(movie, 1);
        Assert.assertTrue(rental instanceof Rental);
    }

    @Test
    public void rentalCanBeCreatedWithParameters() {
        Movie newMovie = new Movie("Rocky");
        Rental rental = new RegularPrice(newMovie, 1);
        Assert.assertNotNull(rental);
    }

    @Test
    public void rentalCreateWithMovieandRentalDayShouldReturnThem() {
        Movie movie = new Movie("Rocky");
        Rental rental = new RegularPrice(movie, 2);
        int daysRental = 2;
        Assert.assertEquals(daysRental, rental.getDaysRented());

    }

    @Test
    public void rentalReturnWithTitleandPriceParamsShouldReturnThem() {
        Movie movie = new Movie("Rocky");
        Rental rental = new RegularPrice(movie, 1);
        int daysRental = 1;
        Assert.assertEquals(daysRental, rental.getDaysRented());
        Assert.assertEquals(movie, rental.getMovie());
    }

    @Test
    public void calculateChargeRegularPrice() {
        Movie movie = new Movie("Rocky");
        Rental rental = new RegularPrice(movie, 1);
        double resultExpect = 2;
        Assert.assertEquals(resultExpect, rental.calculateCharge(), 0);
        Assert.assertEquals(movie, rental.getMovie());
    }

    @Test
    public void calculateChargeRegularPriceWhitRentalMoreThat4Day() {
        Movie movie = new Movie("Rocky");
        Rental rental = new RegularPrice(movie, 9);
        double resultExpect = 12;
        Assert.assertEquals(resultExpect, rental.calculateCharge(), 0);
        Assert.assertEquals(movie, rental.getMovie());
    }

    @Test
    public void calculateChargeNewReleasePrice() {
        Movie movie = new Movie("Rocky");
        Rental rental = new NewReleasePrice(movie, 1);
        double resultExpect = 3;
        Assert.assertEquals(resultExpect, rental.calculateCharge(), 0);
    }

    @Test
    public void calculateChargeNewReleasePriceWhitRentalMoreThat4Day() {
        Movie movie = new Movie("Rocky");
        Rental rental = new NewReleasePrice(movie, 5);
        double resultExpect = 15;
        Assert.assertEquals(resultExpect, rental.calculateCharge(), 0);
    }

    @Test
    public void calculateChildrenPrice() {
        Movie movie = new Movie("Lion King");
        Rental rental = new ChildrenPrice(movie, 1);
        double resultExpect = 1.5;
        Assert.assertEquals(resultExpect, rental.calculateCharge(), 0);
    }

    @Test
    public void calculateChildrenPriceWhitRentalMoreThat3Days() {
        Movie movie = new Movie("Lion King");
        Rental rental = new ChildrenPrice(movie, 5);
        double resultExpect = 4.5;
        Assert.assertEquals(resultExpect, rental.calculateCharge(), 0);
    }

    @Test
    public void testCalculateRenterPointsForRegular() {
        Movie movie = new Movie("Rocky");
        Rental rental = new RegularPrice(movie, 1);
        int resultExpect = 1;
        Assert.assertEquals(resultExpect, rental.calculateFrequentRenterPoints(), 0);
    }


    @Test
    public void testCalculateRenterPointsForNewRelease() {
        Movie movie = new Movie("X-Men");
        Rental rental = new NewReleasePrice(movie, 3);
        int resultExpect = 2;
        Assert.assertEquals(resultExpect, rental.calculateFrequentRenterPoints(), 0);
    }

    @Test
    public void testCalculateRenterPointsForChildren() {
        Movie movie = new Movie("Lion King");
        Rental rental = new ChildrenPrice(movie, 3);
        int resultExpect = 1;
        Assert.assertEquals(resultExpect, rental.calculateFrequentRenterPoints(), 0);
    }


}
