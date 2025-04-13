package com.library.domain.interfaces;

import com.library.domain.models.LoanHistory;

public interface LoanHistoryRepository {
    void save(LoanHistory loanHistory);
}
