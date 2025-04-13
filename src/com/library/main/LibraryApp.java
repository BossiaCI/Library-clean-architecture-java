package com.library.main;

import com.library.application.usecases.*;
import com.library.infrastructure.repositories.*;

public class LibraryApp {
    public static void main(String[] args) {
        var bookRepo = new InMemoryBookRepository();
        var memberRepo = new InMemoryMemberRepository();
        var reservationRepo = new InMemoryReservationRepository();

        var addBook = new AddBookUseCase(bookRepo);
        var borrowBook = new BorrowBookUseCase(bookRepo);
        var returnBook = new ReturnBookUseCase(bookRepo);
        var registerMember = new RegisterMemberUseCase(memberRepo);

        addBook.addBook(new Book(3, "Fahrenheit 451"));
        var member = new Member(1, "Alice");

        registerMember.registerMember(member);
        borrowBook.borrowBook(3);

        System.out.println("Book borrowed successfully!");
        returnBook.returnBook(3);
        System.out.println("Book returned successfully!");
    }
}
