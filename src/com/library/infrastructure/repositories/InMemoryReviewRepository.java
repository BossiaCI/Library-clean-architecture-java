package com.library.infrastructure.repositories;

import com.library.domain.interfaces.ReviewRepository;
import com.library.domain.models.Review;

import java.util.HashMap;
import java.util.Map;

public class InMemoryReviewRepository implements ReviewRepository {
    private final Map<Integer, Review> reviews = new HashMap<>();

    @Override
    public void save(Review review) {
        reviews.put(review.getBookId(), review);
    }
}
