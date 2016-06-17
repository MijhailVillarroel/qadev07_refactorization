package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MovieTest {

    @Test
    public void testMovieCanBeCreatedWithParameters() {
        Movie newMovie = new NewReleaseMovie("Rocky");
        assertNotNull(newMovie);
    }

}
