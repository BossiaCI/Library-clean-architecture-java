package com.library.domain.services;

import com.library.domain.models.Book;

import java.util.List;
import java.util.stream.Collectors;

public class SearchService {
    public List<Book> searchBooksByTitle(List<Book> books, String title) {
        return books.stream()
                    .filter(book -> book.getTitle().contains(title))
                    .toList();
                    // .collect(Collectors.toList());
    }

    public List<Book> filterBooksByCategory(List<Book> books, String category) {
        return books.stream()
                    .filter(book -> book.getCategory().equals(category))
                    .toList();
                    // .collect(Collectors.toList());
    }
}
