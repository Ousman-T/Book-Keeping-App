package com.development.bookkeeping.controller;

import com.development.bookkeeping.entity.BookEntity;
import com.development.bookkeeping.service.BookService;
import com.development.bookkeeping.service.ReaderBookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;
    private final ReaderBookService readerBookService;

    public BookController(BookService bookService, ReaderBookService readerBookService) {
        this.bookService = bookService;
        this.readerBookService = readerBookService;
    }
    @GetMapping
    public List<BookEntity> findAllReaders(){
        return bookService.findAllBooks();
    }
    @GetMapping("/{id}")
    public Optional<BookEntity> findBookById(@PathVariable("id") Long id){
        return bookService.findById(id);
    }
    @PostMapping
    public ResponseEntity<BookEntity> saveBook(@RequestBody BookEntity bookEntity){
        try{
            BookEntity savedBook = bookService.saveBook(bookEntity);
            return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
//        return bookService.saveBook(bookEntity);
    }
    @PutMapping("/{id}")
    public BookEntity updateBook(@PathVariable Long id,@RequestBody BookEntity bookEntity){
        return bookService.updateBook(bookEntity);

    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Long id){bookService.deleteBook(id);}


}
