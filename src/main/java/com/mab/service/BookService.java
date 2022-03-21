package com.mab.service;

import java.util.Collection;

import com.mab.dto.Book;

public interface BookService {

    Collection<Book> getBooks();

    Book addBook(Book book);

}
