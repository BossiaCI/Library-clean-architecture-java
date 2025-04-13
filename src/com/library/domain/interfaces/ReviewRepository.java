package com.library.domain.interfaces;

import com.library.domain.models.Review;

public interface ReviewRepository {
    void save(Review review);
}
