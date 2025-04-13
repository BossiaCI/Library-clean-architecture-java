package com.library.domain.interfaces;

import com.library.domain.models.Inventory;

public interface InventoryRepository {
    void save(Inventory inventory);
}
