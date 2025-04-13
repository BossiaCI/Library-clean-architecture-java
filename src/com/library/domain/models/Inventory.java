package com.library.domain.models;

public class Inventory {
    private final int bookId;
    private final int quantity;

    public Inventory(int bookId, int quantity) {
        this.bookId = bookId;
        this.quantity = quantity;
    }

    // Getter methods for bookId and quantity
    public int getBookId() {
        return bookId;
    }

    public int getQuantity() {
        return quantity;
    }

}
