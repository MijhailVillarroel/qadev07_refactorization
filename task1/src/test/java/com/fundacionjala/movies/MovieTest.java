package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

public class MovieTest {

    @Test
    public void aMovieCanBeCreatedWith2ParametersTitleAndPriceCode() {

        Movie movie = new RegularMovie("Rocky");
        Assert.assertTrue(movie instanceof Movie);
    }

    @Test
    public void movieCanBeCreatedWithParameters() {
        Movie newMovie = new NewReleaseMovie("Rocky");
        Assert.assertNotNull(newMovie);
    }

}
