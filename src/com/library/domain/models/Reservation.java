package com.library.domain.models;

import java.time.LocalDateTime;

public class Reservation {
    private final int id;
    private final int memberId;
    private final int bookId;
    private final LocalDateTime reservedAt;

    public Reservation(int id, int memberId, int bookId) {
        this.id = id;
        this.memberId = memberId;
        this.bookId = bookId;
        this.reservedAt = LocalDateTime.now();
    }

    public int getId() { return id; }
    public int getMemberId() { return memberId; }
    public int getBookId() { return bookId; }
    public LocalDateTime getReservedAt() { return reservedAt; }
}
