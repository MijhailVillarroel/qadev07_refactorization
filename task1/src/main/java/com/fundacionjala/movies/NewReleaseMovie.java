package com.fundacionjala.movies;

/**
 * Created by Mijhail on 11/06/2016.
 */
public class NewReleaseMovie extends Movie {

    public static final int DAY = 0;

    public static final int PRICE = 0;

    private static final int DAYS_ALLOWED = 2;

    private static final double BENEFIT = 1.5;

    public NewReleaseMovie(String title) {
        super(title, DAYS_ALLOWED, BENEFIT, PRICE);
    }

    @Override
    public double calculateChargeMovie(int daysRented) {
        return daysRented * benefit;
    }

    @Override
    public int calculateFrequentPointsMovie(int daysRented) {
        int point = DEFAULT_FREQUENT_POINT;
        int upRentedDay = 1;
        if (daysRented > upRentedDay) {
            point++;
        }
        return point;
    }
}
