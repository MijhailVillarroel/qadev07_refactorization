package com.fundacionjala.movies;

/**
 * Created by Mijhail on 10/06/2016.
 */
public class ChildrenPrice extends Price {

    public ChildrenPrice(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double calculateCharge() {
        double benefit = 1.5;
        int days = 3;
        double result = benefit;
        if (getDaysRented() > days)
            result += (getDaysRented() - 3) * benefit;
        return result;
    }

}
