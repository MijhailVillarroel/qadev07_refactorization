package com.fundacionjala.movies;

public abstract class Movie {

    private final String title;

    protected final int day;

    protected final double benefit;

    protected final int price;

    protected static final int DEFAULT_FREQUENT_POINT = 1;

    public Movie(String title, int day, double benefit, int price) {
        this.title = title;
        this.day = day;
        this.benefit = benefit;
        this.price = price;
    }

    public double calculateChargeMovie(int daysRented) {
        return daysRented > day ? price + (daysRented - day) * benefit : price;
    }

    public int calculateFrequentPointsMovie(int daysRented) {
        return DEFAULT_FREQUENT_POINT;
    }

    public String getTitle() {
        return title;
    }

}
