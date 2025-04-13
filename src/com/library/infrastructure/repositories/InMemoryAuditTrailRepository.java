package com.library.infrastructure.repositories;

import com.library.domain.interfaces.AuditTrailRepository;
import com.library.domain.models.AuditTrail;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAuditTrailRepository implements AuditTrailRepository {
    private final List<AuditTrail> auditTrails = new ArrayList<>();

    @Override
    public void log(AuditTrail auditTrail) {
        auditTrails.add(auditTrail);
    }

    public List<AuditTrail> getAuditTrails() {
        return auditTrails;
    }
}
