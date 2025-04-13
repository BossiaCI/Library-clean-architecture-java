package com.library.application.usecases;

import com.library.domain.models.Book;
import com.library.domain.interfaces.BookRepository;

public class BorrowBookUseCase {
    private final BookRepository bookRepository;

    public BorrowBookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void borrowBook(int bookId) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        book.borrow();
        bookRepository.save(book);
    }
}
