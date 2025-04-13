package com.library.infrastructure.repositories;

import com.library.domain.interfaces.BookCategoryRepository;
import com.library.domain.models.BookCategory;

import java.util.HashMap;
import java.util.Map;

public class InMemoryBookCategoryRepository implements BookCategoryRepository {
    private final Map<String, BookCategory> categories = new HashMap<>();

    @Override
    public void save(BookCategory category) {
        categories.put(category.getName(), category);
    }
}
