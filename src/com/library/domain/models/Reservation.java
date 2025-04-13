package com.library.domain.models;

import java.time.LocalDateTime;

public class Reservation {
    private final int id;
    private final Member member;
    private final Book book;
    private final LocalDateTime reservedAt;

    public Reservation(int id, Member member, Book book) {
        this.id = id;
        this.member = member;
        this.book = book;
        this.reservedAt = LocalDateTime.now();
    }

    public int getId() { return id; }
    public Member getMember() { return member; }
    public Book getBook() { return book; }
    public LocalDateTime getReservedAt() { return reservedAt; }
}
