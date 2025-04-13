package com.library.infrastructure.repositories;

import com.library.domain.interfaces.ReservationRepository;
import com.library.domain.models.Reservation;

import java.util.*;

public class InMemoryReservationRepository implements ReservationRepository {
    private final Map<Integer, Reservation> reservations = new HashMap<>();

    @Override
    public void save(Reservation reservation) {
        reservations.put(reservation.getBookId(), reservation);
    }

    @Override
    public void remove(Reservation reservation) {
        reservations.remove(reservation.getBookId());
    }

    @Override
    public Optional<Reservation> findByMemberId(int memberId) {
        return reservations.values().stream()
                .filter(reservation -> reservation.getMemberId() == memberId)
                .findFirst();
    }
}
