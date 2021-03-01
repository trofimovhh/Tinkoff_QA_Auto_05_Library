package com.company;

public class Main {

    public static void main(String[] args) {
        Book bible = new Book("Bible");
        Book atomicHabits = new Book("Atomic habits", "James Clear");
        Book martinEden = new Book("Martin Eden", "Jack London", 444);
        Book dottir = new Book("Dottir", "Katrin Davidsdottir", 251, 203);
        Book modernOperatingSystems = new Book("Modern Operating Systems", "Andrew Tanenbaum", 1101, 101);
        Book mindset = new Book("Mindset", "Carol S. Dweck", 320);
        Book chasingExcellence = new Book("Chasing Excellence", "Ben Bergeron");
        Book grit = new Book("Grit");
        Book[] myLibrary = new Book[]{bible, atomicHabits, martinEden, dottir, modernOperatingSystems, mindset, chasingExcellence, grit};
        Reader myReader = new Reader();
        Book myNextReading = myReader.choiceBook(myLibrary);
        myReader.readBook(myNextReading);
        myReader.rateBook(myNextReading);
    }
}
