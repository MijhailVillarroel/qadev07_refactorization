package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

public class MovieTest {

    @Test
    public void aMovieCanBeCreatedWith2ParametersTitleAndPriceCode() {

        Movie movie = new Movie("Rocky");
        Assert.assertTrue(movie instanceof Movie);
    }

    @Test
    public void movieCanBeCreatedWithParameters() {
        Movie newMovie = new Movie("Rocky");
        Assert.assertNotNull(newMovie);
    }

    @Test
    public void movieCreateWithTitleandPriceParamsShouldReturnThem() {
        Movie movie = new Movie("Rocky");
        Assert.assertEquals("Rocky", movie.getTitle());
    }

}
