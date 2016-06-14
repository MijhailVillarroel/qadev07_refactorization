package com.fundacionjala.movies;

/**
 * Created by Mijhail on 11/06/2016.
 */
public class NewReleasePrice extends Rental {

    public NewReleasePrice(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double calculateCharge() {
        int benefit = 3;
        return getDaysRented() * benefit;
    }

    @Override
    public int calculateFrequentRenterPoints() {
        int point = 1;
        int rentedDays = 1;
        if (getDaysRented() > rentedDays)
            point++;
        return point;
    }

}
