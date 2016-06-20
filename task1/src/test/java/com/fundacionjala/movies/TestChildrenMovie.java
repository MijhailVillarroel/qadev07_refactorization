package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mijhail on 14/06/2016.
 */
public class TestChildrenMovie {

    private Movie movie;

    @Before
    private void setUp() {
        movie = new ChildrenMovie("X-Men");
    }

    @Test
    public void testCalculateChargeMovieFor1DayRental() {
        final double expectedResult = 1.5;
        assertEquals(expectedResult, movie.calculateChargeMovie(1), 0);
    }

    @Test
    public void testCalculateChargeMovieFor7DayRental() {
        final double expectedResult = 7.5;
        assertEquals(expectedResult, movie.calculateChargeMovie(7), 0);
    }
}
