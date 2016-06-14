package com.fundacionjala.movies;

public abstract class Rental {

    private final Movie movie;

    private final int daysRented;
    public static final int DEFAULT_FREQUENT_POINT = 1;


    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public abstract double calculateCharge();

    public int calculateFrequentRenterPoints() {
        return DEFAULT_FREQUENT_POINT;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
}