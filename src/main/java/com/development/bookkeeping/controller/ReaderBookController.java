package com.development.bookkeeping.controller;


import com.development.bookkeeping.entity.BookEntity;
import com.development.bookkeeping.entity.ReaderBookEntity;
import com.development.bookkeeping.service.ReaderBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/readerList")
public class ReaderBookController {

    private final ReaderBookService readerBookService;

    public ReaderBookController(ReaderBookService readerBookService) {
        this.readerBookService = readerBookService;
    }
    @PostMapping
    public ReaderBookEntity saveBook(@RequestBody ReaderBookEntity readerBookEntity){
        return readerBookService.saveBook(readerBookEntity);
    }

    @GetMapping("/users/{id}")
    public List<Optional<BookEntity>> getReaderBooks(@PathVariable("id") Long id){ return readerBookService.findBooksByUserId(id);}


}
