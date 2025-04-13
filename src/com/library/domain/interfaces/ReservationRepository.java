package com.library.domain.interfaces;

import java.util.Optional;

import com.library.domain.models.Reservation;

public interface ReservationRepository {
    void save(Reservation reservation);
    Optional<Reservation> findByMemberId(int memberId);
}
