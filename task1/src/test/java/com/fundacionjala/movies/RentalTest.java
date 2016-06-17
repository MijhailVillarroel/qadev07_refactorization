package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {

    @Test
    public void TestRentalCanBeCreatedWith2ParametersMovieAndRentalDay() {

        Movie movie = new RegularMovie("Rocky");
        Rental rental = new Rental(movie, 1);
        Assert.assertTrue(rental instanceof Rental);
    }

    @Test
    public void testRentalCanBeCreatedWithParameters() {
        Movie newMovie = new RegularMovie("Rocky");
        Rental rental = new Rental(newMovie, 1);
        Assert.assertNotNull(rental);
    }

    @Test
    public void testRentalCreateWithMovieandRentalDayShouldReturnThem() {
        Movie movie = new RegularMovie("Rocky");
        Rental rental = new Rental(movie, 2);
        int daysRental = 2;
        assertEquals(daysRental, rental.getDaysRented());

    }

    @Test
    public void testRentalReturnWithTitleandPriceParamsShouldReturnThem() {
        Movie movie = new RegularMovie("Rocky");
        Rental rental = new Rental(movie, 1);
        int daysRental = 1;
        assertEquals(daysRental, rental.getDaysRented());
        assertEquals(movie, rental.getMovie());
    }

    @Test
    public void testCalculateChargeRegularMovie() {
        Movie movie = new RegularMovie("Rocky");
        Rental rental = new Rental(movie, 1);
        double expectedResult = 2;
        assertEquals(expectedResult, rental.calculateCharge(), 0);
        assertEquals(movie, rental.getMovie());
    }

    @Test
    public void testCalculateChargeRegularPriceWhitRentalMoreThat4Day() {
        Movie movie = new RegularMovie("Rocky");
        Rental rental = new Rental(movie, 9);
        double expectedResult = 12;
        assertEquals(expectedResult, rental.calculateCharge(), 0);
        assertEquals(movie, rental.getMovie());
    }

    @Test
    public void testCalculateChargeNewReleasePrice() {
        Movie movie = new NewReleaseMovie("Rocky");
        Rental rental = new Rental(movie, 1);
        double expectedResult = 3;
        assertEquals(expectedResult, rental.calculateCharge(), 0);
    }

    @Test
    public void testCalculateChargeNewReleasePriceWhitRentalMoreThat4Day() {
        Movie movie = new NewReleaseMovie("Rocky");
        Rental rental = new Rental(movie, 5);
        double expectedResult = 15;
        assertEquals(expectedResult, rental.calculateCharge(), 0);
    }

    @Test
    public void testCalculateChildrenPrice() {
        Movie movie = new ChildrenMovie("Lion King");
        Rental rental = new Rental(movie, 1);
        double expectedResult = 1.5;
        assertEquals(expectedResult, rental.calculateCharge(), 0);
    }

    @Test
    public void testCalculateChildrenPriceWhitRentalMoreThat3Days() {
        Movie movie = new ChildrenMovie("Lion King");
        Rental rental = new Rental(movie, 5);
        double expectedResult = 4.5;
        assertEquals(expectedResult, rental.calculateCharge(), 0);
    }

    @Test
    public void testCalculateRenterPointsForRegular() {
        Movie movie = new RegularMovie("Rocky");
        Rental rental = new Rental(movie, 1);
        int expectedResult = 1;
        assertEquals(expectedResult, rental.calculateFrequentRenterPoints(), 0);
    }


    @Test
    public void testCalculateRenterPointsForNewRelease() {
        Movie movie = new NewReleaseMovie("X-Men");
        Rental rental = new Rental(movie, 3);
        int expectedResult = 2;
        assertEquals(expectedResult, rental.calculateFrequentRenterPoints(), 0);
    }

    @Test
    public void testCalculateRenterPointsForChildren() {
        Movie movie = new ChildrenMovie("Lion King");
        Rental rental = new Rental(movie, 3);
        int expectedResult = 1;
        assertEquals(expectedResult, rental.calculateFrequentRenterPoints(), 0);
    }


}
