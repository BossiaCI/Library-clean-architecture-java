package com.library.infrastructure.repositories;

import com.library.domain.interfaces.InventoryRepository;
import com.library.domain.models.Inventory;

import java.util.HashMap;
import java.util.Map;

public class InMemoryInventoryRepository implements InventoryRepository {
    private final Map<Integer, Inventory> inventories = new HashMap<>();

    @Override
    public void save(Inventory inventory) {
        inventories.put(inventory.getBookId(), inventory);
    }
}
