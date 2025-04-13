package com.library.domain.services;

import com.library.domain.interfaces.AuditTrailRepository;
import com.library.domain.models.AuditTrail;

public class AuditTrailService {
    private final AuditTrailRepository auditTrailRepository;

    public AuditTrailService(AuditTrailRepository auditTrailRepository) {
        this.auditTrailRepository = auditTrailRepository;
    }

    public void logAction(String action, String entity) {
        AuditTrail auditTrail = new AuditTrail(action, entity);
        auditTrailRepository.log(auditTrail);
    }
}
