package com.etraveli.refactoring;

/* The purpose of this class is to encapsulate the information related to a movie rental, 
providing a structured representation that can be used within the rental system to track 
and manage movie rentals. */
public class MovieRental {
    private String movieId;
    private int days;

    public MovieRental(String movieId, int days) {
        this.movieId = movieId;
        this.days = days;
    }

    public String getMovieId() {
        return movieId;
    }

    public int getDays() {
        return days;
    }
}
