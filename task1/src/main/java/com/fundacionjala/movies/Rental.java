package com.fundacionjala.movies;

public abstract class  Rental {

    private final Movie movie;

    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public abstract double calculateCharge();

    public abstract int calculateFrequentRenterPoints();

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
}