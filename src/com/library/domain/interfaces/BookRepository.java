package com.library.domain.interfaces;

import java.util.Optional;
import com.library.domain.models.Book;

public interface BookRepository {
    Optional<Book> findById(int id);
    void save(Book book);
}
