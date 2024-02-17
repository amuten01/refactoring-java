package com.etraveli.refactoring;

import java.util.Arrays;
import java.util.List;

/* The purpose of this class is to execute a test or validation of the RentalCalculator class 
by comparing its output with an expected result. 
However, typically, tests would be written in separate test classes using frameworks like JUnit. */
public class RefactoringAssignment {

    public RefactoringAssignment() {

        String expected = "Rental Record for C. U. Stomer\n\tYou've Got Mail\t3.5\n\tMatrix\t2.0\nAmount owed is 5.5\nYou earned 2 frequent points\n";

        List<MovieRental> rentals = Arrays.asList(new MovieRental("F001", 3), new MovieRental("F002", 1));
        Customer customer = new Customer("C. U. Stomer", rentals);

        RentalCalculator calculator = new RentalCalculator();
        String result = calculator.generateStatement(customer);

        if (!result.equals(expected)) {
            throw new AssertionError("Expected: \n" + expected + "\nGot: \n" + result);
        } else {
	    System.out.println(result);
	    System.out.println("Test result: Success");
	}
    }
}


