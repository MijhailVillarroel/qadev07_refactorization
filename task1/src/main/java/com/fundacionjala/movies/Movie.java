package com.fundacionjala.movies;

public abstract class Movie {

    private final String title;

    public static final int DEFAULT_FREQUENT_POINT = 1;


    public Movie(String title) {
        this.title = title;

    }

    public abstract double calculateChargeMovie(int daysRented);

    public int calculateFrequentPointsMovie(int daysRented) {
        return DEFAULT_FREQUENT_POINT;
    }

    public String getTitle() {
        return title;
    }

}
