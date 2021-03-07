package com.company;

import java.util.Random;

public class Reader {
    void readBook(Book book) {
        if (book.title == null) {
            System.out.println("There is no book to read!");
        } else {
            System.out.println("I've read the " + book.toString());
        }
    }

    public Book choiceBook(Book[] bookArray) {
        final Random choiceBookRandom = new Random();
        return bookArray[choiceBookRandom.nextInt(bookArray.length)];
    }

    void rateBook(Book bookToRate) {
        String review;
        if (bookToRate.title == null) {
            bookToRate.title = "";
        }
        if (bookToRate.author == null) {
            bookToRate.author = "";
        }
        final Random rateBookRandom = new Random();
        String title = bookToRate.title;
        int titleLength = title.length();
        String author = bookToRate.author;
        int authorNameLength = author.length();
        int numOfPages = bookToRate.numberOfPages;
        int serialNumber = bookToRate.serialNumber;
        boolean noTitle = false;
        if (titleLength == 0) {
            noTitle = true;
            titleLength -= rateBookRandom.nextInt(10);
        }
        if (authorNameLength == 0) {
            authorNameLength -= rateBookRandom.nextInt(10);
        }
        if (numOfPages == 0) {
            numOfPages -= rateBookRandom.nextInt(10);
        }
        if (serialNumber == 0) {
            numOfPages -= rateBookRandom.nextInt(10);
        }
        int score = titleLength + authorNameLength + numOfPages + serialNumber;
        if (noTitle) {
            review = "My rate for the book is " + score + " points.";
        } else {
            review = "My rate for the '" + bookToRate.title + "' book is " + score + " points.";
        }
        System.out.println(review);
    }
}
