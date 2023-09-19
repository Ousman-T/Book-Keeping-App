package com.development.bookkeeping.service;

import com.development.bookkeeping.entity.BookEntity;
import java.util.List;
import java.util.Optional;

public interface BookService {
    List<BookEntity> findAllBooks();
    Optional<BookEntity> findById(Long id);
    BookEntity saveBook(BookEntity bookEntity);
    BookEntity updateBook(BookEntity bookEntity);
    void deleteBook(Long id);
}
