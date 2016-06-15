package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mijhail on 14/06/2016.
 */
public class TestNewReleaseMovie {
    @Test
    public void calculateNewReleaseMovieFor1DayRental() {
        Movie movie = new NewReleaseMovie("X-Men");
        double resultExpect = 3;
        Assert.assertEquals(resultExpect, movie.calculateChargeMovie(1), 0);
    }

    @Test
    public void calculateNewReleaseMovieFor12DayRental() {
        Movie movie = new NewReleaseMovie("X-Men");
        double resultExpect = 36;
        Assert.assertEquals(resultExpect, movie.calculateChargeMovie(12), 0);
    }

    @Test
    public void testCalculateRenterPointsForNewReleaseRental1Day() {
        Movie movie = new NewReleaseMovie("X-Men");
        int resultExpect = 1;
        Assert.assertEquals(resultExpect, movie.calculateFrequentPointsMovie(1), 0);
    }

    @Test
    public void testCalculateRenterPointsForNewReleaseRental5Days() {
        Movie movie = new NewReleaseMovie("X-Men");
        int resultExpect = 2;
        Assert.assertEquals(resultExpect, movie.calculateFrequentPointsMovie(9), 0);
    }
}
