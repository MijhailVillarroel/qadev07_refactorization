package com.fundacionjala.movies;

/**
 * Created by Mijhail on 10/06/2016.
 */
public class ChildrenMovie extends Movie {

    private static final int RENTAL_PRICE = 2;

    private static final int DAYS_RETARD = 2;

    private static final double BENEFIT = 1.5;

    public ChildrenMovie(String title) {
        super(title, DAYS_RETARD, BENEFIT, RENTAL_PRICE);
    }
}
