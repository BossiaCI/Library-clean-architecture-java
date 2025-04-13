package com.library.domain.models;

public class Book {
    private final int id;
    private final String title;
    private boolean available = true;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        if (!available) throw new IllegalStateException("Book already borrowed");
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
}
