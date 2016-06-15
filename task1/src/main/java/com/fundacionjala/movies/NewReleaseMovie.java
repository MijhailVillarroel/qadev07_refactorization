package com.fundacionjala.movies;

/**
 * Created by Mijhail on 11/06/2016.
 */
public class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double calculateChargeMovie(int daysRented) {
        int benefit = 3;
        return daysRented * benefit;
    }


    @Override
    public int calculateFrequentPointsMovie(int daysRented) {
        int point = 1;
        int rentedDays = 1;
        if(daysRented > rentedDays) {
            point++;
        }
        return point;
    }
}
