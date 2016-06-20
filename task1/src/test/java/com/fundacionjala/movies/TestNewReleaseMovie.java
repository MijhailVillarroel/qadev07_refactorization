package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mijhail on 14/06/2016.
 */
public class TestNewReleaseMovie {

    private Movie movie;

    @Before
    public void setUp() {
        movie = new NewReleaseMovie("X-Men");
    }

    @Test
    public void testCalculateNewReleaseMovieFor1DayRental() {
        final double expectedResult = 3;
        assertEquals(expectedResult, movie.calculateChargeMovie(1), 0);
    }

    @Test
    public void testCalculateNewReleaseMovieFor12DayRental() {
        final double expectedResult = 36;
        assertEquals(expectedResult, movie.calculateChargeMovie(12), 0);
    }

    @Test
    public void testCalculateRenterPointsForNewReleaseRental1Day() {
        final int expectedResult = 1;
        assertEquals(expectedResult, movie.calculateFrequentPointsMovie(1), 0);
    }

    @Test
    public void testCalculateRenterPointsForNewReleaseRental5Days() {
        final int expectedResult = 2;
        assertEquals(expectedResult, movie.calculateFrequentPointsMovie(9), 0);
    }
}
