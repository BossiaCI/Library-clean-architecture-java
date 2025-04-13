package com.library.domain.models;

import java.time.LocalDateTime;

public class AuditTrail {
    private final String action;
    private final String entity;
    private final LocalDateTime timestamp;

    public AuditTrail(String action, String entity) {
        this.action = action;
        this.entity = entity;
        this.timestamp = LocalDateTime.now();
    }

    public String getAction() {
        return action;
    }

    public String getEntity() {
        return entity;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
