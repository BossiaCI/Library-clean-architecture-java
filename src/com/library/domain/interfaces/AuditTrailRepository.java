package com.library.domain.interfaces;

import com.library.domain.models.AuditTrail;

public interface AuditTrailRepository {
    void log(AuditTrail auditTrail);
}
