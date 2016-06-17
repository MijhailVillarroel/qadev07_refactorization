package com.fundacionjala.movies;

/**
 * Created by Mijhail on 11/06/2016.
 */
public class RegularMovie extends Movie {

    private static final int PRICE = 2;

    private static final int DAYS_ALLOWED = 2;

    private static final double BENEFIT = 1.5;

    public RegularMovie(String title) {
        super(title, DAYS_ALLOWED, BENEFIT, PRICE);
    }
}
