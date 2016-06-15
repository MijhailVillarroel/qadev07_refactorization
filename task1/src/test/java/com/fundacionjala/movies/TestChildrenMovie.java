package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mijhail on 14/06/2016.
 */
public class TestChildrenMovie {

    @Test
    public void calculateChargeMovieFor1DayRental() {
        Movie movie = new ChildrenMovie("X-Men");
        double resultExpect = 1.5;
        Assert.assertEquals(resultExpect, movie.calculateChargeMovie(1), 0);
    }

    @Test
    public void calculateChargeMovieFor7DayRental() {
        Movie movie = new ChildrenMovie("X-Men");
        double resultExpect = 7.5;
        Assert.assertEquals(resultExpect, movie.calculateChargeMovie(7), 0);
    }
}
