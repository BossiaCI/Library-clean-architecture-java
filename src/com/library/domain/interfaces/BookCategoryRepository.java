package com.library.domain.interfaces;

import com.library.domain.models.BookCategory;

public interface BookCategoryRepository {
    void save(BookCategory category);
}
