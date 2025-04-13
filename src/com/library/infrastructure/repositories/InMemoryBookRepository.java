package com.library.infrastructure.repositories;

import com.library.domain.interfaces.BookRepository;
import com.library.domain.models.Book;

import java.util.*;

public class InMemoryBookRepository implements BookRepository {
    private final Map<Integer, Book> books = new HashMap<>();

    public InMemoryBookRepository() {
        save(new Book(1, "1984"));
        save(new Book(2, "Brave New World"));
    }

    @Override
    public Optional<Book> findById(int id) {
        return Optional.ofNullable(books.get(id));
    }

    @Override
    public void save(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
}
