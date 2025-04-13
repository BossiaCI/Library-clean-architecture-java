package com.library.application.usecases;

import com.library.domain.models.Book;
import com.library.domain.interfaces.BookRepository;

public class ReturnBookUseCase {
    private final BookRepository bookRepository;

    public ReturnBookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void returnBook(int bookId) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        book.returnBook();
        bookRepository.save(book);
    }
}
