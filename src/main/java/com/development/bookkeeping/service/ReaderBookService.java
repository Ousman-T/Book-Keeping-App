package com.development.bookkeeping.service;

import com.development.bookkeeping.entity.BookEntity;
import com.development.bookkeeping.entity.ReaderBookEntity;

import java.util.List;
import java.util.Optional;

public interface ReaderBookService {
    List<ReaderBookEntity> findAllBooks();
    Optional<ReaderBookEntity> findById(Long id);
    ReaderBookEntity saveBook(ReaderBookEntity readerBookEntity);
    ReaderBookEntity updateBook(ReaderBookEntity readerBookEntity);
    public List<Optional<BookEntity>> findBooksByUserId(Long id);
    void deleteBook(Long id);
}
