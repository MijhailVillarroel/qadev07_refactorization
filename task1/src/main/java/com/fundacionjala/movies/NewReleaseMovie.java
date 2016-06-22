package com.fundacionjala.movies;

/**
 * Created by Mijhail on 11/06/2016.
 */
public class NewReleaseMovie extends Movie {

    private static final int RENTAL_PRICE = 0;

    private static final int DAYS_RETARD = 2;

    private static final double PRICE_RETARD = 1.5;

    public NewReleaseMovie(String title) {
        super(title, DAYS_RETARD, PRICE_RETARD, RENTAL_PRICE);
    }

    @Override
    public double calculateChargeMovie(int daysRented) {
        return daysRented * benefit;
    }

    @Override
    public int calculateFrequentPointsMovie(int daysRented) {
        return daysRented > DAYS_RETARD ? DEFAULT_FREQUENT_POINT + 1 : DEFAULT_FREQUENT_POINT;
    }
}
