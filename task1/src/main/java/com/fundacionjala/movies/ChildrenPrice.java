package com.fundacionjala.movies;

/**
 * Created by Mijhail on 10/06/2016.
 */
public class ChildrenPrice extends Movie {

    public ChildrenPrice(String title) {
        super(title);
    }

    @Override
    public double calculateChargeMovie(int daysRented) {
        double benefit = 1.5;
        int days = 3;
        double result = benefit;
        if (daysRented > days)
            result += (daysRented - days) * benefit;
        return result;
    }

}
