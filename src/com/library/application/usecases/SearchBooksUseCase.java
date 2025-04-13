package com.library.application.usecases;

import com.library.domain.interfaces.BookRepository;
import com.library.domain.models.Book;

import java.util.List;
import java.util.stream.Collectors;

public class SearchBooksUseCase {
    private final BookRepository bookRepository;

    public SearchBooksUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> searchBooksByTitle(String title) {
        return bookRepository.findAll().stream()
                .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }
}
