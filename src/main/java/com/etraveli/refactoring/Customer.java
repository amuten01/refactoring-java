package com.etraveli.refactoring;

import java.util.List;

/* The purpose of this class is to encapsulate the information related to a customer, 
including their name and the movies they have rented. */
public class Customer {
    private String name;
    private List<MovieRental> rentals;

    public Customer(String name, List<MovieRental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String getName() {
        return name;
    }

    public List<MovieRental> getRentals() {
        return rentals;
    }
}
