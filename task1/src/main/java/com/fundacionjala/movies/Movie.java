package com.fundacionjala.movies;

public abstract class Movie {

    private final String title;

    protected final int day;

    protected final double benefit;

    protected final int price;

    protected static final int DEFAULT_FREQUENT_POINT = 1;

    public Movie(String title, int day, double benefit, int preci) {
        this.title = title;
        this.day = day;
        this.benefit = benefit;
        this.price = preci;
    }

    public double calculateChargeMovie(int daysRented) {
        int resultCharge = price;
        if (daysRented > day) {
            resultCharge += (daysRented - day) * benefit;
        }
        return resultCharge;
    }

    public int calculateFrequentPointsMovie(int daysRented) {
        return DEFAULT_FREQUENT_POINT;
    }

    public String getTitle() {
        return title;
    }

}
