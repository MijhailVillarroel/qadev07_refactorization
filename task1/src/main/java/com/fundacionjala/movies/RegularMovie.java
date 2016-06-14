package com.fundacionjala.movies;

/**
 * Created by Mijhail on 11/06/2016.
 */
public class RegularMovie extends Movie {

    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double calculateChargeMovie(int daysRented) {
        int charge = 2;
        int days = 2;
        double benefit = 1.5;
        if (daysRented > days)
            charge += (daysRented - days) * benefit;
        return charge;
    }

}
