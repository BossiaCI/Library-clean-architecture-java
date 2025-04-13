package com.library.domain.models;

import java.time.LocalDateTime;

public class LoanHistory {
    private final int userId;
    private final int bookId;
    private final LocalDateTime loanDate;
    private final LocalDateTime returnDate;

    public LoanHistory(int userId, int bookId, LocalDateTime loanDate, LocalDateTime returnDate) {
        this.userId = userId;
        this.bookId = bookId;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    // Getter methods for userId, bookId, loanDate, returnDate

    public int getUserId() {
        return userId;
    }

    public int getBookId() {
        return bookId;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }
    
}
