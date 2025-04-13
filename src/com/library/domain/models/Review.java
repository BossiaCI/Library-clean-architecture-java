package com.library.domain.models;

public class Review {
    private final int bookId;
    private final int userId;
    private final int rating;
    private final String comment;

    public Review(int bookId, int userId, int rating, String comment) {
        this.bookId = bookId;
        this.userId = userId;
        this.rating = rating;
        this.comment = comment;
    }

    // Getter methods for bookId, userId, rating, comment
    public int getBookId() {
        return bookId;
    }

    public int getUserId() {
        return userId;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
    
}
