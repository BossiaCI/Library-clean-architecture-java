package com.library.infrastructure.repositories;

import com.library.domain.interfaces.FineRepository;
import com.library.domain.models.Fine;

import java.util.HashMap;
import java.util.Map;

public class InMemoryFineRepository implements FineRepository {
    private final Map<Integer, Fine> fines = new HashMap<>();

    @Override
    public void save(Fine fine) {
        fines.put(fine.getUserId(), fine);
    }
}
