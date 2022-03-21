package com.mab.repository;

import java.util.Collection;
import java.util.Optional;

import com.mab.repository.model.BookData;

public interface BookRepository {

    Collection<BookData> findAll();

    Optional<BookData> findById(String isbn);

    BookData add(BookData book);

}
