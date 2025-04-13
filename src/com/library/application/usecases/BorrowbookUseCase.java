package com.library.application.usecases;

import com.library.domain.models.Book;
import com.library.domain.interfaces.BookRepository;
import com.library.domain.models.LateFee;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class BorrowBookUseCase {
    private final BookRepository bookRepository;

    public BorrowBookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public LateFee borrowBook(int bookId, LocalDate borrowDate, LocalDate returnDate) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        // check if book is overdue
        if(returnDate.isAfter(borrowDate.plusWeeks(2))){
            long daysLate = ChronoUnit.DAYS.between(borrowDate.plusWeeks(2), returnDate);
            double fee = daysLate * 0.5; // 0.5€ per day late
            return new LateFee(book, fee);
        }
        book.borrow();
        bookRepository.save(book);
        return null;
    }
}
