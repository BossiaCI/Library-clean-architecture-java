package com.library.domain.models;

public class LateFee {
    private final double amount;
    private final Book book;
    
    public LateFee(Book book, double amount) {
        this.book = book;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Book getBook() {
        return book;
    }
}
