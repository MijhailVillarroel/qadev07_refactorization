package com.fundacionjala.movies;

/**
 * Created by Mijhail on 11/06/2016.
 */
public class RegularPrice extends Price {

    public RegularPrice(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double calculateCharge() {
        int charge = 2;
        int days = 2;
        double benefit = 1.5;
        if (getDaysRented() > days)
            charge += (getDaysRented() - days) * benefit;
        return charge;
    }
}
