package com.fundacionjala.movies;

/**
 * Created by Mijhail on 10/06/2016.
 */
public abstract class Price extends Rental {

    public Price(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    public abstract double calculateCharge();

    public int calculateFrequentRenterPoints() {
        return 1;
    }
}