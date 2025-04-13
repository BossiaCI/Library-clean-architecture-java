package com.library.domain.models;

import java.time.LocalDateTime;
// Fine and Payment System

public class Fine {
    private final int userId;
    private final double amount;
    private final LocalDateTime issueDate;

    public Fine(int userId, double amount) {
        this.userId = userId;
        this.amount = amount;
        this.issueDate = LocalDateTime.now();
    }

    // Getter methods for userId, amount, issueDate
    public int getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }
    
}
