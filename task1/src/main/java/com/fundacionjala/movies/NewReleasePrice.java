package com.fundacionjala.movies;

/**
 * Created by Mijhail on 11/06/2016.
 */
public class NewReleasePrice extends Price {

    public NewReleasePrice(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double calculateCharge() {
        int benefit = 3;
        return getDaysRented() * benefit;
    }

    public int calculateFrequentRenterPoints() {
        int point = 1;
        int rentedDays = 1;
        if(getDaysRented() > rentedDays)
            return point++;
        return point;
    }
}
