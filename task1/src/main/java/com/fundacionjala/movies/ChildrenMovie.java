package com.fundacionjala.movies;

/**
 * Created by Mijhail on 10/06/2016.
 */
public class ChildrenMovie extends Movie {

    private static final int PRICE = 2;

    private static final int DAYS_ALLOWED = 2;

    private static final double BENEFIT = 1.5;

    public ChildrenMovie(String title) {
        super(title, DAYS_ALLOWED, BENEFIT, PRICE);
    }

}
