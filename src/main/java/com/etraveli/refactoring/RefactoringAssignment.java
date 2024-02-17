package com.etraveli.refactoring;

import java.util.Arrays;
import java.util.List;

public class RefactoringAssignment {

    public RefactoringAssignment() {

        String expected = "Rental Record for C. U. Stomer\n\tYou've Got Mail\t3.5\n\tMatrix\t2.0\nAmount owed is 5.5\nYou earned 2 frequent points\n";

        List<MovieRental> rentals = Arrays.asList(new MovieRental("F001", 3), new MovieRental("F002", 1));
        Customer customer = new Customer("C. U. Stomer", rentals);

        RentalCalculator calculator = new RentalCalculator();
        String result = calculator.generateStatement(customer);

        if (!result.equals(expected)) {
            throw new AssertionError("Expected: \n" + expected + "\nGot: \n" + result);
        }

        System.out.println("Success");

    }
}


