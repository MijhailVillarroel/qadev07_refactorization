package com.fundacionjala.movies;

public abstract class Movie {

    private final String title;

    protected final int day;

    protected final double benefit;

    protected int charge;

    protected static final int DEFAULT_FREQUENT_POINT = 1;

    public Movie(String title, int day, double benefit, int charge) {
        this.title = title;
        this.day = day;
        this.benefit = benefit;
        this.charge = charge;
    }

    public double calculateChargeMovie(int daysRented) {
        if (daysRented > day) {
            charge += (daysRented - day) * benefit;
        }
        return charge;
    }

    public int calculateFrequentPointsMovie(int daysRented) {
        return DEFAULT_FREQUENT_POINT;
    }

    public String getTitle() {
        return title;
    }

}
