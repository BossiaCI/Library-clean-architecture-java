package com.library.application.usecases;

import com.library.domain.models.Book;
import com.library.domain.models.Member;
import com.library.domain.interfaces.BookRepository;
import com.library.domain.interfaces.ReservationRepository;
import com.library.domain.services.NotificationService;
import com.library.domain.models.Reservation;

import java.time.LocalDateTime;

public class ReserveBookUseCase {
    private final BookRepository bookRepository;
    private final ReservationRepository reservationRepository;
    private final NotificationService notificationService;

    public ReserveBookUseCase(BookRepository bookRepository, ReservationRepository reservationRepository) {
        this.bookRepository = bookRepository;
        this.reservationRepository = reservationRepository;
        this.notificationService = new NotificationService();
    }

    public void reserveBook(int bookId, Member member) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        // Create reservation
        Reservation reservation = new Reservation(reservationRepository.getNextId(), member, book);
        reservationRepository.save(reservation);

        // Notify member
        notificationService.sendReservationAvailableNotification(member.getEmail());
    }
}
