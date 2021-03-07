package com.company;

public class Book {
    String title;
    String author;
    int numberOfPages;
    int serialNumber;

    Book(String title, String author, int numberOfPages, int serialNumber) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.serialNumber = serialNumber;
    }

    Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.serialNumber = 0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.numberOfPages = 0;
        this.serialNumber = 0;
    }

    Book(String title) {
        this.title = title;
        this.serialNumber = 0;
        this.numberOfPages = 0;
    }

    Book() {
        this.serialNumber = 0;
        this.numberOfPages = 0;
    }

    @Override
    public String toString() {
        if (author != null && numberOfPages != 0 && serialNumber != 0) {
            return "book " +
                    "titled '" + title + '\'' +
                    ", written by " + author +
                    ", consists of " + numberOfPages + " pages" +
                    ", serial number " + serialNumber + '.';
        }
        if (author != null && numberOfPages != 0) {
            return "book " +
                    "titled '" + title + '\'' +
                    ", written by " + author +
                    ", consists of " + numberOfPages + " pages.";
        }

        if (author != null && title != null) {
            return "book " +
                    "titled '" + title + '\'' +
                    ", written by " + author + ".";
        }
        if (title != null) {
            return "book " +
                    "titled '" + title + "'.";
        } else {
            return "It's not a book, mate!";
        }
    }
}