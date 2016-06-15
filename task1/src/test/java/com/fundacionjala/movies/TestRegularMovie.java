package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mijhail on 14/06/2016.
 */
public class TestRegularMovie {

    @Test
    public void calculateRegularMovieFor1DayRental() {
        Movie movie = new RegularMovie("X-Men");
        double resultExpect = 2;
        Assert.assertEquals(resultExpect, movie.calculateChargeMovie(1), 0);
    }

    @Test
    public void calculateRegularMovieFor9DayRental() {
        Movie movie = new RegularMovie("X-Men");
        double resultExpect = 12;
        Assert.assertEquals(resultExpect, movie.calculateChargeMovie(9), 0);
    }
}
