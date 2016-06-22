package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mijhail on 14/06/2016.
 */
public class RegularMovieTest {

    private Movie movie;

    @Before
    public void setUp() {
        movie = new NewReleaseMovie("Rocky I");
    }

    @Test
    public void testCalculateRegularMovieFor1DayRental() {
        final double expectedResult = 2;
        assertEquals(expectedResult, movie.calculateChargeMovie(1), 0);
    }

    @Test
    public void testCalculateRegularMovieFor9DayRental() {
        final double expectedResult = 12;
        assertEquals(expectedResult, movie.calculateChargeMovie(9), 0);
    }
}
