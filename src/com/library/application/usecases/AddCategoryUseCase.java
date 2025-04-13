package com.library.application.usecases;

import com.library.domain.models.BookCategory;
import com.library.domain.interfaces.BookCategoryRepository;

public class AddCategoryUseCase {
    private final BookCategoryRepository categoryRepository;

    public AddCategoryUseCase(BookCategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void execute(BookCategory category) {
        categoryRepository.save(category);
    }
}
