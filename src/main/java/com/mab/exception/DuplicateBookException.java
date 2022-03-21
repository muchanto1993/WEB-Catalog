package com.mab.exception;

import com.mab.dto.Book;

import lombok.Getter;

@Getter
public class DuplicateBookException extends RuntimeException {

    private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }

}
