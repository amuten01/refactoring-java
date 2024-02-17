package com.etraveli.refactoring;

/* This class encapsulates the information related to a movie, providing 
a structured representation that can be used within the movie rental system 
to identify and categorize movies available for rental. */
public class Movie {
    private String title;
    private String code;

    public Movie(String title, String code) {
        this.title = title;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }
}

public class Movie {
    private String title;
    private String code;

    public Movie(String title, String code) {
        this.title = title;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }
}
