package com.library.infrastructure.repositories;

import com.library.domain.interfaces.LoanHistoryRepository;
import com.library.domain.models.LoanHistory;

import java.util.HashMap;
import java.util.Map;

public class InMemoryLoanHistoryRepository implements LoanHistoryRepository {
    private final Map<Integer, LoanHistory> loanHistories = new HashMap<>();

    @Override
    public void save(LoanHistory loanHistory) {
        loanHistories.put(loanHistory.getBookId(), loanHistory);
    }
}
