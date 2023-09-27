package com.development.bookkeeping.service.impl;

import com.development.bookkeeping.entity.BookEntity;
import com.development.bookkeeping.entity.ReaderBookEntity;
import com.development.bookkeeping.repository.BookRepository;
import com.development.bookkeeping.repository.ReaderBookRepository;
import com.development.bookkeeping.service.ReaderBookService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReaderBookImpl implements ReaderBookService {
    private final ReaderBookRepository readerBookRepository;
    private final BookRepository bookRepository;

    public ReaderBookImpl(ReaderBookRepository readerBookRepository, BookRepository bookRepository){
        this.readerBookRepository = readerBookRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public List<ReaderBookEntity> findAllBooks(){
        return readerBookRepository.findAll();
    }
    @Override
    public Optional<ReaderBookEntity> findById(Long id){
        return readerBookRepository.findById(id);
    }

    @Override
    public ReaderBookEntity saveBook(ReaderBookEntity readerBookEntity) {
        return readerBookRepository.save(readerBookEntity);
    }

    @Override
    public ReaderBookEntity updateBook(ReaderBookEntity readerBookEntity){
        return readerBookRepository.save(readerBookEntity);
    }
    @Transactional
    public List<Optional<BookEntity>> findBooksByUserId(Long id){
         List<ReaderBookEntity> readerBookEntityList = findAllBooks();
         List<ReaderBookEntity> userBookList = readerBookEntityList.stream().filter(r -> r.getReaderId().equals(id)).collect(Collectors.toList());
         List<Optional<BookEntity>> bookList = new ArrayList<>();
         userBookList.stream().forEach(b -> {bookList.add(bookRepository.findById(b.getBookId()));});
         return bookList;
    }
    @Override
    public void deleteBook(Long id){
        readerBookRepository.deleteById(id);
    }
}
