package com.etraveli.refactoring;

import java.util.HashMap;
import java.util.Map;

/* The purpose of this class is to encapsulate the logic for generating rental 
statements, including the calculation of rental amounts and frequent enter points, 
based on movie rental data provided by the Customer object. */
public class RentalCalculator {

    private static final Map<String, Movie> movies;

    static {
        movies = new HashMap<>();
        movies.put("F001", new Movie("You've Got Mail", "regular"));
        movies.put("F002", new Movie("Matrix", "regular"));
        movies.put("F003", new Movie("Cars", "childrens"));
        movies.put("F004", new Movie("Fast & Furious X", "new"));
    }

    /* Generates a rental statement by iterating through the customer's rentals,
    calculating the rental amount and frequent points for each rental, and formatting
    the information into a cohesive rental record. */
    public String generateStatement(Customer customer) {
        double totalAmount = 0;
        int frequentEnterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for ").append(customer.getName()).append("\n");
        for (MovieRental rental : customer.getRentals()) {
            double thisAmount = calculateRentalAmount(rental);
            frequentEnterPoints += calculateFrequentEnterPoints(rental);
            result.append("\t").append(movies.get(rental.getMovieId()).getTitle()).append("\t").append(thisAmount).append("\n");
            totalAmount += thisAmount;
        }
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentEnterPoints).append(" frequent points\n");
        return result.toString();
    }

    /*  This method implements the business logic for determining the
     rental amount based on the movie category and rental duration.*/
    private double calculateRentalAmount(MovieRental rental) {
        Movie movie = movies.get(rental.getMovieId());
        double amount = 0;
        switch (movie.getCode()) {
            case "regular":
                amount = 2;
                if (rental.getDays() > 2) {
                    amount += (rental.getDays() - 2) * 1.5;
                }
                break;
            case "new":
                amount = rental.getDays() * 3;
                break;
            case "childrens":
                amount = 1.5;
                if (rental.getDays() > 3) {
                    amount += (rental.getDays() - 3) * 1.5;
                }
                break;
        }
        return amount;
    }

    /* This method determines the number of frequent points earned for a
    movie rental, with special consideration for new release movies rented for
    more than 2 days. */
    private int calculateFrequentEnterPoints(MovieRental rental) {
        int points = 1;
        if (movies.get(rental.getMovieId()).getCode().equals("new") && rental.getDays() > 2) {
            points++;
        }
        return points;
    }
}
