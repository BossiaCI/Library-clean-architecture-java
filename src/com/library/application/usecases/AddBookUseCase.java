package com.library.application.usecases;

import com.library.domain.models.Book;
import com.library.domain.interfaces.BookRepository;

public class AddBookUseCase {
    private final BookRepository bookRepository;

    public AddBookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }
}
