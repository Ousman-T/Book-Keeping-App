package com.development.bookkeeping.service.impl;

import com.development.bookkeeping.entity.BookEntity;
import com.development.bookkeeping.repository.BookRepository;
import com.development.bookkeeping.service.BookService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class BookServiceImpl implements  BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookEntity> findAllBooks(){
        return bookRepository.findAll();
    }
    @Override
    public Optional<BookEntity> findById(Long id){
        return bookRepository.findById(id);
    }

    @Override
    public BookEntity saveBook(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }

    @Override
    public BookEntity updateBook(BookEntity bookEntity){
        return bookRepository.save(bookEntity);
    }
    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
